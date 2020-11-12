package dimikOJ;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Problem16 {

	public Problem16() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();

		String[] sentences = new String[n];

		for (int i = 0; i < sentences.length; i++) {
			sentences[i] = input.nextLine();

		}
		input.close();
		for (int i = 0; i < sentences.length; i++) {
			System.out.println(reverseWord(sentences[i]));
		}

	}

	public static String reverseWord(String str) {
		String words[] = str.split("\\s");
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		return reverseWord.trim();
	}

}
