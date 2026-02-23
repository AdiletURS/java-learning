public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int[] scores = new int[3];
        scores[0] = 10;
        scores[1] = 15;
        scores[2] = 20;

        System.out.println("1" + numbers[0]);
        System.out.println("2" + numbers[2]);
        System.out.println("3" + numbers.length);

        System.out.println("for");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("for-each");
        for (int num : numbers) {
            System.out.println(num);
        }


        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("max: " + max);
        System.out.println("min:  " + min);

    }
}
