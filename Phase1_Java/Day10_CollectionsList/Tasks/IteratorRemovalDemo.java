/*
Question:
How can you safely remove all even numbers from a list using an Iterator in Java, and why does direct modification inside a loop cause ConcurrentModificationException?
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorRemovalDemo {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int num = iterator.next();

            if (num % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}