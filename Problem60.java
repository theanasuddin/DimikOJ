package dimikOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem60 {

	static long is_prime(long n) {
		long i, root;

		if (n < 2) {
			return 0;
		}

		if (n == 2) {
			return 1;
		}

		if (n % 2 == 0) {
			return 0;
		}

		root = (long) Math.sqrt(n);

		for (i = 3; i <= root; i += 2) {
			if (n % i == 0) {
				return 0;
			}
		}

		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Long> numbers = new ArrayList<Long>();

		long num = input.nextLong();

		while (num >= 0) {
			numbers.add(num);
			num = input.nextLong();
		}
		input.close();

		for (Long number : numbers) {

			ArrayList<Long> primes = new ArrayList<Long>();
			for (long i = 2; i <= number; i++) {
				if (number % i == 0) {
					if (is_prime(i) == 1) {
						primes.add(i);
					}
				}
			}

			Collections.sort(primes);

			for (Long prime : primes) {
				System.out.printf("    %d\n", prime);
			}
			System.out.printf("\n");
		}

	}

}
