package dimikOJ;

import java.util.Scanner;

public class Problem27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		while (t < 1) {
			t = input.nextInt();
		}
		input.nextLine();
		int[] n = new int[t];
		for (int i = 0; i < n.length; i++) {
			int temp = input.nextInt();
			while (temp < 100 || temp > 999) {
				temp = input.nextInt();
			}
			n[i] = temp;
		}
		for (int i : n) {
			int total = 0;
			String temp = Integer.toString(i);
			for (int j = 0; j < temp.length(); j++) {
				total = (int) (total + Math.pow(Character.getNumericValue(temp.charAt(j)), 3));
			}
			if (i == total) {
				System.out.println(i + " is an armstrong number!");
			} else {
				System.out.println(i + " is not an armstrong number!");
			}
		}

	}

}
