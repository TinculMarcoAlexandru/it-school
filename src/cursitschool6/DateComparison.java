package cursitschool6;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static boolean areDatesEqual() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first date (1996-09-28): ");
        String date1Str = scanner.nextLine();

        System.out.print("Enter second date (1996-08-31): ");
        String date2Str = scanner.nextLine();


        LocalDate date1 = LocalDate.parse(date1Str);
        LocalDate date2 = LocalDate.parse(date2Str);


        return date1.equals(date2);
    }

    public static void main(String[] args) {
        boolean result = areDatesEqual();
        System.out.println(result);
    }
}

