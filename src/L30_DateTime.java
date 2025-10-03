// L29_DateTime.java
// Java Date and Time API (java.time package)

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.Duration;

public class L30_DateTime {
    public static void main(String[] args) {

        // LocalDate → represents only date (year, month, day)
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1995, 5, 20);

        System.out.println("Today's Date: " + today);
        System.out.println("Birth Date: " + birthDate);

        // LocalTime → represents only time (hour, minute, second)
        LocalTime currentTime = LocalTime.now();
        LocalTime specificTime = LocalTime.of(14, 30, 15);

        System.out.println("Current Time: " + currentTime);
        System.out.println("Specific Time: " + specificTime);

        // LocalDateTime → combines date and time
        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime meetingTime = LocalDateTime.of(2025, 10, 3, 10, 0);

        System.out.println("Now (Date + Time): " + dateTimeNow);
        System.out.println("Meeting Time: " + meetingTime);

        // DateTimeFormatter → used to format date/time into readable text
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = dateTimeNow.format(formatter);
        System.out.println("Formatted Date-Time: " + formattedDate);

        // Period → difference between two dates (years, months, days)
        Period age = Period.between(birthDate, today);
        System.out.println("Age: " + age.getYears() + " years, "
                + age.getMonths() + " months, "
                + age.getDays() + " days");

        // Duration → difference between two times (hours, minutes, seconds)
        Duration timeDifference = Duration.between(specificTime, currentTime);
        System.out.println("Time Difference in Minutes: " + timeDifference.toMinutes());

        // Add or subtract dates and times
        LocalDate nextWeek = today.plusWeeks(1);
        LocalTime oneHourLater = currentTime.plusHours(1);

        System.out.println("Next Week: " + nextWeek);
        System.out.println("One Hour Later: " + oneHourLater);
    }
}

/*
SUMMARY:
- LocalDate → only date
- LocalTime → only time
- LocalDateTime → date + time
- DateTimeFormatter → custom display format
- Period → difference between two dates
- Duration → difference between two times
- plusDays(), minusWeeks(), plusHours() → to add/subtract time
*/
