/*
Question:
How can you create a Java program to print all prime numbers from 1 to 100 using an outer loop and an inner loop up to sqrt(i)?
*/

public class PrimeNumbers {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}