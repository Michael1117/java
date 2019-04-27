public class StringTest {
    public static void main(String[] args) {
        int no = 10;
        String str = "abcdef";
        String str1 = str + "xyz" + no;

        str1 = str1 + "123";
        char c = '国';

        double pi = 3.1416;
        str1 = str1 + pi;
        boolean b = false;
        str1 = str1 + b;
        str1 = str1 + c;

        System.out.println("str1 = " + str1);
    }
}
