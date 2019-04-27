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
