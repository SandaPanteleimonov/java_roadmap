// Problem from javageeks.com

package Week6_2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Timezones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String timeString;
        DateTimeFormatter dfIn = DateTimeFormatter.ofPattern("d-MM-yyyy HH:mm");
        System.out.println("Type the time");
        timeString = sc.nextLine();
        LocalDateTime ldt = LocalDateTime.parse(timeString, dfIn);

        DateTimeFormatter dfOut = DateTimeFormatter.ofPattern("dd MMMM yyyy zzzz");
        ZoneId zone = ZoneId.of("Europe/Chisinau");
        System.out.println(dfOut.format(ldt.atZone(zone)));

        LocalDateTime ldt1 = LocalDateTime.parse("04-08-1986 12:30", dfIn);
        DateTimeFormatter dfOut1 = DateTimeFormatter.ofPattern("dd MMMM yyyy zzzz");
        ZoneId zone1 = ZoneId.of("America/Los_Angeles");
        System.out.println(dfOut1.format(ldt1.atZone(zone1)));

        LocalDateTime ldt2 = LocalDateTime.parse("04-08-1986 12:30", dfIn);
        DateTimeFormatter dfOut2 = DateTimeFormatter.ofPattern("dd MMMM yyyy zzzz");
        ZoneId zone2 = ZoneId.of("America/New_York");
        System.out.println(dfOut2.format(ldt.atZone(zone2)));

        LocalDateTime ldt3 = LocalDateTime.parse("04-08-1986 12:30", dfIn);
        DateTimeFormatter dfOut3 = DateTimeFormatter.ofPattern("dd MMMM yyyy zzzz");
        ZoneId zone3 = ZoneId.of("Asia/Tokyo");
        System.out.println(dfOut3.format(ldt.atZone(zone3)));

        LocalDateTime ldt4 = LocalDateTime.parse("04-08-1986 12:30", dfIn);
        DateTimeFormatter dfOut4 = DateTimeFormatter.ofPattern("dd MMMM yyyy zzzz");
        ZoneId zone4 = ZoneId.of("Europe/Paris");
        System.out.println(dfOut4.format(ldt.atZone(zone4)));

        LocalDateTime ldt5 = LocalDateTime.parse("04-08-1986 12:30", dfIn);
        DateTimeFormatter dfOut5 = DateTimeFormatter.ofPattern("dd MMMM yyyy zzzz");
        ZoneId zone5 = ZoneId.of("Europe/Moscow");
        System.out.println(dfOut5.format(ldt.atZone(zone5)));

        LocalDateTime ldt6 = LocalDateTime.parse("04-08-1986 12:30", dfIn);
        DateTimeFormatter dfOut6 = DateTimeFormatter.ofPattern("dd MMMM yyyy zzzz");
        ZoneId zone6 = ZoneId.of("Europe/Helsinki");
        System.out.println(dfOut6.format(ldt.atZone(zone6)));

        LocalDateTime ldt7 = LocalDateTime.parse("04-08-1986 12:30", dfIn);
        DateTimeFormatter dfOut7 = DateTimeFormatter.ofPattern("dd MMMM yyyy zzzz");
        ZoneId zone7 = ZoneId.of("Australia/Sydney");
        System.out.println(dfOut6.format(ldt.atZone(zone7)));
    }
}

