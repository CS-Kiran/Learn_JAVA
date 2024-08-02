package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {22, 35, -1, 89, 4, 70, 19, 0, -56};
        int target = 0;

        int ans = search(nums, 1,7 ,target);
        if(ans == Integer.MAX_VALUE) System.out.println(target+" not found in index range 1 -7");
        else System.out.println(target+" found at index : "+ans);

        int ans2 = search(nums, 1,5 ,target);
        if(ans2 == Integer.MAX_VALUE) System.out.println(target+" not found in index range 1 - 5");
        else System.out.println(target+" found at index : "+ans2);
    }

    static int search(int[] arr, int start, int end, int target){
        if(arr.length == 0) return Integer.MAX_VALUE;

        for(int i=start; i<=end; i++){
            if(arr[i] == target) return i;
        }

        return Integer.MAX_VALUE;
    }
}
