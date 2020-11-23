package dimikOJ;

import java.util.Scanner;

public class Problem32 {

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

			while (a < 1 || b < 1 || b > 1000000) {
				temp = input.nextLine();
				tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");
				a = Integer.parseInt(tempArray[0]);
				b = Integer.parseInt(tempArray[1]);
			}
			inputs[i] = temp.trim().replaceAll("\\s{2,}", " ");
		}
		input.close();
		for (int i = 0; i < inputs.length; i++) {
			String[] tempArray = inputs[i].split("\\s");
			int a = Integer.parseInt(tempArray[0]);
			int b = Integer.parseInt(tempArray[1]);
			if (a > b) {
				System.out.println("Invalid!");
			} else {
				int count = 1;
				int res = 0;
				res = a * count;
				while (res <= b) {
					System.out.println(res);
					count++;
					res = a * count;
				}
			}
			System.out.println();

		}

	}

}