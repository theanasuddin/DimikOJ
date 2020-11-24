package dimikOJ;

import java.util.Scanner;

public class Problem42 {

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
			while (temp < 0 || temp > 50) {
				temp = input.nextInt();
			}
			n[i] = temp;
		}
		input.close();
		for (int i = 0; i < n.length; i++) {
			for (int j = n[i]; j >= 0; j--) {
				if (j == 0) {
					System.out.print(1);
				} else if (j == 1) {
					System.out.print(2 + " + ");
				} else {
					System.out.print(2 + "^" + j + " + ");
				}
			}
			System.out.println();
		}
	}
}