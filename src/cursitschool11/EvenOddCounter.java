package cursitschool11;

public class EvenOddCounter {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 9, 24, 5, 18, 11, 6, 3, 14};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}


