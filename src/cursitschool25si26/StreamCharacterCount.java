package cursitschool25si26;

import java.util.Arrays;
import java.util.List;

public class StreamCharacterCount {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList
                ("Java Streams", "Method References", "Lambda Expressions");
        long totalChars = strings.stream()
                .mapToLong
                        (s -> s.replaceAll("\\s+", "").length()
                        )
                .sum();
        System.out.println("Total number of non-whitespace characters: " + totalChars);
    }}