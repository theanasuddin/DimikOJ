package dimikOJ;

import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 100) {
			T = input.nextInt();
		}
		String[] inputs = new String[T];

		for (int i = 0; i < inputs.length; i++) {
			String temp = input.nextLine();
			int length = temp.length();

			while (length < 1 || length > 1000) {
				temp = input.nextLine();
				length = temp.length();
			}
			inputs[i] = temp;
		}
		for (int i = 0; i < inputs.length; i++) {
			System.out.println("Number of vowels = " + noOfVowel(inputs[i]));
		}

	}

	public static int noOfVowel(String s) {
		int vowels = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}
		}
		return vowels;

	}
}
