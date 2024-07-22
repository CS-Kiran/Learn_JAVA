// suppose a number 153 -> (1)^3 + (5)^3 + (3)^3 = 1 + 125 + 27 = 153
// addition of cube of every digit of number is equal to the number is called Amstrong number

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int num = input.nextInt();

            int ans = isAmstrong(num);

            if (ans == num) {
                System.out.println(num + " is an Amstrong");
            } else {
                System.out.println(num + " is an not Amstrong");
            }
        }
        
        // All 3 digit amstrong numbers
        System.out.print("All 3 digit Amstrong numbers : ");
        for (int i = 100; i <= 999; i++) {
            int ams = isAmstrong(i);
            if (ams == i) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(" ");
    }

    static int isAmstrong(int temp) {
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            sum += rem * rem * rem;
        }
        return sum;
    }
}
