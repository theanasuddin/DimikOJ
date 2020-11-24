package dimikOJ;

import java.util.Scanner;

public class Problem39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t < 1) {
			t = input.nextInt();
		}
		input.nextLine();
		String[] inputs = new String[t];

		for (int i = 0; i < t; i++) {
			String temp = input.nextLine();
			inputs[i] = temp.trim();
		}
		input.close();

		for (int i = 0; i < inputs.length; i++) {
			if (isPalindrome(inputs[i])) {
				System.out.println("Yes! It is Palindrome!");
			} else {
				System.out.println("Sorry! It is not Palindrome!");
			}
		}

	}

	public static boolean isPalindrome(String s) {
		boolean ans = false;
		int j = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(j)) {
				ans = true;
			} else {
				ans = false;
				return ans;
			}
			j--;
		}
		return ans;
	}

}