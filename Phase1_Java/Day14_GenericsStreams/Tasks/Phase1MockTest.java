/*
Question:
How can you create a Java program to Complete a Phase 1 mock test from scratch without notes: isPalindrome(String), groupAnagrams(String[]), validParentheses(String), and findTopKFrequent(int[], int k)?
*/
import java.util.*;

public class Phase1MockTest {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static boolean validParentheses(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static List<Integer> findTopKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> frequency.get(b) - frequency.get(a));

        pq.addAll(frequency.keySet());

        List<Integer> result = new ArrayList<>();

        while (k-- > 0 && !pq.isEmpty()) {
            result.add(pq.poll());
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(words));

        System.out.println(validParentheses("{[()]}"));

        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(findTopKFrequent(nums, 2));
    }
}
