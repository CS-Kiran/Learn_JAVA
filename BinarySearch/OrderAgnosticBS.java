package BinarySearch;

import java.util.Arrays;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int nums1[] = {-18, -4, -1, 0, 2, 3, 6, 9, 11, 12, 14, 20, 36, 48}; //Sorted Array Ascending Order
        int temp[] = {-18, -4, -1, 0, 2, 3, 6, 9, 11, 12, 14, 20, 36, 48}; //temporary Sorted Array Ascending Order so that reverseArray method does not change the value of nums1[] array due to pass by value of primitive datatype
        int[] nums2 = reverseArray(temp); // Sorted Array in Descending Order

        int target = -1;

        System.out.println("Array : "+Arrays.toString(nums1));
        System.out.println("Array : "+Arrays.toString(nums2));
        System.out.println("Target : "+target);

        System.out.println(target+" found at index : "+orderAgnosticBS(nums1, target));
        System.out.println(target+" found at index : "+orderAgnosticBS(nums2, target));

    }

    // Reversing the array
    static int[] reverseArray(int[] arr){
        int s =0;
        int e =arr.length-1;

        while(e>s){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;

            s++;
            e--;
        }
        return arr;
    }

    // Order Agnostic Binary Search
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] > arr[end]) {
            System.out.println("Descending Array");
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
            System.out.println("Ascending Array");
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
