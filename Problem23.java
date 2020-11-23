package dimikOJ;

import java.util.Scanner;

public class Problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();
		String[] lines = new String[T];

		for (int i = 0; i < T; i++) {
			String temp = input.nextLine();
			temp = temp.trim().replaceAll("\\s{2,}", "");

			while (temp.length() < 1 || temp.length() > 100) {
				temp = input.nextLine();
				temp = temp.trim().replaceAll("\\s{2,}", "");
			}
			lines[i] = temp.trim().replaceAll("\\s{2,}", "");
		}
		input.close();

		for (int i = 0; i < lines.length; i++) {
			for (int j = 0; j < lines[i].length(); j++) {
				System.out.print(lines[i].charAt(j) & 31);
			}
			System.out.println();
		}

	}

}
