/*
Question:
How can you create a Java program to Create an array of 10 elements, fill it from 1 to 10, print it with Arrays.toString(), and compute sum and average?
*/
import java.util.Scanner;

class ArrayBasics {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        // Create array with extra space
        int A[] = new int[n];
        int B[] = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Input element to insert
       
        for(int i = 0; i<n; i++ ){
            
            B[i] = A[n-1-i];

        }

        // Print updated array
        System.out.println("Array after insertion:");

        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }

        sc.close();
    }
}