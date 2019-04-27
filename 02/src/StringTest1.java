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
        System.out.println('*' + "\t" + '*');  // *	  *
        System.out.println('*' + '\t' + "*");  //  51*
        System.out.println('*' + ('\t' + "*"));// *   *

        /*
        *       * *
                93
                *	*
                51*
                *	*
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
