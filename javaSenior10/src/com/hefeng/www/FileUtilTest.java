package com.hefeng.www;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**/
public class FileUtilTest {
    public static void main(String[] args) {
        File srcFile = new File("javaSenior10\\2.jpg");
        File destFile = new File("javaSenior10\\3.jpg");


        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
