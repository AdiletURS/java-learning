public class Methods {
    static void printLine() {
        System.out.println("0000");
    }

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double average(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return (double) sum / arr.length;
    }

    static int multiply(int a, int b) {   // !!!
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    //Рекурсия
    static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        printLine();
        greet("Adilet");
        greet("Java");

        int result = add(10, 25);
        System.out.println(result);

        System.out.println(add(5, 3));

        int[] scores = {90, 85, 78, 92, 88};
        System.out.println(average(scores));

       // Перегрузка
        System.out.println(multiply(3, 4));
        System.out.println(multiply(2.5, 4.0));
        System.out.println(multiply(2, 3, 4));
    }
}

