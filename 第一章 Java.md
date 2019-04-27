## 第一章 Java

## 软件开发

软件，即一系列按照特定顺序组织的计算机数据和指令的集合。有**系统软件**和**应用软件**之分。



## 人机交互方式

​	**图形化界面**（Graphical User Interface GUI）: 使用者易于接受，容易上手操作。

​	**命令行方式** （Command Line Interface CLI）: 需要有一个控制台，输入特定的指令，让计算机完成一些操作。

## 常用DOS命令

​	dir:  列出当前目录下的文件以及文件夹

​	md: 创建目录

​	rd:  删除目录

​	cd\： 退回到根目录

​	del: 	删除文件

​	exit:	退出DOS

​			echo javase > 1.doc

## 第一代语言

​		机器语言。指令以二进制形式存在

## 第二代语言

​		汇编语言。使用助记符表示一条机器指令

Java语言的变量声明，操作符形式，参数传递，流程控制等方面和C/C++完全相同。但同时，Java是一个纯粹的面向对象的程序设计语言，它继承了C++语言面向对象技术的核心。Java舍弃类C语言中容易引起错误的指针 （以引用取代）,运算符重载（operator overloading）、多重继承（以接口取代）等特性，增加了垃圾回收器功能用于回收不再被引用的对象所占据的内存空间。JDK1.5又引入了泛型（Generic Progaraming）、类型安全的枚举、不定长参数和自动装/拆箱。

​	Java 语言只支持类之间的单继承，但支持接口之间的多继承，并支持类与接口之间的实现机制（implements）

​	Java 强类型机制，异常处理，垃圾的自动收集

### Java两种核心机制

Java虚拟机（Java Virtual Machine）

垃圾收集机制 （Garbage Collection）

### Java虚拟机

JVM是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指令，管理数据、内存、寄存器。

对于不同的平台，有不同的虚拟机。

只有某平台提供了对应的java虚拟机，java程序才可以在此平台运行。

Java虚拟机机制屏蔽了底层运行平台的差别，实现了 "一次编译，到处运行"。

​			编译					运行

*.java -------->  *.class ------------> 

硬件 ---> 操作系统 ----> JVM --->字节码文件 --->用户user



### 核心机制 ------ 垃圾回收

不再使用的内存空间应回收 ---- 垃圾回收

​	在C/C++等语言中，由开发人员负责回收无用内存。

​	Java语言消除了程序员回收无用内存空间的责任：它提供一种系统级线程跟踪存储空间的分配情况。并在JVM空闲时，检查并释放那些可被释放的存储空间。

垃圾回收在Java程序运行过程中自动进行。



### JDK，JRE

**JDK(Java Development Kit Jva开发工具包)**

​	JDK是提供给Java开发人员使用的，其中包含了java的开发工具，也包括了JRE.

​		开发工具： 编译工具（javac.exe） 打包工具（jar.exe）

**JRE(Java Runtime Enviroment Java运行环境)**

​	Java虚拟机（JVM Java Virtual Machine）和Java程序所需的核心类库，如果想要运行一个开发好的Java程序，计算机中只需要安装JRE即可。

​	**使用JDK的开发工具完成的java程序，交给JRE去运行**



**JDK= JRE + 开发工具集 （Javac编译工具）**

**JRE= JVM + Java SE 标准类库**

​								     javac.exe						                             java.exe

.java文件【源文件】 ---------------> .class文件【字节码文件】 ----------------> 结果

​								        编译									                         运行



###  文档注释（Java特有）



格式：

/**

​	@author  指定java程序的作者

​	@version	指定源文件的版本

*/



注释内容被JDK提供的工具javadoc所解析，生成一套以网页文件形式体现的该程序的说明文档。



### 操作方式

javadoc -d mydoc -author -version HelloWorld.java

Java源文件以“java”为扩展名。源文件的基本组成部分是类（class）

Java应用程序的执行入口是main()方法。

Java语言严格区分大小写。

Java方法由一条条语句构成，每个语句以";"结束。

**严格源文件中最多只能有一个public类。其它类的个数不限，如果源文件包含一个public类，则文件名必须按该类名命名。**



