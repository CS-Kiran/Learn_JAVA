// Leet-code : 410  --> GOOGLE  --> Hard  ---*IMP*---
// Given an array "nums" and an non-negative integer "m", you can split array into "m" continuous sub-arrays.
// Write algorithm to minimize the largest sum of these "m" sub-arrays;

package BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;

        System.out.println("Largest Sum of Split Sub array : "+ splitArray(nums, m));
    }

    static int splitArray(int[] arr, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            start = Math.max(start, arr[i]); // int hen end of loop this will contain the max array
            end += arr[i];
        }

        // now we apply binary search
        while (start < end) {
            // try for middle as potential answer.
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this with max sum
            int sum = 0;
            int pieces = 1; // count for number of suarrays
            for (int num : arr) {
                if (sum + num > mid) {
                    // you cannot add this in subarray
                    // Add new subarray , then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }

                if (pieces > m)
                    start = mid + 1;
                else
                    end = mid;
            }
        }

        return start; // since at last start = end ---> you can also return end here;
    }
}
