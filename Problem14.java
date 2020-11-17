package dimikOJ;

import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 100) {
			T = input.nextInt();
		}
		String[] sentences = new String[T];
		char[] letter = new char[T];

		for (int i = 0; i < T; i++) {
			String sentence = input.nextLine();
			int length = sentence.trim().length();
			while (length < 1 || length > 10000) {
				sentence = input.nextLine();
				length = sentence.trim().length();
			}
			sentences[i] = sentence.trim();
			letter[i] = input.next().charAt(0);
		}
		input.close();

		for (int i = 0; i < T; i++) {
			int count = occurence(sentences[i], letter[i]);
			if (count == 0) {
				System.out.println("'" + letter[i] + "'" + " is not present");
			} else if (count > 0) {
				System.out.println(
						"Occurrence of " + "'" + letter[i] + "'" + " in " + "'" + sentences[i] + "' = " + count);
			}
		}

	}

	public static int occurence(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

}
