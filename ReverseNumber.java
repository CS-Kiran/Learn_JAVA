import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args){
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter the number : ");
			long num = in.nextLong();

			long ans = 0;
			while (num > 0){
				int rem = (int)(num % 10); // type casting float -> integer
				ans = ans*10 + rem;
				num /= 10;
			}
			System.out.println("Reverse number is : "+ans);
		}
	}
}
