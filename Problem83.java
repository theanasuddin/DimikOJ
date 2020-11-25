package dimikOJ;

import java.util.Scanner;

public class Problem83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();
		long[] n = new long[T];
		for (int i = 0; i < n.length; i++) {
			long temp = input.nextLong();
			int digitCount = countDigit(temp);
			while (digitCount < 1 || digitCount > 1100 || temp < 1) {
				temp = input.nextLong();
				digitCount = countDigit(temp);
			}
			n[i] = temp;
		}
		input.close();
		for (int i = 0; i < n.length; i++) {
			long N = n[i];
			int K = 0;
			boolean notPower = true;
			long output = (long) Math.pow(2, K);
			while (output <= N) {
				if (output == N) {
					notPower = false;
					System.out.println("It's a power of 2");
					break;
				} else {
					K++;
					output = (long) Math.pow(2, K);
				}

			}
			if (notPower) {
				System.out.println("Not a power of 2");
			}

		}
	}

	static int countDigit(long n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			++count;
		}
		return count;
	}
}