## 第二章



### 2.1 关键字和保留字

关键字中所有字母都为小写

| **用于定义数据类型的关键字**                 |                |               |                  |              |
| :------------------------------------------- | :------------: | :-----------: | ---------------- | :----------: |
| **class**                                    | **interface**  |   **enum**    | **byte**         |  **short**   |
| **int**                                      |    **long**    |   **float**   | **double**       |   **char**   |
| **boolean**                                  |    **void**    |               |                  |              |
| **用于定义流程控制的关键字**                 |                |               |                  |              |
| **if**                                       |    **else**    |  **switch**   | **case**         | **default**  |
| **while**                                    |     **do**     |    **for**    | **break**        | **continue** |
| **return**                                   |                |               |                  |              |
| **用于定义访问权限修饰符的关键字**           |                |               |                  |              |
| **private**                                  | **protected**  |  **public**   |                  |              |
| **用于定义类，函数，变量修饰符的关键字**     |                |               |                  |              |
| **abstract**                                 |   **final**    |  **static**   | **synchronized** |              |
| **定义类与类之间关系的关键字**               |                |               |                  |              |
| **extends**                                  | **implements** |               |                  |              |
| **定义建立实例及引用实例，判断实例的关键字** |                |               |                  |              |
| **new**                                      |    **this**    |   **super**   | **interface**    |              |
| **异常处理关键字**                           |                |               |                  |              |
| **try**                                      |   **catch**    |  **finally**  | **throw**        |  **throws**  |
| **包的关键字**                               |                |               |                  |              |
| **package**                                  |   **import**   |               |                  |              |
| **其他修饰符关键字**                         |                |               |                  |              |
| **native**                                   |  **strictfp**  | **transient** | **volatile**     |  **assert**  |
| **定义数据类型值得字面值**                   |                |               |                  |              |
| **true**                                     |   **false**    |   **null**    |                  |              |

### 保留字

goto ,const 

## Java中的名称命名规范

Java中的名称命名规范： 

​	**包名**： 多单词组成是所有字母都小写：xxyyzz

​	**类名、接口名**： 多单词组成时，所有单词的首字母大写： XxYyZz

​	**变量名、方法名**： 多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写： xxYyZz

​	**常量名： 所有字母都大写**。多单词时每个单词用下划线连接： XX_YY_ZZ



## 2.3变量



### 变量的概念：

​	内存中的一个存储区域

​	该区域的数据可以在同一个类型范围内不断变化

​	变量是程序中最基本的存储单元。包含**变量类型、变量名和存储的值**

### 变量的作用：

​	用于在内存中保存数据

### 使用变量注意：

​	Java中每个变量必须先声明，后使用

​	使用变量名来访问这块区域的数据

​	变量的作用域： 其定义所在的一对{}内

​	变量只有在其作用域内才有效

​	同一个作用域内，不能定义重名的变量

## 变量的分类---按数据类型

对于每一种数据都定义了明确的具体数据类型（强类型语言），在内存中分配了不同大小的内存空间



**数据类型：基本数据类型（primitive type），引用数据类型(reference type)**



**基本数据类型： 数值型，字符型(char)，布尔型(boolean)**

​		**数值型： 整数类型(byte,short,int,long)，浮点类型（float,double）**

**引用数据类型： 类(class)，接口(interface)，数组（[]）**

### 变量分类 ---- 按声明位置的不同

在方法体外，类体内声明的变量称为成员变量

在方法体内声明的变量称为局部变量



**成员变量分为：**

​			**实例变量（不以static修饰）**

​			**类变量（以static修饰）**

**局部变量分为：**

​		**形参(方法、构造器中定义的变量)**

​		**方法局部变量(方法内定义)**

​		**代码块局部变量（代码块内定义）**



#### 二者在初始化值方面的异同：

同： 都有生命周期   异： 局部变量处形参外，都需显示初始化



### 整数类型： byte,short,int,long

Java各整数类型有固定的表数范围和字段长度，不受具体OS的影响，以保证java程序的可移植性。

java的整形常量默认为int型，声明long型常量须后加"l"或”L“

