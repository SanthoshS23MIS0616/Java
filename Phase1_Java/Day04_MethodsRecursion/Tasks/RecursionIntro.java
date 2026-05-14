/*
Question:
How can you create a Java program to calculate factorial recursively and iteratively and compare the results for values from 1 to 12?
*/
public class RecursionIntro {
    public static long recursiveFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    public static long iterativeFactorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("n = " + i + ", recursive = " + recursiveFactorial(i) + ", iterative = " + iterativeFactorial(i));
        }
    }
}
