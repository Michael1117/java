package com.hefeng.www;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PicTest {

    // 图片的加密
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("2.jpg");
            fos = new FileOutputStream("3se.jpg");

            byte[] buffer = new byte[20];

            int len;

            while ((len = fis.read(buffer)) != -1) {

                // 字节数组进行修改  错误的
                /*for(byte b: buffer) {
                    b = (byte) (b ^ 5);
                }*/
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }

                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    // 图片的解密
    @Test
    public void test2() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("3se.jpg");
            fos = new FileOutputStream("4.jpg");

            byte[] buffer = new byte[20];

            int len;

            while ((len = fis.read(buffer)) != -1) {

                // 字节数组进行修改  错误的
                /*for(byte b: buffer) {
                    b = (byte) (b ^ 5);
                }*/
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }

                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
