package dimikOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Problem15 {

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
			lines[i] = temp.trim().replaceAll("\\s", "");
		}
		input.close();

		for (int i = 0; i < lines.length; i++) {
			char[] ch = lines[i].toCharArray();
			Arrays.sort(ch);
			for (int j = 0; j < ch.length; j++) {
				int count = 0;
				for (int j2 = 0; j2 < ch.length; j2++) {
					if (ch[j] == ch[j2]) {
						count++;
					}
				}
				System.out.println(ch[j] + " = " + count);
			}
			System.out.println();
		}

	}

}
