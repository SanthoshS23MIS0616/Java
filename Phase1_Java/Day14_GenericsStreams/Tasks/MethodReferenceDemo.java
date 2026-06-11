/*
Question:
How can you replace lambda expressions with method references such as System.out::println and String::toUpperCase in Java?
*/

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("java", "python", "c++");

        names.forEach(System.out::println);

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}