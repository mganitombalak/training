package com.aerotivelabs;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FJFolderSizeCalc {
    public static class SizeOfFileTask extends RecursiveTask<Long> {
        private final File file;

        public SizeOfFileTask(File file) {
            this.file = file;
        }

        @Override
        protected Long compute() {

            if (file.isFile()) {
                return this.file.length();
            } else {
                final List<SizeOfFileTask> fileSizeTasks = new ArrayList<>();
                final File[] subFilesAndFolders = file.listFiles();
                if (subFilesAndFolders != null) {
                    Arrays.stream(subFilesAndFolders).forEach(f -> {
                        final SizeOfFileTask soft = new SizeOfFileTask(f);
                        soft.fork();
                        fileSizeTasks.add(soft);
                    });
                }
                //return fileSizeTasks.stream().mapToLong(RecursiveTask<Long>::join).sum();
                long totalSize = 0;
                for (SizeOfFileTask f : fileSizeTasks) {
                    totalSize += f.join();
                }
                return totalSize;

            }
        }
    }

    public static long sizeOf(final File file) {
        final ForkJoinPool pool = ForkJoinPool.commonPool();
        try {
            return pool.invoke(new SizeOfFileTask(file));
        } finally {
            pool.shutdown();
        }
    }
}