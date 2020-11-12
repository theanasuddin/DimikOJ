package dimikOJ;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 10000) {
			T = input.nextInt();
		}
		int[] inputs = new int[T];

		for (int i = 0; i < T; i++) {
			int n = input.nextInt();
			int length = String.valueOf(n).length();
			while (n < 10000 || n > 99999 || length > 5) {
				n = input.nextInt();
			}
			inputs[i] = n;
		}
		input.close();

		for (int i = 0; i < inputs.length; i++) {
			System.out.println("Sum = " + sum(inputs[i]));
		}
	}

	public static int sum(int n) {
		int firstDigit = n;
		while (firstDigit >= 10) {
			firstDigit /= 10;
		}
		int lastDigit = n % 10;
		return firstDigit + lastDigit;

	}

}
