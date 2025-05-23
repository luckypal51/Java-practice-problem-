package Recurssion;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] a = {10, 80, 30, 90, 40, 50, 70};
        quick(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));  // The array is sorted in-place
    }

    public static void quick(int[] arr, int low, int high) {
        if (low < high) { // Correct base case
            int part = partition(arr, low, high);
            quick(arr, low, part - 1); // Sort left partition
            quick(arr, part + 1, high); // Sort right partition
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Last element as pivot
        int i = low - 1; // Pointer for smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // Swap if element is smaller than pivot
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return pivot index
    }
}
