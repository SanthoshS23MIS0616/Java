/*
Question:
How can you create a Java program using LinkedHashMap to preserve order and find the first character with frequency 1?
*/
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class FirstUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = sc.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : text.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First unique character: " + entry.getKey());
                sc.close();
                return;
            }
        }

        System.out.println("No unique character found");
        sc.close();
    }
}
