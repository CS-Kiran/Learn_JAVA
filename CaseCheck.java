import java.util.Scanner;

public class CaseCheck {
	public static void main (String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter character / word : ");
			char ch = in.next().trim().charAt(0);

			if (ch >= 'a' && ch <= 'z'){
				System.out.println("Lowercase");
			} else {
				System.out.println("Uppercase");
			}
		}

	}
}
