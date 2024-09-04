// here we start searching from [0,3(or last col element)] 
//       -> if element > target => all elements in that col will be greater than target, thus we can ignore that column ---> col-- ;
//       -> if element < target => all elements in that row are smaller than target, thus we can ignore that row ---> row++;
//       -> if element == target => element found ---> return {row,col} else {-1,-1};

package MatrixArraySearch;

import java.util.Arrays;

public class OptimizedSearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int target = 7;

        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
        
        System.out.println(target + " Found at INDEX : " + Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return new int[] { row, col };
            else if (matrix[row][col] > target)
                col--;
            else
                row++;
        }

        return new int[] { -1, -1 };
    }
}