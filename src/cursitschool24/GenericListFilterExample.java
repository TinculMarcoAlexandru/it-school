package cursitschool24;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface ListFilter<T> {
    List<T> filter(List<T> list, Predicate<T> predicate);
}
public class GenericListFilterExample {
    public static void main(String[] args) {
        ListFilter<Integer> intFilter = (list, predicate) ->
                list.stream().filter(predicate).collect(Collectors.toList());
        ListFilter<String> stringFilter = (list, predicate) ->
                list.stream().filter(predicate).collect(Collectors.toList());
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = intFilter.filter(numbers, n -> n % 2 == 0);
        System.out.println("Even numbers: " + evenNumbers);
        List<String> words = Arrays.asList("apple", "bat", "carrot", "dog", "elephant");
        List<String> longWords = stringFilter.filter(words, s -> s.length() > 4);
        System.out.println("Words longer than 4 characters: " + longWords);
        List<String> vowelWords = stringFilter.filter(words,
                s -> s.matches("^[AEIOUaeiou].*"));
        System.out.println("Words starting with vowels: " + vowelWords);
    }
}