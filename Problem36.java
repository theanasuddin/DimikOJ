package dimikOJ;

import java.util.Scanner;

public class Problem36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();
		int[] numbers = new int[T];

		for (int i = 0; i < T; i++) {
			int number = input.nextInt();
			while (number > (3 * Math.pow(10, 11))) {
				number = input.nextInt();
			}
			numbers[i] = number;
		}
		input.close();
		for (int i = 0; i < T; i++) {
			int num = numbers[i], reversed = 0;

			while (num != 0) {
				int digit = num % 10;
				reversed = reversed * 10 + digit;
				num /= 10;
			}
			System.out.println(reversed);
		}

	}

}