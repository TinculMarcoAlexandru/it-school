package cursitschool24;
@FunctionalInterface
interface StringComparator {
    int compare(String s1, String s2);}
public class LambdaStringComparator {
    public static void main(String[] args) {
        StringComparator lengthComparator =
                (s1, s2) -> Integer.compare(s1.length(), s2.length());
        String a = "apple";
        String b = "banana";
        int result = lengthComparator.compare(a, b);
        if (result < 0) {
            System.out.println(a + " is shorter than " + b);
        } else if (result > 0) {
            System.out.println(a + " is longer than " + b);
        } else {
            System.out.println(a + " and " + b + " are of equal length");
        }
        java.util.List<String> words = java.util.Arrays.asList
                ("pear", "kiwi", "pineapple", "apple");
        words.sort(lengthComparator::compare);
        System.out.println("Sorted by length: " + words);
    }
}