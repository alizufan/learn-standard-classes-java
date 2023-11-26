package DateCalendar;

import java.util.Calendar;
import java.util.Date;

// # Date and Calendar
//   - Every programming language usually has a date representation,
//     in Java it is the same, there are Date & Calendar classes that
//     we can use as date representation.
//   - Actually, in Java 8 there is a new way to manipulate dates using
//     the Java Date Time API, but we will discuss that in a separate course.
//   - Now we will focus on using the Date and Calendar classes.
//
// # Relationship between Date and Calendar
//   - The Date class is a date representation class to millisecond precision.
//   - However, in the Date class, many methods have been deprecated, so to manipulate dates,
//     we now have to combine the Date and Calendar classes.
//   - Simply Date for date representation, and Calendar for manipulating dates.
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Date.html
//   - https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Calendar.html
//
public class DateCalendarApp {
  public static void main(String[] args) {
    Date date = new Date();
    long millis = date.getTime();

    System.out.println(date);
    System.out.println(millis);

    System.out.println();

    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 2000);
    calendar.set(Calendar.MONTH, Calendar.JANUARY);
    calendar.set(Calendar.HOUR_OF_DAY, 10);

    Date calendarDate = calendar.getTime();
    System.out.println(calendarDate);


  }
}
