// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

package LinearSearch;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {437,315,322,431,686,264,442};

        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int ans = 0;

        for(int num : nums){
            int count = 0;
            while(num > 0){
                count ++;
                num /= 10;
            }
            if(count % 2 == 0) ans++;
        }
        return ans;
    }

    // Optimized Code
    static int findNumbersOptimized(int[] nums) {
        int ans = 0;

        for(int num : nums){
            // type casting to int to get the number of digits
            //  to get number of digits in a number we use log10(num) + 1
            //  if to get number of digits in a binary we use log2(num) + 1
            if((int)(Math.log10(num) + 1) % 2 == 0) ans++;
        }
        return ans;
    }
}