package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Here we can add boolean swap = false;  --> that will break the loop if array is sorted. 
    static void bubbleSort(int[] arr) {
        //  boolean swap = false;
        
        // run steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            
            // The greatest element in array comes at last in each step
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    // swap = true;
                }
            }
            //  if(!swap)    break;
        }
    }
}