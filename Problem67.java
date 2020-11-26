package dimikOJ;

import java.util.Scanner;

public class Problem67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		Problem67 obj = new Problem67();
		System.out.println(obj.fibonacci(N));

	}
	public long fibonacci(int i) {
		if (i == 1 || i == 2) {
			return 1;
		}
		else if (i > 2) {
			return fibonacci(i - 1) + fibonacci(i - 2);
		}
		return 0;
	}

}
