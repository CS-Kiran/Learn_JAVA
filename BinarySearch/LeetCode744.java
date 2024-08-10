// Find the Smallest Letter Greater Than The Target -> LeetCode 744
package BinarySearch;

public class LeetCode744 {
    public static void main(String[] args) {

        char[] arr = { 'c', 'd', 'f', 'j' };
        char target = 'j';

        System.out.println("Smallest Element Greater that '" + target + "' is : " + smallestLetter(arr, target));

    }

    static char smallestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;   // Note that the start should be in else so that it can be incremented when 'char'=='char'.
        }
        return arr[start % arr.length];
    }
}
