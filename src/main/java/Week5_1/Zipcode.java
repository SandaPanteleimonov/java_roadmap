package Week5_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zipcode {

    private static final String regex = "MD-\\d{4}";

    //Main method for calculating zip codes
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = in.nextLine();
        countZipCodes(text);
    }

    // Method for identifying matches
    static void countZipCodes(String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        long zipCodeMatch = matcher.results().count();
        System.out.println(zipCodeMatch);
    }
}


