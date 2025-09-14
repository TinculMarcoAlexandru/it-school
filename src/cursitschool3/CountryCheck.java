package cursitschool3;

public class CountryCheck {
        public static void main(String[] args) {
            String countryOne = "Romania";
            String countryTwo = "UGANDA";

            // First comparison
            boolean firstComparison = countryOne.equals(countryTwo);
            System.out.println("Are countryOne and countryTwo equal? " + firstComparison);

            // Change value of countryTwo
            countryTwo = "UGANDA";

            // Second comparison
            boolean secondComparison = countryOne.equals(countryTwo);
            System.out.println("Are countryOne and countryTwo equal after change? "
                    + secondComparison);
        }
    }

