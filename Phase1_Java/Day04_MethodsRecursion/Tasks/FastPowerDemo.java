/*
Question:
How can you compare a normal recursive power function with fast exponentiation in Java and observe the difference in the number of recursive calls?
*/
import java.util.Scanner;

public class FastPowerDemo {
    static int normalCalls = 0;
    static int fastCalls = 0;

    public static long power(int base, int exp) {
        normalCalls++;
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static long fastPower(int base, int exp) {
        fastCalls++;
        if (exp == 0) {
            return 1;
        }
        if (exp % 2 == 0) {
            long half = fastPower(base, exp / 2);
            return half * half;
        }
        return base * fastPower(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exp = scanner.nextInt();

        long normalResult = power(base, exp);
        long fastResult = fastPower(base, exp);

        System.out.println("Normal power result: " + normalResult);
        System.out.println("Fast power result: " + fastResult);
        System.out.println("Normal recursive calls: " + normalCalls);
        System.out.println("Fast recursive calls: " + fastCalls);
    }
}
