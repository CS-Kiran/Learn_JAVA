// Find First and Last Position of Element in Sorted Array -> LeetCode: 34

package BinarySearch;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 8, 10, 11, 12 };
        int target = 8;

        System.out.println(Arrays.toString(nums));
        System.out.println(target + " First and Last Position is : " + Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] arr, int target) {

        int[] result = { -1, -1 };
        int start = search(arr, target, true); // Finding start index
        int end = search(arr, target, false); // Finding end index

        result[0] = start;
        result[1] = end;

        return result;
    }

    static int search(int[] arr, int target, boolean isFindingStartIndex) {
        int start = 0;
        int end = arr.length - 1;
        
        int ans = -1; // Potential answer
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
            end = mid - 1;
            else if (target > arr[mid])
            start = mid + 1;
            else {
                ans = mid;
                // Recursively loop till we get start and end number
                if (isFindingStartIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
