package dimikOJ;

import java.util.Scanner;

public class Problem73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		int length = str.trim().replaceAll("\\s{2,}", " ").length();
		while (length > 200 || length < 1) {
			str = input.nextLine();
			length = str.trim().replaceAll("\\s{2,}", " ").length();
		}
		input.close();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
