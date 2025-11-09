package cursitschool25si26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringJoining {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("unu", "doi", "trei", "patru");
        String result = strings.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Concatenated String: " + result);
    }
}