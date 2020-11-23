package dimikOJ;

import java.util.Scanner;

public class Problem26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t < 1 || t > 1000) {
			t = input.nextInt();
		}
		input.nextLine();
		float[] foodWeight = new float[t];

		for (int i = 0; i < foodWeight.length; i++) {
			foodWeight[i] = input.nextFloat();
		}
		for (float f : foodWeight) {
			int days = 0;
			while (f > 1) {
				days++;
				f = f / 2;
			}
			System.out.println(days + " days");
		}

	}

}
