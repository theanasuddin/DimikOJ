package dimikOJ;

import java.util.Scanner;

public class Problem31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();
		int[] n = new int[T];
		for (int i = 0; i < n.length; i++) {
			int temp = input.nextInt();
			while (temp < 1 || temp > 40000000) {
				temp = input.nextInt();
			}
			n[i] = temp;
		}
		input.close();
		for (int i = 0; i < n.length; i++) {
			for (int k = 1; k <= n[i]; k++) {
				int sum = 0;
				for (int j = 1; j < k; j++) {
					if ((k % j) == 0) {
						sum = sum + j;
					}
				}
				if (sum == k) {
					System.out.println(k);
				}

			}
			System.out.println();
		}

	}

}