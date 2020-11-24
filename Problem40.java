package dimikOJ;

import java.util.Scanner;

public class Problem40 {

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
			int X = Integer.parseInt(tempArray[0]);
			int K = Integer.parseInt(tempArray[1]);

			while (K < 0 || K > 6 || X > 10) {
				temp = input.nextLine();
				tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");
				X = Integer.parseInt(tempArray[0]);
				K = Integer.parseInt(tempArray[1]);
			}
			inputs[i] = temp.trim().replaceAll("\\s{2,}", " ");
		}
		input.close();
		for (int i = 0; i < inputs.length; i++) {
			String[] tempArray = inputs[i].split("\\s");
			int X = Integer.parseInt(tempArray[0]);
			int K = Integer.parseInt(tempArray[1]);

			int sum = 0;
			for (int j = 0; j <= K; j++) {
				sum = (int) (sum + Math.pow(X, j));
			}
			System.out.println("Result = " + sum);
		}

	}

}