package TestPack;

import java.util.Scanner;

public class CharAtReverse {
	public static void main(String[] args) {
		for(int v= 1; v>0; v++) {
		Scanner in = new Scanner(System.in);
		String num = in.next();
		String rev = " ";
	
			
			for(int j = num.length() - 1; j>= 0; j--) {

				rev = rev + num.charAt(j);
						
				}
				
				
			System.out.println("reversed stirng is: " + rev);
			
			
			
		}

	}
	}