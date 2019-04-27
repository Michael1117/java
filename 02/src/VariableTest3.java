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
