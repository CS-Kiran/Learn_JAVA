package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {22, 35, 1, 89, 4, 70, 19, 0, 56};
        int target = 0;

        int ans = search(nums, target);
        if(ans == Integer.MAX_VALUE) System.out.println("Item not found");
        else System.out.println(target+" found at index : "+ans);

        int ans2 = search2(nums, target);
        if(ans2 == Integer.MAX_VALUE) System.out.println("Element not found");
        else System.out.println(target+" found : "+ans2);
    }

    // search in the array : return the index if item found, otherwise if item not found return Integer.MAX_VALUE;
    static int search(int[] arr, int target){

        // if the array contains -1 integer than this may cause confusion,
        // So we use Integer.MAX_VALUE -> it is a constant
        if(arr.length == 0) return Integer.MAX_VALUE;

        //run for loop to search
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) return i;
        }
        return Integer.MAX_VALUE;
    }

    // search in the array : return the element itself if item found, otherwise if item not found return Integer.MAX_VALUE;
    static int search2(int[] arr, int target){

        // if the array contains -1 integer than this may cause confusion,
        // So we use Integer.MAX_VALUE -> it is a constant
        if(arr.length == 0) return Integer.MAX_VALUE;

        //run for-each loop to search
        for(int element : arr){
            if(element==target) return element;
        }
        return Integer.MAX_VALUE;
    }


    // search in the array : return the true if found
    static boolean search3(int[] arr, int target){
        if(arr.length == 0) return false;

        //run for-each loop to search
        for(int element : arr){
            if(element==target) return true;
        }
        return false;
    }
}
