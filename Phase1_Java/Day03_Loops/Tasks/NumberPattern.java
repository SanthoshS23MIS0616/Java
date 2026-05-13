/*
Question:
How can you print a right-angled number pattern such as 1, 1 2, and 1 2 3 using nested loops in Java?
*//*
Question:
How can you print a right-angled number pattern such as
1
1 2
1 2 3
using nested loops in Java?
*/

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}