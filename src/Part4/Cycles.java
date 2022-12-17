package Part4;

public class Cycles {
    public void oneToHundred() {

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }

    public void randomTwentyFive() {
        int rand = (int) (Math.random() * 5) + 1;
        System.out.print(rand);
        for (int i = 0; i < 10; i++) {

//            while (true){
            int rand2 = (int) (Math.random() * 5) + 1;
            if (rand2 > rand) {
                System.out.print(" < " + rand2);
                rand = rand2;
            } else if (rand2 < rand) {
                System.out.print(" > " + rand2);
                rand = rand2;
            } else {
                System.out.print(" = " + rand2);
            }

        }

    }
}


