// Find the element in Bitonic / Mountain Array
package BinarySearch;

import java.util.Arrays;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 4, 6, 4, 2, 1 };
        int peak = peakElement(arr);
        int target = 2;

        System.out.println(Arrays.toString(arr) + " ===> target : " + target);
        System.out.println("Target at INDEX : " + binarySearch(arr, 0, peak, target) + " , "
                + binarySearch(arr, peak + 1, arr.length - 1, target));
    }

    // static int searchInMountain(int[] arr, int target) {
    // int peak = peakElement(arr);

    // int firstTry = binarySearch(arr, 0, peak, target);
    // if (firstTry != Integer.MAX_VALUE)
    // return firstTry;

    // return binarySearch(arr, peak + 1, arr.length - 1, target);
    // }

    
    // Return index of peak element in array
    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1])
                start = mid + 1;
            else
                end = mid;
        }
        return end;
    }


    // Using Array Agnostic Binary Search for Ascending and Descending Data
    static int binarySearch(int[] arr, int start, int end, int target) {
        if (arr[start] > arr[end]) {
            //System.out.println("Descending Array");
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid])
                    start = mid + 1;
                else if (target > arr[mid])
                    end = mid - 1;
                else
                    return mid;
            }
        } else {
            //System.out.println("Ascending Array");
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid])
                    end = mid - 1;
                else if (target > arr[mid])
                    start = mid + 1;
                else
                    return mid;
            }
        }

        return Integer.MAX_VALUE;
    }
}
