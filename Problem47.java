package dimikOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 1000) {
			T = input.nextInt();
		}
		input.nextLine();
		ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>(T);
		for (int i = 0; i < T; i++) {

			ArrayList<Integer> al = new ArrayList<Integer>();

			for (int j = 0; j < 2; j++) {
				int length = input.nextInt();
				input.nextLine();
				String temp = input.nextLine();
				String[] tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");

				for (int k = 0; k < length; k++) {
					int toAdd = Integer.parseInt(tempArray[k]);
					al.add(toAdd);
				}
			}
			aList.add(al);
		}
		input.close();

		for (int i = 0; i < T; i++) {
			Collections.sort(aList.get(i));
			for (int j = 0; j < aList.get(i).size(); j++) {
				System.out.print(aList.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}

}