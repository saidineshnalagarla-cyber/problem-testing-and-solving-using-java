
import java.util.*;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        BankAccount account = new BankAccount();

        for (int i = 0; i < n; i++) {
            String[] operation = sc.nextLine().split(" ");
            double amount = Double.parseDouble(operation[1]);

            if (operation[0].equals("Deposit")) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        }

        System.out.println((int) account.getBalance());
    }
}
