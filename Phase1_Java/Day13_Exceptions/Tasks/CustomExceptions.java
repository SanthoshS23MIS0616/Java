import java.util.Scanner;

class InsufficientFundsException extends Exception {
    private final double amount;

    public InsufficientFundsException(double amount) {
        super("Insufficient balance. Shortage amount: " + amount);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }

        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        BankAccount account = new BankAccount(balance);

        try {
            account.withdraw(amount);
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Amount needed: " + e.getAmount());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
