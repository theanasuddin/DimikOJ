package dimikOJ;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 100) {
			T = input.nextInt();
		}
		input.nextLine();
		String[] inputs = new String[T];

		for (int i = 0; i < T; i++) {
			String temp = input.nextLine();

			String tempArray[] = temp.trim().split("\\s");
			int tempArrayLength = tempArray.length;
			boolean flag = true;

			for (String string : tempArray) {
				long item = Integer.parseInt(string);
				if (Math.abs(item) <= 10000000) {
					flag = false;

				} else if (Math.abs(item) > 10000000) {
					flag = true;
					break;
				}
			}
			while (tempArrayLength < 1 || tempArrayLength > 100 || flag) {
				temp = input.nextLine();

				tempArray = temp.trim().split("\\s");
				tempArrayLength = tempArray.length;

				for (String string : tempArray) {
					long item = Integer.parseInt(string);
					if (Math.abs(item) <= 10000000) {
						flag = false;

					} else if (Math.abs(item) > 10000000) {
						flag = true;
						break;
					}
				}

			}
			inputs[i] = temp;
		}
		input.close();

		for (int i = 0; i < inputs.length; i++) {
			System.out.println(inputs[i].trim().split("\\s").length);
		}

	}

}