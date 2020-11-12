package dimikOJ;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1000; i >= 1; i--) {
			System.out.printf("%d\t", i);
			count++;
			if (count == 5) {
				count = 0;
				System.out.println();
			}
		}

	}

}
