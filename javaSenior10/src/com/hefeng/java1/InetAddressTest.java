package com.hefeng.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet2);

            InetAddress inet4 = InetAddress.getLocalHost();
            System.out.println(inet4);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
