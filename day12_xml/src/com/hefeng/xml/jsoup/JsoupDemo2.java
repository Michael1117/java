package com.hefeng.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        // 2 .获取Document对象，根据xml文档获取

        // 2.1 获取student.xml的path
        String path = JsoupDemo2.class.getClassLoader().getResource("student.xml").getPath();

        // parse () : 解析xml或html字符串
        /*String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<students>\n" +
                "    <student number=\"heima_0001\">\n" +
                "        <name>tom</name>\n" +
                "        <age>18</age>\n" +
                "        <sex>male</sex>\n" +
                "    </student>\n" +
                "    <student number=\"heima_0001\">\n" +
                "        <name>jack</name>\n" +
                "        <age>18</age>\n" +
                "        <sex>female</sex>\n" +
                "    </student>\n" +
                "</students>\n" +
                "\n";
        Document document = Jsoup.parse(str);
        System.out.println(document);*/

        // 3.parse (URL url, int timeoutMillis): 通过网络路径获取指定的html或xml的文档对象
        URL url = new URL("http://www.52studyit.com/thread-4012-1-1.html");  // 代表一个资源路径

        Document document = Jsoup.parse(url, 10000);

        System.out.println(document);
    }
}
