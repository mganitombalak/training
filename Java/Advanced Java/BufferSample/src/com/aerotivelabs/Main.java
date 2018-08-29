package com.aerotivelabs;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) {

        try {
            RandomAccessFile raf = new RandomAccessFile(args[0],"rw");
            FileChannel fc = raf.getChannel();

            System.out.print("Press <Enter> to obtain the exclusive lock");
            System.in.read();
            if(System.in.available()==1)
            {
                System.in.read();
            }

            // Exclusive Lock

            FileLock lock=fc.lock();
            System.out.println("Obtained an exclusive lock on file : " + args[0]);
            Thread.sleep(15000);
            lock.release();
            System.out.println("Exclusive lock on file : " + args[0]+" has been released.");


            // Shared Lock

            System.out.print("Press <Enter> to obtain the shared lock");
            System.in.read();

            lock= fc.lock(0,Long.MAX_VALUE,true);
            Thread.sleep(15000);
            lock.release();
            System.out.println("Shared lock on file : " + args[0]+" has been released.");

            fc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        try {
//
//            FileInputStream fin = new FileInputStream("/Users/mganitombalak/Desktop/access_log");
//            FileChannel fcin = fin.getChannel();
//
//            FileOutputStream fout = new FileOutputStream("/Users/mganitombalak/Desktop/written.log");
//            FileChannel fcout = fout.getChannel();
//
//            ByteBuffer buf =  ByteBuffer.allocate(1024);
//
//            while((fcin.read(buf))!=-1){
//                buf.flip();
//                fcout.write(buf);
//                buf.clear();
//            }
//
//            fcin.close();
//            fcout.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            RandomAccessFile raf = new RandomAccessFile(args[0], "rw");
//            FileChannel channel = raf.getChannel();
//
//            ByteBuffer bbuf = ByteBuffer.allocate(1024);
//            channel.read(bbuf);
//            bbuf.flip();
//            Charset ascii = Charset.forName("US-ASCII");
//            CharBuffer cbuf = ascii.decode(bbuf);
//            char[] chars = new char[cbuf.limit()];
//            cbuf.get(chars);
//            for (char c : chars) {
//                System.out.print(c);
//            }
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
