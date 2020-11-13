package dimikOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		while (T < 1 || T > 100) {
			T = input.nextInt();
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		ArrayList<Integer>[] al = new ArrayList[T];
		

		for (int i = 0; i < T; i++) {
			al[i] = new ArrayList<Integer>();
			line = br.readLine();
			String[] lineSplitted = line.trim().split(" ");
			int[] numbers = new int[lineSplitted.length];

			for (int j = 0; j < lineSplitted.length; j++) {
				numbers[j] = Integer.parseInt(lineSplitted[j]);
			}
			
			int num1 = numbers[0];
			int num2 = numbers[1];
			int num3 = numbers[2];
			
			while (num1 > 1000 || num2 > 1000 || num3 > 1000) {
				line = br.readLine();
				lineSplitted = line.trim().split(" ");
				numbers = new int[lineSplitted.length];

				for (int j = 0; j < lineSplitted.length; j++) {
					numbers[j] = Integer.parseInt(lineSplitted[j]);
				}
				
				num1 = numbers[0];
				num2 = numbers[1];
				num3 = numbers[2];
			}						
			Arrays.sort(numbers);
			al[i].add(numbers[0]); 
	        al[i].add(numbers[1]); 
	        al[i].add(numbers[2]); 
	        
		}		
		input.close();
        for (int i = 0; i < T; i++) { 
        	System.out.printf("Case " + (i + 1) + ": ");
            for (int j = 0; j < al[i].size(); j++) { 
                System.out.print(al[i].get(j) + " "); 
            } 
            System.out.println(); 
        } 
		
	}

}
