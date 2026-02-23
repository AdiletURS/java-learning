public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Adilet", 20, "Bishkek");
        Person p2 = new Person("Adilet1", 15, "Bishkek1");
        Person p3 = new Person("Adilet2", 22, "Bishkek2");

        p1.introduce();
        p2.introduce();

        System.out.println(p1.name + " 18+ " + p1.isAdult());
        System.out.println(p2.name + " 18+ " + p2.isAdult());

        p1.birthday();

        System.out.println(p3);

        Person[] team = {p1, p2, p3};
        for (Person p : team) {
            p.introduce();
        }

        BankAccount acc = new BankAccount("Adilet", 5000.5);
        acc.printBalance();
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000);
        acc.printBalance();
    }
}