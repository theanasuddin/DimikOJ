package dimikOJ;

import java.util.Scanner;

public class Problem46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 1000) {
			T = input.nextInt();
		}
		input.nextLine();
		String[] inputs = new String[T];

		for (int i = 0; i < T; i++) {
			String temp = input.nextLine();
			String[] tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");
			int a = Integer.parseInt(tempArray[0]);
			int b = Integer.parseInt(tempArray[1]);
			int c = Integer.parseInt(tempArray[2]);

			while (a <= 0 || b <= 0 || c <= 0 || (a + b) <= c || (b + c) <= a || (c + a) <= b) {
				temp = input.nextLine();
				tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");
				a = Integer.parseInt(tempArray[0]);
				b = Integer.parseInt(tempArray[1]);
				c = Integer.parseInt(tempArray[2]);
			}
			inputs[i] = temp.trim().replaceAll("\\s{2,}", " ");
		}
		input.close();
		for (int i = 0; i < inputs.length; i++) {
			String[] tempArray = inputs[i].split("\\s");
			int a = Integer.parseInt(tempArray[0]);
			int b = Integer.parseInt(tempArray[1]);
			int c = Integer.parseInt(tempArray[2]);

			double semiPerimeter = (a + b + c) / 2;
			double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
			System.out.format("Area = %.3f\n", area);

		}

	}

}