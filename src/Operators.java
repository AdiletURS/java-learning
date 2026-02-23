public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;

        int sum = a + b;
        int minus = a - b;
        int multiply = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // =======================

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum " + sum);
        System.out.println("Minus " + minus);
        System.out.println("multiply " + multiply);
        System.out.println("quotient " + quotient);
        System.out.println("remainder:" + remainder);

        // =======================

        int intResult    = 7 / 2;
        double doubleResult = 7.0 / 2;
        System.out.println("int" + intResult);
        System.out.println("double" + doubleResult);

        // =======================

        int x = 5;
//        x += 3;
//        x -= 2;
//        x *= 4;
//        x /= 3;
        System.out.println(x);

        int count = 0;
        count++;
//        count--;
        System.out.println(count);

    }

}
