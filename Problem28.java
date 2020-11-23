package dimikOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Problem28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		while (n < 1 || n > 24) {
			n = input.nextInt();
		}
		input.nextLine();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		if (isSorted(arr)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	public static boolean isSorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1])
				return false;
		}
		return true;
	}

}
