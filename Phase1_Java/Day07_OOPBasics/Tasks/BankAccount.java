/*
Question:
How can you create a Java program with private balance, deposit(validates > 0), withdraw(validates sufficient balance), and toString()?
*/
import java.util.Scanner;

class BankAccount {
    private String accountNo;
    private String holderName;
    private double balance;

    BankAccount(String accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = Math.max(0, balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdraw successful.");
        }
    }

    public String toString() {
        return "BankAccount{accountNo='" + accountNo + "', holderName='" + holderName + "', balance=" + balance + "}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNo = sc.nextLine();
        System.out.print("Enter holder name: ");
        String holderName = sc.nextLine();
        System.out.print("Enter opening balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNo, holderName, balance);
        int choice;

        do {
            System.out.println("1.Deposit 2.Withdraw 3.Show 4.Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                account.deposit(sc.nextDouble());
            } else if (choice == 2) {
                System.out.print("Enter withdraw amount: ");
                account.withdraw(sc.nextDouble());
            } else if (choice == 3) {
                System.out.println(account);
            }
        } while (choice != 4);

        sc.close();
    }
}
