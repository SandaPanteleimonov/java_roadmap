package Week3_2;

import java.util.Scanner;
public class SortArray
{
    public static void main(String[] args) {
        //Generate array
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        n = s.nextInt();
        int array[] = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        //First sorting - descending order
        long start1 =System.currentTimeMillis();

        System.out.println("Descending Order:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[n - 1]);

        long end1 =System.currentTimeMillis();
        System.out.println(end1-start1);

        //Second sorting - ascending order
        long start2 =System.currentTimeMillis();

        System.out.println("Ascending Order:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[n - 1]);

        long end2 =System.currentTimeMillis();
        System.out.println(end2-start2);
    }
}






