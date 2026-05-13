/*
Question:
How can you write a Java program to validate an ATM withdrawal so that the amount is greater than 0, less than or equal to the balance, and divisible by 100?
*/
import java.util.Scanner;

public class ATMValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        int balance = scanner.nextInt();
        System.out.print("Enter withdrawal amount: ");
        int withdrawal = scanner.nextInt();

        boolean isValid = withdrawal > 0 && withdrawal <= balance && withdrawal % 100 == 0;

        if (isValid) {
            System.out.println("Withdrawal approved");
            System.out.println("Remaining balance: " + (balance - withdrawal));
        } else {
            System.out.println("Withdrawal denied");
        }
    }
}
