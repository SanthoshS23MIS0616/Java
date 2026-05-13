/*
Question:
How can you create a Java program to use while(n > 0) { sum += n % 10; n /= 10; } to find the sum of digits?
*/


import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}