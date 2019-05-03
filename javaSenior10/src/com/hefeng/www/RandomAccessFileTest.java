package com.hefeng.www;

/*
 * RandomAccessFile的使用
 * 1. RandomAccessFile直接继承于java.lang.Object类，实现了DataInput和DataOutput接口
 * 2. RandomAccessFile既可以作为一个输入流，又可以作为一个输出流
 * */

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    @Test
    public void test1() {

        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("2.jpg"), "r");
            raf2 = new RandomAccessFile(new File("3.jpg"), "rw");

            byte[] buffer = new byte[1024];

            int len;

            while ((len = raf1.read(buffer)) != -1) {
                raf2.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (raf1 != null)
                    raf1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (raf2 != null)
                    raf2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //raf1.close();
    }

    @Test
    public void test2() {
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile("hello.txt", "rw");
            raf1.seek(3);
            raf1.write("xyz".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //raf1.close();
    }

    @Test
    public void test3() {
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile("hello.txt", "rw");

            raf1.seek(3);

            StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
            byte[] buffer = new byte[20];

            int len;

            while ((len = raf1.read(buffer)) != -1) {
                builder.append(new String(buffer, 0, len));
            }

            raf1.seek(3);
            raf1.write("xyz".getBytes());
            raf1.write(builder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
