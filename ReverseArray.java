import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
    
        int[] num = {1,2,6,5,8,7,0};
        System.out.println(Arrays.toString(num));

        reverse(num);
        System.out.println("Reversed array -> " + Arrays.toString(num));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    // swapping the elements at index 0 and last -> {start++ & end--} -> swap , until start <end
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1; //Since we are taking index value therefore end = lenthg-1;

        while (end > start) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}
