package com.aerotivelabs;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File("/Users/mganitombalak/Downloads/");

        long startTime = System.currentTimeMillis();
        long size= STFolderSizeCalculator.sizeOf(f);
        long elapsedTime = System.currentTimeMillis()-startTime;

        System.out.println("Standart calculation of"
                +f+
                " : "+
                size +" bytes and calculated in " +
                elapsedTime+ " ms");

         startTime = System.currentTimeMillis();
         size= FJFolderSizeCalculator.sizeOf(f);
         elapsedTime = System.currentTimeMillis()-startTime;

        System.out.println("Fork/Join calculation of"
                +f+
                " : "+
                size +" bytes and calculated in " +
                elapsedTime+ " ms");

    }
}
