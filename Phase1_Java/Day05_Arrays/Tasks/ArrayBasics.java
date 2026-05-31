/*
Question:
How can you create a Java program to create an array of 10 elements, fill it from 1 to 10, print it with Arrays.toString(), and compute sum and average?
*/
import java.util.Arrays;

class ArrayBasics {
    public static void main(String args[]) {
        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
