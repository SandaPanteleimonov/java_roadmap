package Week3_3;

import java.util.Arrays;
import java.util.Scanner;

public class SortArraySecondWay {

    //Bubble Sort
    static void bubbleSort(int array[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If two elements were not swapped by inner loop, break
            if (swapped == false)
                break;
        }
    }

    static void printArray(int array[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    // Recursive BubbleSort
    static void bubbleSort1(int array[], int n) {
        if (n == 1)
            return;

        for (int i = 0; i < n - 1; i++)
            if (array[i] > array[i + 1]) {
                // swap arr[i], arr[i+1]
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }

        // Largest element is fixed, recur for remaining array
        bubbleSort1(array, n - 1);
    }

    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        n = s.nextInt();
        int array[] = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
            bubbleSort(array, n);
            System.out.println("Sorted array: ");
            printArray(array, n);

            bubbleSort1(array, array.length);

            System.out.println("Sorted array : ");
            System.out.println(Arrays.toString(array));
        }
    }
}
