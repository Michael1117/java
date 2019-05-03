package com.hefeng.www;


import org.junit.Test;

import java.io.*;

public class FileReaderWriterTest {
    public static void main(String[] args) {
        //File file = new File("hello.txt");  // 相对于当前工程
        //System.out.println(file.getAbsoluteFile());  // D:\java\hello.txt

        //File file1 = new File("javaSenior09\\hello.txt");
        //System.out.println(file1.getAbsoluteFile());  // D:\java\javaSenior09\hello.txt
    }

    // alt + enter
    @Test
    public void testFileReader() {
        // 1. 实例化File类的对象，指明要操作的文件
        // ctrl + alt + t   try-catch-finally
        FileReader fr = null;
        try {
            File file = new File("hello.txt");  // 相对于当前Module下
            //System.out.println(file.getAbsoluteFile());  // D:\java\javaSenior09\hello.txt

            // 2. 提供具体的流 alt + enter
            fr = new FileReader(file);

            // 3. 数据的读入
            // read(): 返回读入的一个字符。如果达到文件末尾，返回-1
        /*int data = fr.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fr.read();
        }*/

            // 方式二：
            int data;
            while ((data = fr.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 流的关闭
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    // 对read() 操作升级： 使用read的方法
    @Test
    public void testFileReader1() {
        // 1. File类的实例化
        FileReader fr = null;
        try {
            File file = new File("hello.txt");

            // 2. FileReader流的实例化
            fr = new FileReader(file);
            // 3. 读入的操作
            char[] cbuf = new char[5];
            //System.out.println(cbuf);
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                // 错误方式
                /*for (int i = 0; i < cbuf.length; i++) {
                    System.out.print(cbuf[i]);
                }*/


                //System.out.println(len);
                // 正确方式
                /*for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);
                }
                */
                // 错误方式二
                //String str = new String(cbuf);
                //System.out.println(str);
                // 正确方式
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 资源的关闭
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    // 从内存中写出数据到硬盘的文件里。

    @Test
    public void testFileWriter() throws IOException {
        // 1. 提供File类的对象，指明写出到的文件
        File file = new File("hello1.txt");

        // 2. 提供FileWriter的对象，用于数据的写出
        FileWriter fw = new FileWriter(file, false);  // 不在原有的内容之后添加

        // 3. 写出的操作
        fw.write("I have a dream!\n");
        fw.write("You need to have a dream");

        // 4. 流资源的关闭
        fw.close();
    }

    @Test
    public void testFileReaderFileWriter() {
        // 1.创建File类的对象，指明读入和写出的文件
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");


            // 2. 创建输入流和输出流
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            // 3. 数据的读入和写出操作

            char[] cbuf = new char[5];
            int len;  // 记录每次读入到cbuf数组中的字符的个数
            while ((len = fr.read(cbuf)) != -1) {

                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭流资源
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }


    @Test
    public void testFileReaderFileWriter1() {
        // 1.创建File类的对象，指明读入和写出的文件
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File srcFile = new File("2.jpg");
            File destFile = new File("3.jpg");


            // 2. 创建输入流和输出流
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            // 3. 数据的读入和写出操作

            char[] cbuf = new char[5];
            int len;  // 记录每次读入到cbuf数组中的字符的个数
            while ((len = fr.read(cbuf)) != -1) {

                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭流资源
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}


