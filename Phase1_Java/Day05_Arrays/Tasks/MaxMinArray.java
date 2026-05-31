/*
Question:
How can you create a Java program to find max, min, and second-max without sorting using a single pass and two variables?
*/
import java.util.Scanner;

class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Enter at least 2 elements.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int value : arr) {
            if (value > max) {
                secondMax = max;
                max = value;
            } else if (value > secondMax && value != max) {
                secondMax = value;
            }

            if (value < min) {
                min = value;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second maximum: not found");
        } else {
            System.out.println("Second maximum: " + secondMax);
        }

        sc.close();
    }
}
