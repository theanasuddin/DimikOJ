package dimikOJ;

import java.util.Scanner;

public class Problem38 {

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
			String[] tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");
			int n = Integer.parseInt(tempArray[0]);
			int m = Integer.parseInt(tempArray[1]);

			while (n < 1 || n < m) {
				temp = input.nextLine();
				tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");
				n = Integer.parseInt(tempArray[0]);
				m = Integer.parseInt(tempArray[1]);
			}
			inputs[i] = temp.trim().replaceAll("\\s{2,}", " ");
		}
		input.close();
		for (int i = 0; i < inputs.length; i++) {
			String[] tempArray = inputs[i].split("\\s");
			int n = Integer.parseInt(tempArray[0]);
			int m = Integer.parseInt(tempArray[1]);
			int k = 0;

			for (int j = 0; j < ((2 * n) - 1); j++) {
				if (j < Math.ceil((2 * n) - 1) / 2) {
					for (int j2 = 0; j2 < j + 1; j2++) {
						System.out.print(m + " ");
						k = j2;
					}
				} else {
					for (int j2 = k; j2 > 0; j2--) {
						System.out.print(m + " ");
					}
					k--;
				}
				System.out.println();
			}
			System.out.println();

		}

	}

}