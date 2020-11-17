package dimikOJ;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		int[] N = new int[T];
		
		for (int i = 0; i < N.length; i++) {
			N[i] = input.nextInt();
			while (N[i] < 0 || N[i] > 15) {
				N[i] = input.nextInt();		
			}
		}
		input.close();
		for (int i : N) {
			System.out.println(factorial(i));
		}
		

	}
	public static long factorial(int number) {
		if (number == 0) {
			return 1;
		}
		else {
			long factorial = 1;
			for (int i = number; i >= 1; i--) {
				factorial = factorial * i;
			}
			return factorial;
		}
	}

}
