package dimikOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();
		ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>(T);
		for (int i = 0; i < T; i++) {

			ArrayList<Integer> al = new ArrayList<Integer>();

			String temp = input.nextLine();
			String[] tempArray = temp.trim().replaceAll("\\s{2,}", " ").split("\\s");

			int studentCount = Integer.parseInt(tempArray[0]);

			for (int k = 1; k <= studentCount; k++) {
				int toAdd = Integer.parseInt(tempArray[k]);
				al.add(toAdd);
			}
			aList.add(al);
		}
		input.close();

		for (int i = 0; i < T; i++) {
			ArrayList<Integer> al = aList.get(i);
			int sum = 0;
			for (Integer integer : al) {
				sum = sum + integer;
			}
			double average = sum / al.size();
			int count = 0;
			for (Integer integer : al) {
				if (integer > average) {
					count++;
				}
			}
			double percentage = (count / (double) al.size()) * 100;
			System.out.format("%.3f", percentage);
			System.out.print("%\n");
		}

	}

}