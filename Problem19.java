package dimikOJ;

import java.util.Scanner;

public class Problem19 {

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
			while (length < 1 || length > 10000) {
				temp = input.nextLine();
				length = temp.trim().length();
			}
			lines[i] = temp.trim();
		}
		input.close();

		for (int i = 0; i < lines.length; i++) {
			System.out.println("Count = " + lines[i].replaceAll("\\s{2,}", " ").split("\\s").length);
		}

	}

}
