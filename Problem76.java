package dimikOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Long> numbers = new ArrayList<>();
		while (input.hasNext()) {
			long n = input.nextLong();
			if (n == 0) {
				break;
			}
			while (n > 1000000000) {
				n = input.nextLong();
			}
			if (n == 0) {
				break;
			}
			numbers.add(n);

		}
		input.close();
		for (int i = 0; i < numbers.size(); i++) {
			long n = numbers.get(i);
			ArrayList<Long> factorsOfFirst = getFactors(n);
			long count = 0;
			for (long j = 1; j < n; j++) {
				if (isPrime(j) && isPrime(n)) {
					count++;

				} else {
					ArrayList<Long> factorsOfSecond = getFactors(j);
					ArrayList<Long> common = new ArrayList<>();
					int commonCount = 0;
					for (long temp : factorsOfFirst) {
						if (factorsOfSecond.contains(temp)) {
							commonCount++;
							common.add(temp);
						}
					}
					if (commonCount == 1 && common.get(0) == 1) {
						count++;
					}

				}
			}
			System.out.println(count);
		}

	}

	public static boolean isPrime(long n) {
		if (n <= 1)
			return false;

		else if (n == 2)
			return true;

		else if (n % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static ArrayList<Long> getFactors(long n) {
		ArrayList<Long> numbers = new ArrayList<>();
		for (long i = 1; i <= n; ++i) {
			if (n % i == 0) {
				numbers.add(i);
			}
		}
		return numbers;
	}

}
