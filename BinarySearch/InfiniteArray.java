// Find Position of an element is a sorted array of Infinite Numbers

// Since array is infinite, not length function can be used and we don't know  start and end
// So we search in chunk
package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 25, 26, 27, 28,
                29, 30, 31, 32 };
        int target = 32;
        if (searchInChunk(nums, target) == -1)
            System.out.println(target + " Not Found");
        else
            System.out.println(target + " Found at index : " + searchInChunk(nums, target));
    }

    static int searchInChunk(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;

            //double the box size ---> previous end + (size of box ) * 2
            end = end + (end - start + 1) * 2; // This formula will prevent the array out of bound error
            // This is formula to calculate length of str
            
            start = temp;
        }
        return search(arr, start, end, target);
    }

    static int search(int[] chunk, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < chunk[mid])
                end = mid - 1;
            else if (target > chunk[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }

}
