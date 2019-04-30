package TestPack;

import java.util.Scanner;

public class Windowseats {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i = 4; // WINDOW SEATS
		int v = 8; // TOTAL SEATS

		do {
			while (i > 0 && v > i) {
				System.out.print("Passenger " + v + " Do you want a window seat--Y or N?");
				String window = in.next();
				if (window.equals("y")) {
					i--;
				}
				System.out.println("number of window seats left " + i);
				v--;
				System.out.println("total seats left " + v);
			}
			if (i >= v) {
				System.out.print("only window seats avaiable, do you still want a seat? ");
				String seat1 = in.next();
				if (seat1.equals("y")) {
					v--;
					i--;
					System.out.println("number of window seats left " + i);
					System.out.println("total seats left " + v);
				} else {
					System.out.println("next customer please");
				}
			} else {
				System.out.print("There are no window seats left. Do you want a seat anyway? ");
				String seat = in.next();
				if (seat.equals("y")) {
					v--;
					System.out.println("total seats left " + v);

				} else {
					System.out.println("next customer please");
				}
			}
		} while (v > 0);
		System.out.println("no more seats");

	}
}
