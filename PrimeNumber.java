import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int num = input.nextInt();

            boolean ans = isPrime(num);
            if(ans == true){
                System.out.println(num + " is Prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }
    }

    static boolean isPrime(int temp){
        if(temp <= 1){
            return false;
        }
        int c = 2;

        // If square of a number is less than = temp and (temp % number) is zero then it is prime else is not.
        while (c*c <=  temp){
            if(temp % c == 0){
                return false;
            }
            c++;
        }
        if (c*c > temp){
            return true;
        }
        return false;
    }
}
