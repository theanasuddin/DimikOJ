package dimikOJ;

import java.util.Scanner;

public class Problem72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		while (N < 1) {
			N = input.nextInt();
		}
		input.nextLine();
		String[] inputs = new String[N];

		for (int i = 0; i < N; i++) {
			String temp = input.nextLine();
			inputs[i] = temp.trim().replaceAll("\\s{2,}", " ");
		}
		input.close();

		for (int i = 0; i < N; i++) {
			String[] tempArray = inputs[i].split("\\s");
			int a = Integer.parseInt(tempArray[0]);
			int b = Integer.parseInt(tempArray[1]);
			int c = Integer.parseInt(tempArray[2]);
			area(a, b, c);
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
