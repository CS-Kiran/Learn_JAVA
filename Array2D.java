import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[2][]; // column size not mandatory as there can be variable number of columns
        System.out.println(arr.length); // give no of cols

        int[][] arr2 = {
                { 1, 2, 3 }, // 0th array
                { 2, 4 }, // 1st array
                { 1, 3, 5, 7 } // 2nd array
        };

        int[][] arr1 = new int[3][2];
        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    System.out.print("Enter [" + i + "][" + j + "] element : ");
                    arr1[i][j] = in.nextInt();
                }
            }
        }

        System.out.println(" ");

        for (int[] num : arr1) {
            System.out.println(Arrays.toString(num));
        }

        System.out.println("arr2 => ");
        for (int[] num : arr2) {
            System.out.println(Arrays.toString(num));
        }

        // Other ways to print array :-

        // for (int row = 0; row < arr.length; row++) {
        //      System.out.println(Arrays.toString(arr[row]));
        // }

        // for (int row = 0; row < arr.length; row++) {
        //      for (int col = 0; col < arr[row].length; col++) {  ---> Here, we take every row ---> length of array at arr[row] <---
        //              System.out.print(arr[row][col] + " ");
        //      }
        //      System.out.println();
        // }

    }
}
