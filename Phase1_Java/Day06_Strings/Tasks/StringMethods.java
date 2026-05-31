/*
Question:
How can you create a Java program to demo charAt, indexOf, substring, split, replace, toUpperCase, trim, and contains?
*/
import java.util.Arrays;
import java.util.Scanner;

class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        System.out.println("Trimmed: " + text.trim());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("First char: " + text.charAt(0));
        System.out.println("Index of a: " + text.indexOf('a'));
        System.out.println("Substring first 5 chars: " + text.substring(0, Math.min(5, text.length())));
        System.out.println("Words: " + Arrays.toString(text.trim().split("\\s+")));
        System.out.println("After replace a with @: " + text.replace('a', '@'));
        System.out.println("Contains java: " + text.toLowerCase().contains("java"));

        sc.close();
    }
}
