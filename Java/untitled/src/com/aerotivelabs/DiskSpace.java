package com.aerotivelabs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;

public class DiskSpace {

    public static class BlockSizeMatcherTask extends RecursiveTask<Boolean> {

        private final List<Integer> blocks;
        private static int blockSize;
        private static int fileSize;


        public BlockSizeMatcherTask(final List<Integer> blockList) {
            this.blocks = blockList;
        }

        @Override
        protected Boolean compute() {
            if (blocks.size() > 0) {
                int block1 = blocks.get(0);
                blocks.remove(0);
                int block2 = blocks.size() > 0 ? blocks.get(0) : 0;
                if(block2!=0) blocks.remove(0);
                boolean result = Math.abs(block2 - block1) * blockSize > fileSize;
                final List<BlockSizeMatcherTask> blockSizeTasks = new ArrayList<BlockSizeMatcherTask>();
                if (blocks.size() > 0 && !result) {
                    final BlockSizeMatcherTask fileTask = new BlockSizeMatcherTask(blocks);
                    fileTask.fork();
                    blockSizeTasks.add(fileTask);
                }
                for (final BlockSizeMatcherTask f : blockSizeTasks) {
                    result = result ? true : f.join();
                }
                return result;
            }
            return false;
        }
    }


    public static boolean isWritable(int blockSize, int fileSize, Set<Integer> occupiedSectors) {

        boolean result = occupiedSectors.size() == 0;
        if (!result && (blockSize <= 1000000 ||
                blockSize >= 1 ||
                fileSize < 1 ||
                fileSize <= blockSize ||
                occupiedSectors.size() <= 100000) &&
                occupiedSectors.parallelStream().allMatch(p -> p <= blockSize && p > 0)) {

            final ForkJoinPool pool = ForkJoinPool.commonPool();
            try {
                BlockSizeMatcherTask.blockSize = blockSize;
                BlockSizeMatcherTask.fileSize = fileSize;
                result = pool.invoke(new BlockSizeMatcherTask(new ArrayList<>(occupiedSectors.parallelStream().sorted().collect(Collectors.toList()))));
            } finally {
                pool.shutdown();
            }
        }
        return result;
    }
}