package cursitschool3;

public class ComparisonExample  {
    public static void main(String[] args) {
        // Comparing integers using equality operator
        int firstNumber = 10;
        int secondNumber = 20;

        boolean numberComparison = (firstNumber == secondNumber);
        System.out.println("Are the two numbers equal? " + numberComparison);

        // Comparing Strings using equals() method
        String firstString = "Hello";
        String secondString = "Hello";

        boolean stringComparison = firstString.equals(secondString);
        System.out.println("Are the two strings equal? " + stringComparison);
    }
}