java程序中变量通常声明为int型，除非不足以表示较大的数，才使用long

| 类型  | 占用存储空间   | 表数范围                               |
| ----- | -------------- | -------------------------------------- |
| byte  | 1字节 = 8bit位 | -128~127                               |
| short | 2字节          | -2<sup>15</sup> ~ 2<sup>15</sup>       |
| int   | 4字节          | -2<sup>31</sup>~2<sup>31</sup>(约21亿) |
| long  | 8字节          | -2<sup>63</sup>~2<sup>63</sup>         |



## ### 2<sup></sup>



## float表示的数据范围为什么比long的范围要大
| 数据类型 | 字节 |
| -------- | ---- |
| long     | 8    |
| float    | 4    |



### 为什么8位字节long的数据范围会比4位字节float的数据范围小呢？
下面举一个例子来进行比较：
long：2^63-1；
float : 3.4x10^38 > 2x10^38 > 2x8^38
可得：2x8^38 = 2x2338 = 2x2^114
因为：2x2^114 > 2^63-1
所以：float的数据范围大于long的数据范围
附：float在内存中是如何存储的：

float类型数字在计算机中用4个字节存储。遵循IEEE-754格式标准： 一个浮点数有2部分组成：底数m和指数e

**底数部分：使用二进制数来表示此浮点数的实际值**
**指数部分：占用8bit的二进制数，可表示数值范围为0-255**

但是指数可正可负，所以，IEEE规定，此处算出的次方必须减去127才是真正的指数。所以，float类型的指数可从-126到128。

底数部分实际是占用24bit的一个值，但是最高位始终为1，所以，最高位省去不存储，在存储中占23bit 科学计数法。

格式：
**SEEE EEEE EMMM MMMM MMMM MMMM MMMM MMMM**
**S表示浮点数正负**
**E指数加上127后的值得二进制数据 M底数**

举例：
17.625在内存中的存储
--------------------- 
```java
首先要把17.625换算成二进制：10001.101

   整数部分，除以2，直到商为0，余数反转。
   小数部分，乘以2，直到乘位0，进位顺序取。

   在将10001.101右移，直到小数点前只剩1位：
   1.0001101 * 2^4 因为右移动了四位

   这个时候，我们的底数和指数就出来了
   底数：因为小数点前必为1，所以IEEE规定只记录小数点后的就好。所以，此处的底数为：0001101
   指数：实际为4，必须加上127(转出的时候，减去127)，所以为131。也就是10000011 符号部分是整数，所以是0
   综上所述，17.625在内存中的存储格式是： 01000001 10001101 00000000 00000000
      
```

![1556184016793](C:\Users\michaelhee\AppData\Roaming\Typora\typora-user-images\1556184016793.png)

# 二进制数0.101转换成十进制数怎么转

