// Find the index of the Peak Element in the Mountain Array

package BinarySearch;

import java.util.Arrays;

public class PeakInMountain {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,6,4,0};
        System.out.println("INDEX of Peak Element in "+Arrays.toString(arr)+"is : "+peakElement(arr));
    }

    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decreasing part of array -> this may be answer or answer lies in
                // [s-------m   e]
                end = mid;
            } else {
                // you are in increasing part of array -> answer lies in [s     m,m+1-------e]
                start = mid + 1; // because we know that mid+1 > mid thus we ignore mid
            }

            // Loop will break when start = end = mid => peakElement because of the 2 checks above
        }

        return start; // you can return start or end as both point to same value
    }
}
