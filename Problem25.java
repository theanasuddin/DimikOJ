package dimikOJ;

import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t < 1) {
			t = input.nextInt();
		}
		input.nextLine();
		String[] lines = new String[t];
		for (int i = 0; i < t; i++) {
			String temp = input.nextLine();
			String[] tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");
			int a = Integer.parseInt(tempArray[0]);
			int b = Integer.parseInt(tempArray[1]);

			while (a <= 0 || a > 100000 || b <= 0 || b > 100000) {
				temp = input.nextLine();
				tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");
				a = Integer.parseInt(tempArray[0]);
				b = Integer.parseInt(tempArray[1]);
			}
			lines[i] = temp.trim().replaceAll("\\s{2,}", " ");
		}
		input.close();

		for (int i = 0; i < t; i++) {
			String[] tempArray = lines[i].split("\\s");
			int a = Integer.parseInt(tempArray[0]);
			int b = Integer.parseInt(tempArray[1]);
			System.out.println("LCM = " + lcm(a, b));
		}

	}

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static int lcm(int a, int b) {
		return (a / gcd(a, b)) * b;
	}
}
