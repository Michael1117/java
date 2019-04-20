##java

java

## 软件开发

​	软件，即一系列按照特定顺序组织的计算机**数据**和命令的集合。有**系统软件**和应用软件之分。

## 常用DOS命令

**dir**:列出当前目录下的文件以及文件夹

**md**: 创建目录

**rd**: 删除目录

**cd**: 进入指定目录

**cd..**:  退回上一级目录

cd\:  退回根目录

**del**: 

**exit**:





java语言

​	James Gosling团队在开发"Green"项目时，发现C**缺少**垃圾回收系统，还有可移植的安全性，分布程序设计和多线程功能。

​	Java语言的变量声明，操作符形式，参数传递，流程控制等方面和C语言，C++语言完全相同。它继承了C++语言面向对象技术的核心。舍弃了C语言中容易引起错误的**指针**(以引用取代)，运算符重载，多重继承（以接口取代），增加了垃圾回收器功能用于回收不再被引用的对象所占用的内存空间。

​	Java语言是**强制面向对象的**。Java语言提供类，接口和继承等原语，为了简单起见，只支持类之间的单继承，但支持接口之间的多继承，并支持类与接口之间的实现机制(implements)。

​	Java语言是**分布式**的。Java语言支持Internet应用开发，在基本的Java应用编程接口中有一个网络应用编程接口(java net),它提供了用于网络应用编程的类库，包括URL,URLConnection,Socket，ServerSocket等。Java的RMI（远程方法激活）机制也是开发分布式应用的重要手段。

​	Java语言是**健壮的**。Java的**强类型机制**，异常处理，**垃圾的自动收集**等是Java程序健壮性的重要保证。对指针的丢弃是Java的明智选择。

##	Java语言的特点

特点1：面向对象

​	两个基本概念：类，对象

​	三大特性：封装，继承，多态

特点2： 健壮性

​	吸收了C/C++语言的优点，但取掉了其影响程序健壮性的部分（如指针，内存的申请与释放），提供了一个相对安全的内存管理和访问机制。

特点3：跨平台

​	跨平台：通过Java语言编写的应用程序在不同的系统平台上都可以运行。"Write once, Run Anywhere"

​	原理： 只要在需要运行java应用程序的操作系统上，先安装一个java虚拟机（JVM Java Virtual Machine）即可。由JVM来负责Java程序在系统中的运行。

**Java语言核心机制1：**

​	**JVM是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指令，管理数据，内存，寄存器。**

​	对于不同的平台，有不同的虚拟机。

​	只有平台提供了对应的java虚拟机，java程序才可在此平台运行。

​	Java虚拟机机制屏蔽了底层运行平台的差别，实现了"一次编译，到处运行"。

​		**硬件-->操作系统-->JVM-->字节码文件-->用户user**

Java语言核心机制2：

​	**不再使用的内存空间应回收---垃圾回收**

​		在C/C++等语言中，由程序员负责回收无用内存。

​		Java语言消除了程序员回收无用内存空间的责任：它提供一种系统级线程跟踪存储空间的分配情况。并在JVM空闲时，检查并释放那些可被释放的存储空间。

​	**垃圾回收再java程序运行过程中自动运行，程序员无法精确控制和干预**

## JDK，JRE

