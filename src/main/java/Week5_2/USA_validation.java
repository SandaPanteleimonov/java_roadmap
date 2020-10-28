package Week5_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USA_validation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Type following numbers for validation:\n1 - E-mail validation; \n2 - Phone number validation; \n3 - Street validation; \n4 - City validation; \n5 - State validation; \n");
        int field = in.nextInt();
        process(field);

    }

    static void validation(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        long matches = matcher.results().count();
        if (matches==1) {
            System.out.println("Valid information");
        } else {
            System.out.println("Invalid information");}
    }

    static void process (int field) {
        Scanner in = new Scanner(System.in);
        String user;
        String regex;
        switch (field) {
            case 1 -> {
                System.out.println("Enter email: ");
                user = in.nextLine();
                regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
                validation(user, regex);
            }
            case 2 -> {
                System.out.println("Enter phone number: ");
                user = in.nextLine();
                regex = "^\\(*[0-9]{3}\\)*[-\\s]*[0-9]{3}[-\\s]*[0-9]{4}$";
                validation(user, regex);
            }
            case 3 -> {
                System.out.println("Enter street address: ");
                user = in.nextLine();
                regex = "\\\\d+\\\\s+([a-zA-Z]+|[a-zA-Z]+\\\\s[a-zA-Z]+)";
                validation(user, regex);
            }
            case 4 -> {
                System.out.println("Enter city: ");
                user = in.nextLine();
                regex = "([a-zA-Z]+|[a-zA-Z]+\\\\s[a-zA-Z]+)";
                validation(user, regex);
            }
            case 5 -> {
                System.out.println("Enter state: ");
                user = in.nextLine();
                regex = "([a-zA-Z]+|[a-zA-Z]+\\\\s[a-zA-Z]+)";
                validation(user, regex);
            }
        }
    }
}
