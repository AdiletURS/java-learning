public class Loops {
    public static void main(String[] args) {
        System.out.println("for");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        //===================

        System.out.println("Sum");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        //===================

        System.out.println("even ");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //=====================

        System.out.println("while");
        int count = 10;
        while (count > 0) {
            System.out.println(count);
            count--;
        }

        //=====================

        System.out.println("Do while");
        int x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x < 3);


        //=====================

        System.out.println("break");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.print(i);
        }

        //=====================

        System.out.println("continue");
        for (int i = 1; i <= 6; i++) {
            if (i == 3) continue;
            System.out.print(i);
        }
        System.out.println();

        //=====================

        System.out.println("3X3");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
