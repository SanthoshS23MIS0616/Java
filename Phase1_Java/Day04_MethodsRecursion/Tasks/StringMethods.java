/*
Question:
How can you create a Java program to implement countVowels(String), reverseString(String), isPalindrome(String), and countWords(String)?
*/
import java.util.Scanner;

public class StringMethods {
    public static int countVowels(String text) {
        int count = 0;
        String lower = text.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String text) {
        StringBuilder builder = new StringBuilder(text);
        return builder.reverse().toString();
    }

    public static boolean isPalindrome(String text) {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(reverseString(cleaned));
    }

    public static int countWords(String text) {
        String trimmed = text.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("Vowel count: " + countVowels(text));
        System.out.println("Reversed string: " + reverseString(text));
        System.out.println("Is palindrome: " + isPalindrome(text));
        System.out.println("Word count: " + countWords(text));
    }
}
