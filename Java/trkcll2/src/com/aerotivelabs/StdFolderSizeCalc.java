package com.aerotivelabs;

import java.io.File;
import java.util.Arrays;

public class StdFolderSizeCalc {

    public static long sizeOf(final File file) {
        long totalSize = 0;

        if (file.isFile()) {
            totalSize += file.length();
        } else {
            final File[] subFilesAndFolders = file.listFiles();
            if (subFilesAndFolders != null) {
                totalSize = Arrays.stream(subFilesAndFolders).mapToLong(StdFolderSizeCalc::sizeOf).sum();
            }
        }
        return totalSize;
    }
}
