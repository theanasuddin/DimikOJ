package dimikOJ;

import java.util.Scanner;

public class Problem54 {

	public static boolean validtaeString(String str) {
		str = str.toLowerCase();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (!(ch >= 'a' && ch <= 'z')) {
				return false;
			}
		}
		return true;
	}

	public static String checkCollision(String strOne, String strTwo) {
		int keyOne = 1, keyTwo = 1;

		for (int i = 0; i < strOne.length(); i++) {
			int ascii = strOne.charAt(i);
			keyOne = keyOne * ascii;
		}

		for (int i = 0; i < strTwo.length(); i++) {
			int ascii = strTwo.charAt(i);
			keyTwo = keyTwo * ascii;
		}

		keyOne = keyOne % 97;
		keyTwo = keyTwo % 97;

		if (keyOne == keyTwo) {
			return "YES";
		} else {
			return "NO";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String strOne, strTwo;
		int strOneLength, strTwoLength;

		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();

		for (int i = 0; i < T; i++) {
			strOne = input.next();
			strOneLength = strOne.length();

			while (strOneLength < 1 || strOneLength > 20 || validtaeString(strOne) == false) {
				strOne = input.next();
				strOneLength = strOne.length();
			}

			strTwo = input.next();
			strTwoLength = strTwo.length();

			while (strTwoLength < 1 || strTwoLength > 20 || validtaeString(strTwo) == false) {
				strTwo = input.next();
				strTwoLength = strTwo.length();
			}
			System.out.printf("%s\n", checkCollision(strOne, strTwo));
		}
		input.close();
	}

}
