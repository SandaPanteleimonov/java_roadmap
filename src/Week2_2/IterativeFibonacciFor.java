package Week2_2;

import java.util.Scanner;

//In following case will be used for loop

public class IterativeFibonacciFor {
    public static void main(String[] args)
    {
        /* Variable for number of elements, required in the Fibonacci Series will be declared below as maxNumber.
         Also is necessary to declare variables for first numbers of series.
         The first two Fibonacci numbers are 0 and 1; each remaining number is the sum of the previous two.
         */

        int maxNumber;
        int previousNumber = 0;
        int nextNumber = 1;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter max number: ");
        maxNumber = keyboard.nextInt();

        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        // ++i increments the number before the expression is evaluated (pre-incremented operator)
        for (int i = 1; i <= maxNumber; ++i)
        {
            System.out.print(previousNumber+" ");
            // On each iteration, second number is assigned to the first number; the sum of last two is assigned to the second number.

            int sumNumber = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sumNumber;
        }
    }
}