public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double initialBalance) {
        this.owner   = owner;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Полож сумма");
            return;
        }
        balance += amount;
        System.out.println("Попол: +" + amount + " Баланс: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Недост средств");
            return;
        }
        balance -= amount;
        System.out.println("Снятие: -" + amount + " | Баланс: " + balance);
    }

    void printBalance() {
        System.out.println(owner + " | Баланс: " + balance);
    }
}