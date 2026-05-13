/*
Question:
How can you create a Java program to find the largest of three numbers using both if-else logic and Math.max(Math.max(a,b),c)?
*/
import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int largestUsingIfElse;

        if (a >= b && a >= c) {
            largestUsingIfElse = a;
        } else if (b >= a && b >= c) {
            largestUsingIfElse = b;
        } else {
            largestUsingIfElse = c;
        }

        int largestUsingMath = Math.max(Math.max(a, b), c);

        System.out.println("Largest using if-else: " + largestUsingIfElse);
        System.out.println("Largest using Math.max: " + largestUsingMath);
    }
}
