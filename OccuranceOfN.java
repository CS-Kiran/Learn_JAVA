import java.util.Scanner;

public class OccuranceOfN {
	public static void main(String[] args){
		try (Scanner in = new Scanner(System.in)) {
			int count = 0;

			System.out.print("Enter the number : ");
			long num = in.nextLong();
			long temp = num;

			System.out.print("Enter the number for finding its occurance : ");
			int find = in.nextInt();

			while(temp > 0){
				int remainder = (int)(temp % 10); // type casting float -> integer
				if(remainder == find){
					count++;
				}
				temp = temp/10;
			}
			System.out.println("The occurence of "+find+" in "+num+" is : "+count);
		}
	}
}
