/*
Question:
How can you print a right-angled number pattern such as 1, 1 2, and 1 2 3 using nested loops in Java?
*/

import java.util.Scanner;

public class NumberPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the top half: ");
        int n = sc.nextInt();

        // 1. Upper Half (Pyramid)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces: n - i
            for (int j = 1; j <= n - i; j++) {
                System.out.println(" ");
            }
            
            // Print stars: 2 * i - 1
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
        }}}