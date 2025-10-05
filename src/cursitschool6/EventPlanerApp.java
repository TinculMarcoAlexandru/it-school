package cursitschool6;

import java.time.LocalDateTime;

public class EventPlanerApp {
    public static void main(String[] args) {

        LocalDateTime eventDateTime = LocalDateTime.of(2025, 10, 5, 18, 30);
        LocalDateTime reminderDateTime = LocalDateTime.of(2025, 10, 4, 12, 0);

        Event event = new Event(
                "Sprint",
                "Annual business gooning conference",
                eventDateTime,
                reminderDateTime
        );

        System.out.println(event);
        System.out.println
                ("\nTime until event: " + event.timeUntilEvent().toHours() + " hours");
        System.out.println
                ("Time until reminder: " + event.timeUntilReminder().toHours() + " hours");
    }
}

