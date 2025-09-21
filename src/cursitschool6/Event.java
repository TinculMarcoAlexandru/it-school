package cursitschool6;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {
    private String eventName;
    private String eventDescription;
    private LocalDateTime eventDateTime;
    private LocalDateTime reminderDateTime;

    // Constructor
    public Event(String eventName, String eventDescription, LocalDateTime eventDateTime, LocalDateTime reminderDateTime) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDateTime = eventDateTime;
        this.reminderDateTime = reminderDateTime;
    }

    // Getters and Setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(LocalDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(LocalDateTime reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    // Method to calculate time until event
    public Duration timeUntilEvent() {
        return Duration.between(LocalDateTime.now(), eventDateTime);
    }

    // Method to calculate time until reminder
    public Duration timeUntilReminder() {
        return Duration.between(LocalDateTime.now(), reminderDateTime);
    }

    // Utility method to display event details
    @Override
    public String toString() {
        return "Event: " + eventName +
                "\nDescription: " + eventDescription +
                "\nEvent Date & Time: " + eventDateTime +
                "\nReminder Date & Time: " + reminderDateTime;
    }
}
