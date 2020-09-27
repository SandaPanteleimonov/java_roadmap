package Week3_1;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String args[]) {
        int row1, column1, row2, column2, sum = 0, i, j, k;

        //Introduce number of rows, columns and elements with Scanner.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        row1 = in.nextInt();
        column1= in.nextInt();

        int first_matrix[][] = new int[row1][column1];

        System.out.println("Enter elements of first matrix");

        for (i = 0; i < row1; i++)
            for (j = 0; j < column1; j++)
                first_matrix[i][j] = in.nextInt();

        System.out.println("Enter the number of rows and columns of second matrix");
        row2 = in.nextInt();
        column2 = in.nextInt();

        int second_matrix[][] = new int[row2][column2];

        //Control flow
        if (column1 != row2)
            System.out.println("The matrices can't be multiplied with each other.");
        else
        {
            int multiplication[][] = new int[row1][column2];

            System.out.println("Enter elements of second matrix");

            for (i = 0; i < row2; i++)
                for (j = 0; j < column2; j++)
                    second_matrix[i][j] = in.nextInt();

            for (i = 0; i < row1; i++) {
                for (j = 0; j < column2; j++) {
                    for (k = 0; k < row2; k++)
                        sum = sum + first_matrix[i][k]*second_matrix[k][j];

                    multiplication[i][j] = sum;
                    sum = 0;
                }
            }

            System.out.println("Product of the matrices:");

            for (i = 0; i < row1; i++) {
                for (j = 0; j < column2; j++)
                    System.out.print(multiplication[i][j]+"\t");

                System.out.print("\n");
            }
        }
    }
}
