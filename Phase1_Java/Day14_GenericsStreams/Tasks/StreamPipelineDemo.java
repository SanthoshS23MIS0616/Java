/*
Question:
How can you build a single Java stream pipeline that finds unique words longer than five characters, sorts them alphabetically, and converts them to uppercase?
*/
import java.util.*;
import java.util.stream.Collectors;

public class StreamPipelineDemo {

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "programming",
                "java",
                "developer",
                "stream",
                "collection",
                "programming",
                "generic",
                "developer",
                "computer"
        );

        List<String> result = words.stream()
                .filter(word -> word.length() > 5)
                .distinct()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}