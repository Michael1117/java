/*
*
*
*
* */

public class AriExer {
    public static void main(String[] args) {
        int num = 187;

        int bai = num / 100;
        int shi = num % 100 / 10;
        int ge = num % 10;

        System.out.println("百位为：" + bai);
        System.out.println("十位为：" + shi);
        System.out.println("个位为：" + ge);
    }
}
