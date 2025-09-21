package cursitschool10;

import java.time.LocalDate;

public class SpecificDateCreator {
    public static LocalDate createSpecificDate() {
        return LocalDate.of(2025, 8, 19);
    }

    public static void main(String[] args) {
        LocalDate date = createSpecificDate();
        System.out.println("Specific Date: " + date);
    }
}


