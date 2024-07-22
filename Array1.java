import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        int[] roll = { 1, 2, 3, 4, 5 };
        roll[4] = 99; // changing the element at index 4

        // For each loop
        for (int num : roll) { // for every element in array, print the element
            System.out.print(num + " "); // num represents elements of the array
        }

        System.out.println(" ");

        try (Scanner in = new Scanner(System.in)) {
            String[] names = new String[4]; // declaring and initializing string array of size 4
            System.out.println("Enter names [4] : ");
            for (int i = 0; i < names.length; i++) {
                names[i] = in.next();
            }

            System.out.println(Arrays.toString(names)); // Arrays.toString(names) displays the array in formatted way,
                                                        // internally uses for loop
        }
    }
}
