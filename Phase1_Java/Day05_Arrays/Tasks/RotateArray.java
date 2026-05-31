/*
Question:
How can you create a Java program to rotate an array left by K using the triple-reverse technique with O(1) space?
*/
import java.util.Arrays;
import java.util.Scanner;

class RotateArray {
    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        if (n > 0) {
            k = k % n;
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
            reverse(arr, 0, n - 1);
        }

        System.out.println("After left rotation: " + Arrays.toString(arr));
        sc.close();
    }
}
