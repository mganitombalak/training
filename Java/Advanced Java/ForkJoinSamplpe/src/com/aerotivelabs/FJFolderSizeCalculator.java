package com.aerotivelabs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FJFolderSizeCalculator {

    public static class SizeOfFileTask extends RecursiveTask<Long> {

        private final File file;

        public SizeOfFileTask(final File file) {
            this.file = file;
        }

        @Override
        protected Long compute() {

            if (file.isFile()) {
                return this.file.length();
            } else {
                final List<SizeOfFileTask> fileSizeTasks = new ArrayList<SizeOfFileTask>();
                final File[] subFiles = file.listFiles();
                if (subFiles != null) {
                    for (File subFile : subFiles) {
                        final SizeOfFileTask fileTask = new SizeOfFileTask(subFile);
                        fileTask.fork();
                        fileSizeTasks.add(fileTask);
                    }
                }
                long totalSize = 0;
                for (final SizeOfFileTask f : fileSizeTasks) {
                    totalSize += f.join();
                }
                return totalSize;
            }
        }
    }

    public static long sizeOf(final File file){
        final ForkJoinPool pool = ForkJoinPool.commonPool();
        try {
            return pool.invoke(new SizeOfFileTask(file));
        } finally {
            pool.shutdown();
        }
    }
}
