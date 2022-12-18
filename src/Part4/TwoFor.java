package Part4;

public class TwoFor {

    public void simpleNumbers() {

        for (int i = 1; i < 48; i++) {
            if (i == 1) {
                System.out.print(i);
            }
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 & j < i) {
                    break;
                }
                if (i % j == 0) {
                    System.out.print(" , " + i);
                }
            }
        }
    }
}


