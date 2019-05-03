package com.hefeng.www;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 其他流
 * 1.标准输入，输出流
 * 2. 打印流
 * 3. 数据流
 *
 * */
public class OtherStreamTest {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);

            br = new BufferedReader(isr);

            while (true) {
                System.out.println("请输入字符串：");
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
                    System.out.println("程序结束");
                    break;
                }

                String uppercase = data.toUpperCase();
                System.out.println(uppercase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
   /* @Test
    public void test1() {



    }*/

}
