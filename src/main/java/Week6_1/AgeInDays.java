package Week6_1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class AgeInDays {

        public static Date StringToDate(String dateBirth) throws ParseException{

            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

            //Parsing the String to Date
            Date date = formatter.parse(dateBirth);
            System.out.println("Date: "+date);
            return date;
        }

        public static void main(String[] args) throws ParseException {
            //Reading name and date of birth from the user
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = sc.next();
            System.out.println("Enter date of birth in format dd-MM-yyyy: ");
            String dob = sc.next();

            //Parsing the String to Date
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            Date date = formatter.parse(dob);

            //Convert from Date to LocalDate
            Instant instant = date.toInstant();
            ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
            LocalDate givenDate = zone.toLocalDate();

            //Calculating the difference between given date to current date. Conversion in days.
            System.out.print("Hello "+name+" your current age is: ");
            long noOfDaysBetween = ChronoUnit.DAYS.between(givenDate, LocalDate.now());
            System.out.println(noOfDaysBetween+" days");
        }
}