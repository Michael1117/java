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
