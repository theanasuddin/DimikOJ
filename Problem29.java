package dimikOJ;

import java.util.Scanner;

public class Problem29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();
		char[] chars = new char[T];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = input.nextLine().charAt(0);
		}

		for (char m : chars) {
			if (m >= 97 && m <= 123) {
				System.out.println("Lowercase Character");
			} else if (m >= 65 && m <= 96) {
				System.out.println("Uppercase Character");
			} else if (m >= 48 && m <= 57) {
				System.out.println("Numerical Digit");
			} else {
				System.out.println("Special Character");
			}
		}

	}

}
