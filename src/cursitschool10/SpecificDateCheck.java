package cursitschool10;

import java.time.LocalDate;

public class SpecificDateCheck {
    public static boolean isTodaySpecificDate() {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Define the specific date
        LocalDate specificDate = LocalDate.of(2019, 12, 10);

        // Compare
        return today.equals(specificDate);
    }

    public static void main(String[] args) {
        System.out.println(isTodaySpecificDate());
    }
}


