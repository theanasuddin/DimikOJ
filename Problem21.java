package dimikOJ;

import java.util.Scanner;

public class Problem21 {

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
			while (length < 1 || length > 1000) {
				temp = input.nextLine();
				length = temp.trim().length();
			}
			lines[i] = temp.trim().replaceAll("\\s{2,}", " ");
		}
		input.close();

		for (int i = 0; i < lines.length; i++) {
			char[] line = lines[i].toCharArray();

			for (int j = line.length - 1; j >= 0; j--) {
				System.out.print(line[j]);
			}
			System.out.println();
		}
	}
}
