/*
Question:
How can you create a Java program to demonstrate Collections.reverse(), shuffle(), frequency(), and an unmodifiable list?
*/
import java.util.*;

public class CollectionOperation {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(
                Arrays.asList("Apple", "Banana", "Mango", "Banana", "Orange")
        );

        Collections.reverse(fruits);
        System.out.println("Reverse: " + fruits);

        Collections.shuffle(fruits);
        System.out.println("Shuffle: " + fruits);

        int count = Collections.frequency(fruits, "Banana");
        System.out.println("Frequency of Banana: " + count);

        List<String> unmodifiableList = Collections.unmodifiableList(fruits);
        System.out.println("Unmodifiable List: " + unmodifiableList);
    }
}