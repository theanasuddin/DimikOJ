package dimikOJ;

import java.util.Scanner;

public class Problem33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 100) {
			T = input.nextInt();
		}
		input.nextLine();
		String[] inputs = new String[T];

		for (int i = 0; i < T; i++) {
			String temp = input.nextLine();
			String[] tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");
			int a = Integer.parseInt(tempArray[0]);
			int b = Integer.parseInt(tempArray[1]);
			int c = Integer.parseInt(tempArray[2]);

			while (a < 1 || a > Math.pow(10, 16) || b < 1 || b > Math.pow(10, 16) || c < 1 || c > Math.pow(10, 16)) {
				temp = input.nextLine();
				tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");
				a = Integer.parseInt(tempArray[0]);
				b = Integer.parseInt(tempArray[1]);
				c = Integer.parseInt(tempArray[2]);
			}
			inputs[i] = temp.trim().replaceAll("\\s{2,}", " ");
		}
		input.close();
		for (int i = 0; i < inputs.length; i++) {
			String[] tempArray = inputs[i].split("\\s");
			int a = Integer.parseInt(tempArray[0]);
			int b = Integer.parseInt(tempArray[1]);
			int c = Integer.parseInt(tempArray[2]);
			for (int j = a; j <= b; j++) {
				if (j % c == 0) {
					System.out.println(j);
				}
			}
			System.out.println();

		}

	}

}