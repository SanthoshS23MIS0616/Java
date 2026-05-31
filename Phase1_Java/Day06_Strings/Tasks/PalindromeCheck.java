/*
Question:
How can you create a Java program to remove non-alphanumeric characters, lowercase the string, and check palindrome by comparing with reverse?
*/
import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String clean = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(clean).reverse().toString();

        if (clean.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        sc.close();
    }
}
