package LinearSearch;

import java.util.Arrays;

public class FindMinMax {
    public static void main(String[] args) {
        int[] nums = {22, 35, -1, 89, 4, 70, 19, 0, -56};
        System.out.println("Array  -> "+Arrays.toString(nums));

        System.out.println("Min value of Array is : "+minValue(nums));
        System.out.println("Max value of Array is : "+maxValue(nums));
    }

    static int minValue(int[] arr){
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if(min > arr[i]) min = arr[i];
        }

        return min;
    }

    static int maxValue(int[] arr){
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }

        return max;
    }

}
