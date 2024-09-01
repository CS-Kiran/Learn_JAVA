package BinarySearch;

import java.util.Arrays;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };

        int ans = findPivot(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("Array is rotated  " + (ans + 1) + " times.");
    }

    // use for non duplicate elements
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases implement here
            if (mid < end && arr[mid] > arr[mid + 1]) // make sure mid+1 does not exceed the array range
                return mid;

            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // use this for duplicate elements in array
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases implement here
            if (mid < end && arr[mid] > arr[mid + 1]) // make sure mid+1 does not exceed the array range
                return mid;

            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            // if elements at start,mid,end are equal then skip the duplicate values
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {

                if (arr[start] > arr[start + 1])
                    return start; // if duplicate element is pivot
                start++; // skip duplicate

                if (arr[end] < arr[end - 1])
                    return end - 1;
                end--; // skip duplicate
            }

            // left side is sorted, so pivot should be on right side array
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
