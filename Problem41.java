package dimikOJ;

import java.util.Scanner;

public class Problem41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 100) {
			T = input.nextInt();
		}
		input.nextLine();
		int[] n = new int[T];
		for (int i = 0; i < n.length; i++) {
			int temp = input.nextInt();
			while (temp < 1 || temp > 15) {
				temp = input.nextInt();
			}
			n[i] = temp;
		}
		input.close();
		for (int i = 0; i < n.length; i++) {
			double sum = 0;
			for (int k = 1; k <= n[i]; k++) {
				sum = sum + (k / factorial(k));
			}
			System.out.format("%.4f\n", sum);
		}
	}

	static double factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}

}