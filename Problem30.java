package dimikOJ;

import java.util.Scanner;

public class Problem30 {

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
			while (temp < 1 || temp > (Math.pow(2, 64) - 1)) {
				temp = input.nextLong();
			}
			n[i] = temp;
		}
		input.close();
		for (int i = 0; i < n.length; i++) {
			int sum = 0;
			for (int j = 1; j < n[i]; j++) {
				if ((n[i] % j) == 0) {
					sum = sum + j;
				}
			}
			if (sum == n[i]) {
				System.out.println("YES," + n[i] + " is a perfect number!");
			} else {
				System.out.println("NO," + n[i] + " is not a perfect number!");
			}
		}

	}

}
