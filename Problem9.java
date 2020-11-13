package dimikOJ;

import java.io.IOException;
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 100) {
			T = input.nextInt();
		}
		int[] inputs = new int[T];

		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = input.nextInt();
			while (inputs[i] < 0 || inputs[i] > Math.pow(2, 31)) {
				inputs[i] = input.nextInt();
			}
		}
		input.close();
		for (int i : inputs) {
			System.out.println(isSquare(i));
		}

	}

	public static String isSquare(int n) {
		int sqrt = (int) Math.sqrt(n);
		if (sqrt * sqrt == n) {
			return "Yes";
		} else {
			return "No";
		}
	}

}