package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {-18, -4, -1, 0, 2, 3, 6, 9, 11, 12, 14, 20, 36, 48}; //Sorted Array
        int target = -1;

        if(binarySearch(nums, target) == Integer.MAX_VALUE) System.out.println(target+" Not Found");
        else System.out.println(target+" found at index : "+binarySearch(nums, target));
    }

    // return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find mid element in more efficient way so that mid does not exceed the limit of int;
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]){
                start = mid+1;
            } else{
                return mid;
            }
        }
        return Integer.MAX_VALUE;
    }
}
