package dimikOJ;

import java.util.Scanner;

public class Problem43 {

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
			int p = Integer.parseInt(tempArray[0]);
			int q = Integer.parseInt(tempArray[1]);
			int c = Integer.parseInt(tempArray[2]);

			while (p > 100 || q > 100 || c > 100) {
				temp = input.nextLine();
				tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");
				p = Integer.parseInt(tempArray[0]);
				q = Integer.parseInt(tempArray[1]);
				c = Integer.parseInt(tempArray[2]);
			}
			inputs[i] = temp.trim().replaceAll("\\s{2,}", " ");
		}
		input.close();
		for (int i = 0; i < inputs.length; i++) {
			String[] tempArray = inputs[i].split("\\s");
			int p = Integer.parseInt(tempArray[0]);
			int q = Integer.parseInt(tempArray[1]);
			int c = Integer.parseInt(tempArray[2]);

			System.out.println("Result = " + (int) (Math.pow(p, q) % c));

		}

	}

}