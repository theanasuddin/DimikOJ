package dimikOJ;

import java.util.Scanner;

public class Problem72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = input.nextInt();
			b[i] = input.nextInt();
			c[i] = input.nextInt();
		}
		input.close();

		for (int i = 0; i < N; i++) {
			area(a[i], b[i], c[i]);
		}

	}

	public static void area(int a, int b, int c) {
		double s = (a + b + c) / 2;
		double temp = s * (s - a) * (s - b) * (s - c);

		if (temp < 0) {
			System.out.println("Oh, No!");
		} else if (temp >= 0) {
			System.out.printf("%.2f\n", Math.sqrt(temp));
		}
	}

}