package cursitschool3;

public class NumberPrinter {
    public static void main(String[] args) {
        // Part 1: Print numbers from 1 to 10
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // Line break

        // Part 2: Print only even numbers from 1 to 10
        System.out.println("Even numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}