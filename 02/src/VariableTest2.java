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
