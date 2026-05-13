/*
Question:
How can you create a Java program to print N x 1 to N x 10 using a for loop, then rewrite it using a while loop?
*/


import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Using FOR loop
        System.out.println("Using for loop:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        // Using WHILE loop
        System.out.println("\nUsing while loop:");

        int i = 1;

        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }

        sc.close();
    }
}