​	**JDK(Java Development Kit） Java开发工具包**

​		JDK是提供给Java开发人员使用的，其中包含了**java的开发工具**，也包括了JRE。

​		开发工具：编译工具（javac.exe）打包工具（jar.exe）

​	**JRE(Java Runtime Enviroment) Java运行环境**

​		包括**Java虚拟机**（JVM Java Virtual Machine）和Java程序所需的**核心类库**等，如果想要运行两个开发好的Java程序，只需要安装JRE即可。

​	简单而言，使用JDK的开发工具完成的java程序，交给JRE去运行。



**JRE** = Java Virtual Machine + lang and util Base Libraries + Other Base Libraries + Integration Libraries + User Interface Toolkits + Deployment 



**JDK** = JRE + Tools&Tool APIs + Java Language



**Compact Profiles** = lang and util Base Libraries + Other Base Libraries + Integration Libraries

**Java SE API** = Compact Profiles + User Interface Toolkits

​	

**JDK = JRE + 开发工具集（例如Javac编译工具）**

**JRE = JVM + JavaSE 标准库**



文档注释

/**	

@author

@version

*/

javadoc -d -author -version HelloWorld.java



## 第二章



变量的概念：

​	**内存中的一个存储区域**

​	**该区域的数据可以在同一类型范围内不断变化**

​	**变量是程序中最基本的存储单元。包含变量类型，变量名和存储的值。**

变量的作用：

​	用于在内存中保存数据

使用变量注意：

​	**Java中每个变量必须先声明，后使用**

​	使用变量名来访问这块区域的数据

​	变量的作用域： 其定义所在的一对{}内

​	变量只有在其作用域内才有效

​	同一个作用域内，不能定义重名的变量



**变量的分类--按数据类型**

对于每一种数据都定义了明确的具体数据类型（强类型语言），在内存中分配了不同大小的内存空间

数据类型：基本数据类型（primitive type）和 引用数据类型（reference type） 



**基本数据类型**：

​	数值型: 整数类型（byte， short, int ,long） /  浮点类型（float, double）

​	字符型(char)

​	布尔型(boolean)

**引用数据类型:**

​	类(class)

​	接口(interface)

​	数组（[]）

**按声明的位置不同分为：**

​	在方法体外，类体内声明的变量称为**成员变量**

​	在方法体内声明的变量称为**局部变量**

成员变量：实例变量（不以static修饰）， 类变量（以static修饰）

局部变量：形参（方法，构造器中定义的变量），方法局部变量（在方法内定义），代码块局部变量（在代码块内定义）

**注意：二者在初始化值方面的异同**：

​	同： 都有生命周期

​	异： 局部变量除形参外，需显示初始化

## 整数类型： byte, short ,int ,long

Java各整数类型有固定的表数范围和字段长度，不受具体OS的影响，以保证java程序的可移植性。

**Java的整形常量默认为int型，声明long型常量须后加'l'或'L'。**

**Java程序中变量通常声明为int型**，除非不足以表示较大的数，才使用Long。



| 类型  | 占用存储空间   | 表数范围                                 |
| ----- | -------------- | ---------------------------------------- |
| byte  | 1字节 = 8bit位 | -128~127                                 |
| short | 2字节          | -2<sup>15</sup>~2<sup>15</sup>-1         |
| int   | 4字节          | -2<sup>31</sup>~2<sup>31</sup>-1(约21亿) |
| long  | 8字节          | -2<sup>63</sup>~2<sup>63</sup>-1         |

bit: 计算机中的最小存储单位。byte:计算机中基本存储单元

```java
public class VariableTest{
    public static void main(){
        int number1;
        number1 = 10;
        int number2 = 20;
        int number3 = number1 + number2;
        System.out.println("Number3= " + number3);
        
        int number4 = 50;
        int number5 = number4 - number3;
        System.out.println("Number5 = " + number5)
    }
}
```



## 浮点类型











|      |      |      |
| ---- | ---- | ---- |
|      |      |      |
|      |      |      |





## 字符类型



## 面向对象与面向过程

**面向过程（POP）与面向对象（OOP）**

二者都是一种思想，面向对象是相对于面向过程而言的。面向过程，强调的是功能行为，以函数为最小单位，考虑怎么做。面向对象，将 功能封装进对象，强调具备了功能的对象，以类/对象为最小单位，考虑谁来做。

面向对象更加强调运用人类在日常的思维逻辑中采用的思想方法与原则，如抽象，分类，继承，聚合，多态

**面向对象的三大特征**

​	封装 (Encapsulation)

​	继承(Inheritance)

​	多态(Polymorphism)

面向过程（Procedure Oriented Programming）

面向对象 (Object Oriented Programming)



## 面向对象的思想概述

**类 和 对象是面向对象的核心概念**

​	类是对一类事物的描述，是抽象的，概念上的定义

​	对象是实际存在的该类事物的每个个体，因而也称为实例（instance）

**属性**： 对应类中的成员变量

**方法**： 对应类中的成员方法



field = 属性 = 成员变量    Method = (成员)方法 = 函数



## 面向对象多态

父类的引用指向子类的对象

编译时看左边，运行时看右边。



为什么super或this调用语句只能作为构造器中的第一句出现？

​	无论通过哪个构造器创建子类对象，需要保证先初始化父类

​	目的： 当子类继承父类后，“继承”父类中所有的属性和方法，因此子类有必要知道父类如何为对象进行初始化。



























































Java中关于继承：

​	**一个子类只能有一个父类**

​	**一个父类可以派生出多个子类**

​	**子父类是相对的概念**

​	**子类直接继承的父类，称为：直接父类。间接继承的父类：间接父类**

​	**子类继承父类后，就获取了直接父类以及所有间接父类中声明的属性和方法**



1.如果没有显示的声明一个类的父类，则此类继承于java.lang.Object类

2.所有的类都直接或间接继承于java.lang.Object类。

3.所有的java类具有java.lang.Object类声明的功能。

## 线程

每一个线程都有一个虚拟机栈和程序计数器。



方法区和堆是一个进程一份，多个线程要共享方法区和堆。



实现多线程的方式

​	方式1： 继承Thread的方式

​	方式2：实现Runnable接口的方式



Thread类也实现了Runnable接口

两种方式都需要重写run(),将线程要执行的逻辑声明在run()中





## JDBC

**mysql 8连接jdbc**

注意要先下载：mysql-connector-java-8.0.11.jar

```java
package com.hefeng.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcDemo {
    public static void main(String[] args) {
        String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/itcast?useSSL=false&serverTimezone=Asia/Shanghai";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "12345678";

        try {
            Class.forName(DB_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement statement = connection.createStatement();

            String sql = "update student set salary=5000 where id=1";

            //statement.execute("USE `world`");
            int count = statement.executeUpdate(sql);

            System.out.println(count);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```



3.详解各个对象：

1.DriverManager: 驱动管理对象

* 功能：

​	 1.注册驱动

​		static void registerDriver(Driver driver) : 注册与给定的驱动程序 DriverManager

​		写代码使用： Class.forName("com.mysql.cj.jdbc.Driver")

​	  2.获取数据库连接

2.Connection: 数据库连接对象

3.Statement：执行sql的对象

4.ResultSet: 结果集对象

5.PrepareStatement: 执行sql的对象





alt + insert



id 

name 

age 

gender

address

math 

english



SELECT * FROM student LIMIT 0, 3  ---第一页

SELECT * FROM student LIMIT 3, 3  ---第二页

SELECT * FROM student LIMIT 6, 3  ---第三页



--公式： **开始的索引 = （当前的页码-1） * 每页显示的条数**

（4 - 1）* 3

## tomcat

Tomcat-8.5.37启动日志输出乱码问题解决:

1、D:\tomcat\conf\logging.properties
tomcat conf下logging.properties的

    java.util.logging.ConsoleHandler.encoding = UTF-8

修改为：

java.util.logging.ConsoleHandler.encoding = GBK

与操作系统一致的字符集即可。

## WEB_INF 中 web.xml 配置servlet

http://localhost:8080/demo1  看控制台的输出  Hello Servlet

## <!-- 1.第一次被访问时创建(负数)  2. 在服务器启动时，创建(0,正数)-->

注意二者控制台的区别：
1 . (0,正数)  init 提前执行
2. 负数  init 服务器启动不执行
