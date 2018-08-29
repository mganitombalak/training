package com.aerotivelabs;

import java.io.File;

public class STFolderSizeCalculator {

    public static long sizeOf(final File file) {
        long totalSize = 0;

        if (file.isFile()) {
            totalSize += file.length();
        } else {
            final File[] subFiles = file.listFiles();
            if (subFiles != null) {
                for (final File f : subFiles) {
                    totalSize += STFolderSizeCalculator.sizeOf(f);
                }
            }
        }
        return totalSize;
    }
}
