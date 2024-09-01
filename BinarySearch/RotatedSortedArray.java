package BinarySearch;

import java.util.Arrays;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6;

        System.out.println(Arrays.toString(nums));

        int ans = searchElement(nums, target);
        if (ans != -1)
            System.out.println(target + " Found at index " + ans);
        else
            System.out.println(target + " NOT Found");
    }

    
    // this will NOT work in case of duplicate values
    static int searchElement(int[] arr, int target) {
        int pivot = findPivot(arr);

        // array is not rotated
        if (pivot == -1)
            return binarySearch(arr, target, 0, arr.length - 1);

        // if array is rotated
        else {
            if (arr[pivot] == target)
                return pivot;
            if (arr[0] <= target)
                return binarySearch(arr, target, 0, pivot - 1);
            else
                return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

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

    // to be used when no pivot is found;
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
