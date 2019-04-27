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