对于2[进制](https://www.baidu.com/s?wd=进制&tn=SE_PcZhidaonwhc_ngpagmjz&rsv_dl=gh_pc_zhidao)的小数，从[小数点](https://www.baidu.com/s?wd=小数点&tn=SE_PcZhidaonwhc_ngpagmjz&rsv_dl=gh_pc_zhidao)右边第一位开始，记为-1，-2，-3一次下去，比如这个0.101  -1 -2 -3则，该2[进制](https://www.baidu.com/s?wd=进制&tn=SE_PcZhidaonwhc_ngpagmjz&rsv_dl=gh_pc_zhidao)为

1  * 2 ^ -1+0 * 2 ^ -2 + 1*2^-3=0.5+0+0.125=0.625

```java
## float类型(32位)：
分为：符号位S_指数位E_尾数位M

1bit（符号位） 8bits（指数位） 23bits（尾数位）

double类型(64位)：
分为：符号位S_指数位E_尾数位M

1bit（符号位） 11bits（指数位） 52bits（尾数位）

特别注意的是指数位存放的是补码,底数是2！

具体举例：
float f = 8.5f;

8.5对应的二进制 ——> 1000.1

计算符号位：因为为正数，所以符号位为 0。
 
计算指数位：规范化表示小数点左边只能有一位并且为1，所以为1.0001 * 2^3，规定指数位的底为2且幂加127（double类型加1023），所有指数位为130，转换位二进制——>1000 0010。

计算尾数位：规定尾数位去掉规范化前边的整数位的1，只保存小数，所以尾数位为——>0001
 
最终得到的完整的浮点数为：0    1000 0010     0001 0000 0000 0000 0000 000

作业：求 double d = 16.25;   二进制浮点数是多少？
```





16.25 

1 0000.01

1.000001 * 2 ^ 4

4 + 1023 = 1027

指数 100   0000 0011

尾数 000001

01000000 00110000  01000000 00000000 00000000 00000000 00000000 00000000 

 01000000 0011 0000 0 10000 00000 00000 00000 00000 00000 00000 00000 00000 00

## 浮点类型： float、double

与整数类型类似，Java浮点类型也有固定的表数范围和字段长度，不受具体操作系统的影响

浮点型常量有两种表示形式：

​	十进制数形式： 如： 5.12     512.0f     .512 

​	科学计数法形式： 如： 5.12e2 512E2  100E-2

float: 单精度，尾数可以精确到7位有效数字。

double: 双精度，精度是float的两倍。

Java的浮点型常量默认为double型，声明float型常量，须后加“f”或“F"

| 类型         |       | 表数范围             |
| ------------ | ----- | -------------------- |
| 单精度float  | 4字节 | -3.403E38~3.403E38   |
| 双精度double | 8字节 | -1.798E308~1.798E308 |

	## 字符类型

char型数据用来表示通常意义上"字符"(2字节)

Java中的所有字符都使用Unicode编码，故一个字符可以存储一个字母，一个汉字，或其他书面语的一个字符



**字符型常量的三种表现形式**

​	1.  字符常量是用单引号('')括起来的单个字符。例如： char c1 = 'a'; char c2 = '中';char c3 = '9';

​	2.  Java中还允许使用转义字符'\\'来将其后的字符转变成特殊字符型常量。例如： char c3 = '\\n'; // '\\n'表示换行符

​	3.  直接使用Unicode 值来表示字符型常量： '\\uXXXX'。其中，XXXX代表一个十六进制整数。如： \u000a表示\n.

* char 类型是可以运算的。有对应的Unicode码。



### boolean 类型数据只允许取值true和false,无null



### 基本数据类型转换

自动类型转换： 容量小的类型自动转换为容量大的数据类型。数据类型按容量大小排序为：

char

byte   ---> int --->  long --->  float--->double

short



有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后在进行计算。

**byte,short,char之间不会相互转换，他们三者在计算时首先转换为int类型。**

**boolean类型不能与其它数据类型运算。**

**当把任何基本数据类型的值和字符串进行连接运算时，基本数据类型的值将自动转化为（String）类型。**

### 字符串类型： String

String不是基本数据类型，属于引用数据类型

使用方式与基本数据类型一致。例如： String str = "abcd";

一个字符串可以串接另一个字符串，也可以串接其他类型的数据。

​	str = str + "xyz";

​	int n = 100;

​	str  = str + n;

### 1.VariableTest1

```java
public class VariableTest1 {
    public static void main(String[] args) {
        // 1.整型： byte(1字节 = 8bit) \short(2字节) \ int (4字节) \ long (8字节)
        // ① byte范围： -128~127

        byte b1 = 12;
        byte b2 = -128;

        //b2 = 128;

        //System.out.println(b1);
        //System.out.println(b2);

        // ② 声明long型变量，必须以"l"或"L"结尾
        // ③ 通常，定义整型变量时，使用int型

        short s1 = 128;
        int i1 = 1234;
        long l1 = 3456786655L;

        System.out.println(l1);

        // 2.浮点型： float(4字节)  \double(8字节)
        // ① 浮点型，表示带小数点的数值
        // ② float表示数值的范围比long还大

        double d1 = 123.3;
        System.out.println(d1 + 1);

        // ③ 定义float类型变量时，变量要以"f"或"F"结尾

        float f1 = 12.3F;
        System.out.println(f1);

        // ④ 通常，定义浮点型变量时，使用double型。

        // 3. 字符型： char (1字符 = 2字节)
        // ① 定义char类型变量，通常使用一对'',内部只能写一个字符
        char c1 = 'a';

        //c1 = 'AB';

        System.out.println(c1);

        char c2 = '1';
        char c3 = 'あ';
        char c4 = '中';

        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // ② 表示方式： 1.声明一个字符 2.转义字符 3.直接使用Unicode值来表示字符型常量
        char c5 = '\n';  // 换行符
        c5 = '\t';  // 制表符

        System.out.println("hello" + c5);
        System.out.println("world");

        char c6 = '\u0043';

        System.out.println(c6);


        // 4. 布尔型： boolean
        // ① 只能取两个值之一： true ,false
        // ② 常常在条件判断，循环结构中使用

        boolean bb1 = true;
        System.out.println(bb1);

        boolean isMarried = true;
        if(isMarried) {
            System.out.println("你就不能参加\"单身\"party了！\\n很遗憾");
        }else {
            System.out.println("你可以多谈谈女朋友！");
        }
    }
}
```

### 2.VariableTest

```java
/*
*   基本数据类型之间的运算规则：
*       前提： 不包含boolean
*
*   1.自动类型提升
*       当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型。
*           byte,char,short ---> int --- > long ---> float ---> double
*
*           特别的： 当byte、char、short三种类型的变量做运算时，结果为int型
*              byte + byte
*              byte + char
*              byte + short
*              char + char
*              char + short
*              short + short   都不能直接运算
*
*   2. 强制类型转换
*
*
*
*
*
* */

public class VariableTest2 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 129;

       // byte b2 = b1 + i1;
        int i2 = b1 + i1;

        long l1 = b1 + i1;
        System.out.println(i2);
        System.out.println(l1);

        float f = b1 + i1;
        System.out.println(f);  // 131.0

        short s1 = 123;
        short s2 = 234;
        // short s3 = s1 + s2;  // 编译不通过

        double d1 = s1;
        System.out.println(d1);  // 123.0

        char c1 = 'a'; // 97
        char c2 = 'b';
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);  //107

        short s4 = 10;
        //char c2 = c1 + s2;   // 出错

        // char c3 = c1 + c2;  // char 和 char自身也不能运算
        int c3 = c1 + c2;
        System.out.println(c3);


    }
}
```

### VariableTest3

```java
/*
* 强制类型转换： 自动类型提升运算的逆运算。
* 1.需要使用强转符：()
* 2. 注意点： 强制类型转换，可能导致精度损失
*
*
* */

public class VariableTest3 {
    public static void main(String[] args) {
        double d1 = 12.9;
        // 精度损失举例1
        int i1 = (int)d1;
        System.out.println(i1);  // 12  截断操作
        
        // 没有精度损失
        long l1 = 123;
        short s2 = (short)l1;
        System.out.println(s2);
        
        // 精度损失举例2
        int i2 = 128;
        byte b = (byte)i2;
        System.out.println(b);  // -128  int 是32位的,强转成byte后会变为负数
        // 00000000 10000000
    }
}
```

### VariableTest4

```java
public class VariableTest4 {
    public static void main(String[] args) {
        // 1.编码情况1：
        long l = 123213;
        System.out.println(l);
        
        // 编译失败： 过大的整数
        //long l1 = 21332444400400404; 编译失败
        long l1 = 21332444400400404l;
        
        // 编译失败
        //float f1 = 12.4;
        //float f1 = 12.4f;
        float f1 = (float)12.4;
        
        
        // 2.编码情况2：
        // 整型常量，默认类型为int型
        // 浮点型常量，默认类型为double型
        byte b = 12;
        //byte b1 = b + 1;  // 编译失败
        
        byte b2 = b++;
        int b1 = b + 1;
        
        //float f2 = b + 12.3;
        double f2 = b + 12.3;
    }
}
```

## BinaryTest

```java
/*
* 计算机中不同进制的使用说明
*   对于整数，有四种表示方式
*       二进制(binary):0,1,满2进1.以0b或0B开头。
*       十进制(decimal): 0-9,满10进1
*       八进制(octal):0-7，满8进1.以数字0开头表示。
*       十六进制(hex): 0-9及A-F,满16进1.以0x或0X开头。此处的A-F不区分大小写
*           0x21AF + 1 = 0x21B0
* 
* */

public class BinaryTest {
    public static void main(String[] args) {
        int num1 = 0b110;
        int num2 = 100;
        int num3 = 0127;
        int num4 = 0x110A;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

    }
}
```

### StringTest

```java
// String 类型变量的使用
/*
 * 1. String 属于引用数据类型，即为 字符串
 * 2. 声明String类型变量时，使用一对""
 * 3. String可以和8中基本数据类型变量做运算，且运算只能是连接运算 ： +
 * 4. 运算的结果仍然是String类型
 *
 * */

public class StringTest1 {
    public static void main(String[] args) {

        String s1 = "Hello World";
        System.out.println(s1);

        String s2 = "a";
        String s3 = "";

        //char c = '';  // 编译不通过

        int number = 10001;
        String numberStr = "学号：";
        String info = numberStr + number; // + : 连接运算
        boolean b1 = true;
        String info1 = info + b1;  // +: 连接运算

        System.out.println(info1);

        // 练习1
        char c = 'a';
        int num = 10;
        String str = "Hello";
        System.out.println(c + num + str);
        System.out.println(c + str + num);
        System.out.println(c + (num + str));
        System.out.println((c + num) + str);
        System.out.println(str + num + c);

        // 练习2
        System.out.println("* *");   // * *
        System.out.println('*' + '\t' + '*');  // 93    // *:42   \t:9
        System.out.println('*' + "\t" + '*');  // *      *
        System.out.println('*' + '\t' + "*");  //  51*
        System.out.println('*' + ('\t' + "*"));// *   *

        /*
        *       * *
                93
                *  *
                51*
                *  *
        */

        //String str1 = 123; // 编译不通过
        String str1 = 123+ "";

        System.out.println(str1);  // "123"

        //int num1 = str1; // 编译不通过

        //int num1 = (int)str1;  // 编译不通过

        int num1 = Integer.parseInt(str1);
        System.out.println(num1);

    }
}
```



UTF-8是一种变长的编码方式。它可以使用**1-6个字节**表示一个符号，根据不同的符号而变化字节长度

UTF-8的编码规则：

​	**对于单字节的UTF-8编码，该字节的最高位为0，其余7位用来对字符进行编码（等同于ASCII码）**

​	**对于多字节的UTF-8编码，如果编码包含n个字节，那么第一个字节的前n位为1，第一个字节的第n+1位为0，该字节的剩余各位用来对字符进行编码。在第一个字节之后的所有的字节，都是最高两位'10',其余6位用来对字符进行编码。**

## 强制类型转换

1. 自动类型转换的逆过程，将容量大的数据类型转换成容量小的数据类型。使用时要加上强制转换符：（），但可能造成精度降低或溢出。

2. 通常字符串不能直接转换为基本类型，但可以通过基本类型对应的包装类实现字符串转换成基本类型

​		String a = "43"; int i = Integer.parseInt(a);

3. boolean 类型不可以转换为其它的数据类型

## # test



```java
public class test {
    public static void main(String[] args) {
        short s = 5;
        //s = s - 2;  // no

        byte b = 3;
        //b = b + 4;  // no

        b = (byte) b;

        char c = 'a';
        int i = 5;
        float d = .314F;
        double result = c + i + d;

        byte b1 = 5;
        short s1 = 3;
        //short t = s1 + b1;  // no

    }
}
```

## 二进制

Java整数常量默认是int类型，当用二进制定义整数时，其第32位是符号位；当是long类型时，二进制默认占64位，第64位是符号位

二进制的整数有如下三种形式
    **原码**： 直接将一个数值转换成二进制。最高位是符号位
    **负数的反码**： 是对原码按位取反，只是最高位(符号位)确定是1
    **负数的补码**： 其反码加1
    
计算机以二进制**补码**的形式保存所有的整数

    正数原码、反码、补码都想同
    负数的补码使是反码+1
    
    补码为-69  反码： 原码：
    -69
    1100 0101  原码
    1011 1010  反码
    1011 1011  补码

