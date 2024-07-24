import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] nums = {1 ,3,5,7,9};
        System.out.println(Arrays.toString(nums));

        swap(nums, 0, 3);
        System.out.print("After swapping0-3 => ");
        System.out.println(Arrays.toString(nums));

        System.out.println("Max number in array -> "+ maximum(nums));
        System.out.println("Max number in array range 1 - 3 is -> "+ maxInRange(nums, 1, 3));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static int maximum(int[] arr){
        int max= arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max=arr[i];
            } else {            // No need of else
                continue;
            }
        }
        return max;
    }

    // we can work on edge cases here
    static int maxInRange(int[] arr, int start, int end){
        
        if(end < start){
            return -1;
        }
        
        int max = arr[start];
        for(int i=start; i<end; i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
