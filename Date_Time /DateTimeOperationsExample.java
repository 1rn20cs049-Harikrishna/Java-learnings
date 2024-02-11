/*
 * User Input (String): 29/01/2024 01:00 
 * - Add one day
 * - Substract 10 days 
 * - Add  1 hour 
 * - Substract 5 hours, 30 mins 
 * - Sort objects using Timestamp/Date
 */


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class DateTimeOperationsExample {

    public static void main(String[] args) {
        // User Input in String format
        String userInput = "29/01/2024 01:00";

        // Parse the user input to LocalDateTime using a DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(userInput, formatter);

        // Add one day
        LocalDateTime plusOneDay = dateTime.plusDays(1);
        System.out.println("After adding one day: " + plusOneDay);

        // Subtract 10 days
        LocalDateTime minusTenDays = dateTime.minusDays(10);
        System.out.println("After subtracting 10 days: " + minusTenDays);

        // Add 1 hour
        LocalDateTime plusOneHour = dateTime.plusHours(1);
        System.out.println("After adding 1 hour: " + plusOneHour);

        // Subtract 5 hours, 30 minutes
        LocalDateTime minusFiveHoursThirtyMinutes = dateTime.minusHours(5).minusMinutes(30);
        System.out.println("After subtracting 5 hours, 30 minutes: " + minusFiveHoursThirtyMinutes);

        // Create a list of LocalDateTime objects
        List<LocalDateTime> dateTimes = new ArrayList<>();
        dateTimes.add(plusOneDay);
        dateTimes.add(minusTenDays);
        dateTimes.add(plusOneHour);
        dateTimes.add(minusFiveHoursThirtyMinutes);

        System.out.println("Before sorting:");
        dateTimes.forEach(System.out::println);

        // Sort using Collections.sort with a custom comparator
        Collections.sort(dateTimes, Comparator.naturalOrder());

        System.out.println("\nAfter sorting:");
        dateTimes.forEach(System.out::println);
    }
}
