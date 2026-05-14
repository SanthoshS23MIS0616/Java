/*
Question:
How can you trace every recursive call in a Fibonacci function and observe why the naive recursive approach grows exponentially?
*/
import java.util.Scanner;

public class FibonacciTrace {
    public static int fibonacci(int n) {
        System.out.println("Calling fib(" + n + ")");
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
