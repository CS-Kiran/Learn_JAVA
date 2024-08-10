// Return the greatest number smaller that or equal to target number
package BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 17;

        System.out.println("Floor of " + target + " is : " + arr[floorNumber(arr, target)]);
    }

    static int floorNumber(int[] arr, int target) {
        
        // if smallest number in array is greater than target 
        if(arr[0] > target) return Integer.MIN_VALUE;
        // if largest number in array is smaller than target 
        if(arr[arr.length - 1] < target) return Integer.MAX_VALUE;
        
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
            else
                return mid;
        }
        return end;
    }
}
