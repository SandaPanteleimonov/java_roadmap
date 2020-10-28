package Week4_1;

import java.util.*;

class StringPalindrome
{
    public static void main(String args[])
    {
        // Initialize strings
        String reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string:");
        String string = in.nextLine();
        System.out.println("Enter second string:");
        String string1 = in.nextLine();


        //Reverse the second string
        int length = string.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + string.charAt(i);

        //Compare with first string
        if (string1.equalsIgnoreCase(reverse))
            System.out.println("The strings are palindromes.");
        else
            System.out.println("The strings are not palindromes.");
    }
}
