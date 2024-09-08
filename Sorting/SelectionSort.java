package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find max element and swap with correct position.
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swapArray(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    static void swapArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
