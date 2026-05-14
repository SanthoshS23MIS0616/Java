/*
Question:
How can you create a Java program to implement isPrime(int n), factorial(int n), and power(int base, int exp)?
*/
import java.util.Scanner;

public class MethodsDemo {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to test prime: ");
        int primeInput = scanner.nextInt();
        System.out.print("Enter a number for factorial: ");
        int factorialInput = scanner.nextInt();
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exp = scanner.nextInt();

        System.out.println("Is prime: " + isPrime(primeInput));
        System.out.println("Factorial: " + factorial(factorialInput));
        System.out.println("Power: " + power(base, exp));
    }
}
