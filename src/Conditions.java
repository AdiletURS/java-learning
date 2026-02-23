public class Conditions {
    public static void main(String[] args){
        int age = 22;
        double balance = 555.5;
        boolean isProgrammer = true;

//==========================================

        System.out.println("==Age==");

        if (age >= 18) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

//==========================================

        System.out.println("==Grade");
        int score = 80;

        String result = (score >= 90) ? "A"
                : (score >= 75) ? "B"
                : (score >= 60) ? "C"
                : "D";
        System.out.println(result);

//==========================================

        System.out.println("discount");

        String discount = (isProgrammer && balance >= 1000)
                ? "Yes"
                : "No";
        System.out.println(discount);
    }
}
