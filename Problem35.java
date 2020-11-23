package dimikOJ;

import java.util.Scanner;

public class Problem35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1) {
			T = input.nextInt();
		}
		input.nextLine();
		String[] centerCoordinate = new String[T];
		int[] radius = new int[T];
		String[] coordinate = new String[T];

		for (int i = 0; i < T; i++) {
			String temp = input.nextLine();
			centerCoordinate[i] = temp.trim().replaceAll("\\s{2,}", " ");
			int rad = input.nextInt();
			while (rad <= 0) {
				rad = input.nextInt();
			}
			input.nextLine();
			radius[i] = rad;
			temp = input.nextLine();
			coordinate[i] = temp.trim().replaceAll("\\s{2,}", " ");
		}
		input.close();
		for (int i = 0; i < T; i++) {
			String[] centerCoordinateArray = centerCoordinate[i].split("\\s");
			int Xc = Integer.parseInt(centerCoordinateArray[0]);
			int Yc = Integer.parseInt(centerCoordinateArray[1]);

			String[] coordinateArray = coordinate[i].split("\\s");
			int X = Integer.parseInt(coordinateArray[0]);
			int Y = Integer.parseInt(coordinateArray[1]);

			int r = radius[i];

			double distance;
			distance = Math.sqrt(Math.pow((X - Xc), 2) + Math.pow((Y - Yc), 2));
			if (distance < r) {
				System.out.println("The point is inside the circle");
			} else if (distance > r) {
				System.out.println("The point is not inside the circle");
			} else if (distance == r) {
				System.out.println("The point is on the circle");
			}
		}

	}

}