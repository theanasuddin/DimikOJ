package dimikOJ;

import java.util.Scanner;

public class Problem24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();
		String[] lines = new String[T];

		for (int i = 0; i < lines.length; i++) {
			int length = input.nextInt();
			String temp = input.nextLine();
			int tempLength = temp.trim().replaceAll("\\s{2,}", " ").split("\\s").length;
			while (length != tempLength) {
				temp = input.nextLine();
				tempLength = temp.trim().replaceAll("\\s{2,}", " ").split("\\s").length;
			}
			lines[i] = temp.trim().replaceAll("\\s{2,}", " ");
		}
		input.close();
		for (int i = 0; i < lines.length; i++) {
			String[] tempArray = lines[i].split("\\s");
			for (int j = 0; j < tempArray.length; j += 2) {
				System.out.print(Integer.parseInt(tempArray[j]) + " ");
			}
			System.out.println();
		}

	}

}
