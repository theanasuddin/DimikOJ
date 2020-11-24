package dimikOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Problem37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 20) {
			T = input.nextInt();
		}
		input.nextLine();
		String[] strings = new String[T];

		for (int i = 0; i < T; i++) {
			String temp = input.nextLine();
			strings[i] = temp;
		}
		input.close();
		Arrays.sort(strings);
		for (int i = 0; i < T; i++) {
			System.out.println(strings[i]);
		}

	}

	// we can also use this method
	public static void sort(String[] myArray) {
		int size = myArray.length;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i].compareTo(myArray[j]) > 0) {
					String temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		for (String string : myArray) {
			System.out.println(string);
		}
	}

}