package dimikOJ;

import java.util.Scanner;

public class Problem44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numbers[];
		int N;

		int T = input.nextInt();

		while (T < 1 || T > 20) {
			T = input.nextInt();
		}
		input.nextLine();

		numbers = new int[T];

		for (int i = 0; i < numbers.length; i++) {
			N = input.nextInt();

			while (N < 1 || N > 20) {
				N = input.nextInt();
			}
			numbers[i] = N;
		}
		input.close();

		for (int i = 0; i < numbers.length; i++) {
			int[][] arr = new int[numbers[i]][numbers[i]];

			for (int j = 0; j < numbers[i]; j++) {

				for (int j2 = 0; j2 < j + 1; j2++) {
					if (j2 == 0 || j2 == j) {
						arr[j][j2] = 1;
					} else {
						arr[j][j2] = arr[j - 1][j2 - 1] + arr[j - 1][j2];
					}
					System.out.printf("%d ", arr[j][j2]);
				}
				System.out.printf("\n");
			}
			System.out.println();
		}

	}

}
