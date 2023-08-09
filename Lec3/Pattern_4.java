package Lec3;

import java.util.*;

public class Pattern_4 {

	public static void main(String[] args) {
	
		
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int row = 1;

		int nst = 1;

		while (row <= n) {

			// Print of star for that particular Row

			int i = 1;

			while (i <= nst) {

				System.out.print("*" + " ");
				i= i+1;
			}

			// Prepration for the Next Row
			System.out.println();
			nst = nst + 1;

			row = row + 1;
		}
		

	}

}
