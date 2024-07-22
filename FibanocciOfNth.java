import java.util.Scanner;

public class FibanocciOfNth {
	public static void main (String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter starting 2 digits (a<=b) : ");
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.print("Enter the position for nth fibo number : ");
			int n = in.nextInt();

			int count = 2; // the a and b are assigned
			System.out.println("Fib series for number is : ");
			System.out.println(a);
			System.out.println(b);
			while (count<n){
				int temp = b;
				b=b+a;
				a=temp;
				System.out.println(b);
				count++;
			}
			System.out.println("The nth fibo number is : " + b);
		}
	}
}
