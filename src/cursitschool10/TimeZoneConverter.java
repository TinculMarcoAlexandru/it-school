package cursitschool10;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZoneConverter {
    public static void convertToTimeZone() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter date and time (YYYY-MM-DD HH:MM:SS): ");
        String dateTimeStr = scanner.nextLine();


        System.out.print("Enter timezone (e.g., EST, PST, UTC, Asia/Kolkata): ");
        String timeZoneStr = scanner.nextLine();

        try {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, formatter);

            // Assume input is in system default timezone
            ZonedDateTime systemZonedDateTime = localDateTime.atZone(ZoneId.systemDefault());

            // Convert to specified timezone
            ZonedDateTime targetZonedDateTime =
                    systemZonedDateTime.withZoneSameInstant(ZoneId.of(timeZoneStr));

            // Show result
            System.out.println("Converted Date and Time in " + timeZoneStr + ": " +
                    targetZonedDateTime.format(formatter));
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid date-time and timezone.");
        }
    }

    public static void main(String[] args) {
        convertToTimeZone();
    }
}


