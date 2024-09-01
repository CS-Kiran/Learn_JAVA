package BinarySearch;

import java.util.Arrays;

public class RSADuplicateValue {
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

    static int searchElement(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);

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
