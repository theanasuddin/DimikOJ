package dimikOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 100) {
			T = input.nextInt();
		}
		String[] lines = new String[T];

		for (int i = 0; i < T; i++) {
			String temp = input.nextLine();
			int length = temp.trim().length();
			while (length < 1 || length > 100) {
				temp = input.nextLine();
				length = temp.trim().length();
			}
			lines[i] = temp.trim().replaceAll("\\s", "");
		}
		input.close();

		for (int i = 0; i < lines.length; i++) {
			ArrayList<Character> consonents = new ArrayList<Character>();
			for (int j = 0; j < lines[i].length(); j++) {
				if (isVowel(lines[i].charAt(j))) {
					System.out.print(lines[i].charAt(j));
				} else {
					consonents.add(lines[i].charAt(j));
				}
			}
			System.out.println();
			for (Character character : consonents) {
				System.out.print(character);
			}
			System.out.println();
		}

	}

	public static boolean isVowel(char letter) {
		char c = Character.toLowerCase(letter);
		boolean isVowel = false;
		switch (c) {
		case 'a':
			isVowel = true;
			break;

		case 'e':
			isVowel = true;
			break;

		case 'i':
			isVowel = true;
			break;

		case 'o':
			isVowel = true;
			break;

		case 'u':
			isVowel = true;
			break;
		}
		return isVowel;
	}

}
