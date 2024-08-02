package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
            {1,2,-1,6},
            {0,99,54},
            {36,-100,47,5,9},
            {8,7}
        };

        int target = -100;
        int target2 = -10010;

        boolean ans = search(nums, target);
        if(ans == true) System.out.println(target+" Found");
        else System.out.println(target+" not found");

        boolean ans2 = search(nums, target2);
        if(ans2 == true) System.out.println(target2+" Found");
        else System.out.println(target2+" not found");

        int[] ans3 = search2(nums, target);
        System.out.println(target+" Found at index -> "+Arrays.toString(ans3));
    }

    static boolean search(int[][] arr, int target){

        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++)
            {
                if(target == arr[row][col]) return true;
            }
        }

        return false;
    }

    static int[] search2(int[][] arr, int target){

        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++)
            {
                if(target == arr[row][col]) return new int []{row,col};
            }
        }

        return new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE};
    }
}
