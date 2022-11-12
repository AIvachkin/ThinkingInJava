package Part2;

public class StaticTest {
    static int i = 47;

    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println(i);

        Integer it = 5;
        int iti = it;

        System.out.println(iti);
    }


}
