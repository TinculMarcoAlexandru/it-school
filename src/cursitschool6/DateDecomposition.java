package cursitschool6;

import java.time.LocalDate;

public class DateDecomposition {
    public static void displayDateComponents(String dateStr) {
        // Parse the string into a LocalDate
        LocalDate date = LocalDate.parse(dateStr);

        // Extract year, month, and day
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        // Print results
        System.out.println("Year: " + year);
        System.out.println("Month: " + String.format("%02d", month));
        System.out.println("Day: " + String.format("%02d", day));
    }

    public static void main(String[] args) {
        // Example usage
        String inputDate = "2025-09-21";
        displayDateComponents(inputDate);
    }
}
