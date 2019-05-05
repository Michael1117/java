package com.hefeng.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Document/Element 对象功能
 */
public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {


        // 1 获取student.xml的path
        String path = JsoupDemo3.class.getClassLoader().getResource("student.xml").getPath();

        // 2 获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        // 3. 获取元素对象

        Elements elements = document.getElementsByTag("students");

        System.out.println(elements);

        System.out.println("------------");

        // 3.2 获取属性名为id的元素对象
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);

        System.out.println("--------------");
        // 获取number 属性值为heima_0001 的元素对象
        Elements elements2 = document.getElementsByAttributeValue("number", "heima_0001");

        System.out.println(elements2);

        System.out.println("-----------");

        Element hee = document.getElementById("hee");

        System.out.println(hee);
    }
}
