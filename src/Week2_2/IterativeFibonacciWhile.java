package Week2_2;

import java.util.Scanner;

//In following case will be used while loop

public class IterativeFibonacciWhile {
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

        // Post-increment operator is used, cause variable should be incremented after evaluating expression
        int i=1;
        while(i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            int sumNumb = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sumNumb;
            i++;
        }
    }
}

