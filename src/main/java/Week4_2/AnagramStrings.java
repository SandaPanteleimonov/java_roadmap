package Week4_2;

import java.util.Arrays;
import java.util.Scanner;

class AnagramStrings {
    public static void main(String[] args) {
        //Generate strings
        String string1, string2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string:");
        string1 = in.nextLine();
        System.out.println("Enter second string:");
        string2 = in.nextLine();

        //First condition - check if length of strings is the same
        if(string1.length() == string2.length()) {

            // Convert strings to char array
            char[] charArray1 = string1.toCharArray();
            char[] charArray2 = string2.toCharArray();

            // Sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Check if sorted char arrays are identical
            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(string1 + " and " + string2 + " are an anagram.");
            }
            else {
                System.out.println(string1 + " and " + string2 + " are not an anagram.");
            }
        }
        else
            System.out.println(string1 + " and " + string2 + " are not an anagram.");
    }
}
