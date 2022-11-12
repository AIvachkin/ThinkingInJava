package Part2;

public class DataOnly {

    static int i;
    static double d;
    static boolean b;

    public static void main(String[] args) {
        i = 10;
        d = 10.5;
        b = false;
        String str = "abc";
        int c = storage(str);
        System.out.println(c);
        System.out.println(i + " " + d + " " + b);

    }

    static int storage(String s) {
        return s.length() * 2;
    }

}
