/*
Question:
How can you create a Java program to classify a number as positive, negative, or zero using the ternary operator and also show a nested ternary example?
*/
import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = number > 0 ? "Positive" : number < 0 ? "Negative" : "Zero";

        System.out.println("Classification: " + result);
        System.out.println("Nested ternary result: " + (number > 0 ? "Positive" : number < 0 ? "Negative" : "Zero"));
    }
}
