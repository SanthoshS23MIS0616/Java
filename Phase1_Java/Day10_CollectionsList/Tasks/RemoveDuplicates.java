/*
Question:
How can you create a Java program to remove duplicates from an ArrayList while maintaining order using LinkedHashSet?
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3)
        );

        LinkedHashSet<Integer> set = new LinkedHashSet<>(numbers);

        ArrayList<Integer> uniqueNumbers = new ArrayList<>(set);

        System.out.println(uniqueNumbers);
    }
}