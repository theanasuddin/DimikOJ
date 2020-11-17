package dimikOJ;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 100) {
			T = input.nextInt();
		}
		int[] N = new int[T];

		for (int i = 0; i < N.length; i++) {
			N[i] = input.nextInt();
			while (N[i] < 0 || N[i] > 10000) {
				N[i] = input.nextInt();
			}
		}
		input.close();
		for (int i : N) {
			System.out.println(findTrailingZeros(i));
		}

	}

	public static int findTrailingZeros(int n) {
		int count = 0;
		for (int i = 5; n / i >= 1; i *= 5)
			count += n / i;

		return count;
	}

}
