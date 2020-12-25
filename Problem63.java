package dimikOJ;

import java.util.Scanner;

public class Problem63 {

	public static String encrypt(String str, int key) {
		int i, n, temp = 0;
		char c;
		char[] msg = str.toCharArray();

		n = msg.length;

		for (i = 0; i < n; i++) {
			temp = 0;
			if ((msg[i] >= 'a' && msg[i] <= 'z') || (msg[i] >= 'A' && msg[i] <= 'Z')) {
				if (msg[i] >= 'a' && msg[i] <= 'z') {
					c = (char) (msg[i] + key);
					if (c > 'z') {
						temp = (msg[i] + key) - 'z';
						temp = temp + 96;
						msg[i] = (char) temp;
					} else {
						msg[i] = c;
					}
				} else if (msg[i] >= 'A' && msg[i] <= 'Z') {
					c = (char) (msg[i] + key);
					if (c > 'Z') {
						temp = (msg[i] + key) - 'Z';
						temp = temp + 64;
						msg[i] = (char) temp;
					} else {
						msg[i] = c;
					}
				}
			}
		}
		return String.valueOf(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();
		int key = input.nextInt();

		while (key < 0 || key > 26) {
			key = input.nextInt();
		}
		input.close();
		System.out.printf("%s\n", encrypt(str, key));
	}

}
