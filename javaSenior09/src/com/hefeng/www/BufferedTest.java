package com.hefeng.www;

/*
 * 处理流之一： 缓冲流
 * */

import org.junit.Test;

import java.io.*;

public class BufferedTest {
    /*
     * 实现非文本文件的复制
     *
     * */
    @Test
    public void Buffered() {
        // 1.造文件
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File("2.jpg");
            File destFile = new File("4.jpg");

            // 2.造流
            // 2.1 造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            // 2.2 造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            // 3. 复制的细节： 读取、写入
            byte[] buffer = new byte[10];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        // 4. 资源关闭  先关闭外层的流， 再关闭内层的流


        // 说明：  关闭外层流的同时，内层流也会自动关闭
        /*fos.close();
        fis.close();*/


    }


    // 实现文件复制的方法
    public void copyFileWithBuffered(String srcPath, String destPath) {
        // 1.造文件
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            // 2.造流
            // 2.1 造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            // 2.2 造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            // 3. 复制的细节： 读取、写入
            byte[] buffer = new byte[15];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void testCopyFileWithBuffered() {
        long start = System.currentTimeMillis();
        String srcPath = "1.pdf";
        String destPath = "2.pdf";

        copyFileWithBuffered(srcPath, destPath);

        long end = System.currentTimeMillis();

        System.out.println("复制操作花费的时间为：" + (end - start));  // 115
    }

    /*
     *
     * */

    @Test
    public void testBufferedReaderBufferedWriter() {

        // 创建文件和相应的流
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("dbcp.txt")));

            bw = new BufferedWriter(new FileWriter(new File("dbcp1.txt")));

            // 读写操作
            // 方式一
            /*char[] cbuf = new char[1024];

            int len;
            while ((len = br.read(cbuf)) != -1) {
                bw.write(cbuf, 0, len);
                //bw.flush();
            }*/


            // 方式二

            String data;
            while ((data = br.readLine()) != null) {
                // 方法一
                // bw.write(data + "\n");  // data中不包含换行符
                // 方法二
                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // 关闭资源
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
