/*
Question:
How can you create a Java program to check an anagram using an int[26] frequency array?
*/
import java.util.Scanner;

class AnagramCheck {
    static String clean(String s) {
        return s.replaceAll("[^A-Za-z]", "").toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String first = clean(sc.nextLine());
        System.out.println("Enter second string:");
        String second = clean(sc.nextLine());

        if (first.length() != second.length()) {
            System.out.println("Not anagram");
            sc.close();
            return;
        }

        int[] freq = new int[26];
        for (int i = 0; i < first.length(); i++) {
            freq[first.charAt(i) - 'a']++;
            freq[second.charAt(i) - 'a']--;
        }

        boolean anagram = true;
        for (int count : freq) {
            if (count != 0) {
                anagram = false;
                break;
            }
        }

        System.out.println(anagram ? "Anagram" : "Not anagram");
        sc.close();
    }
}
