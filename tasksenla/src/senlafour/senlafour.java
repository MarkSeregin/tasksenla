package senlafour;
import java.util.Scanner;

public class senlafour {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		boolean x = in.nextBoolean();
		boolean y = in.nextBoolean();
		boolean z = in.nextBoolean();
		boolean f = in.nextBoolean();
		if (x == true && y == true || x == true && z == true || x == true && f == true)
			System.out.println("true");
		if (y == true && z == true || y == true && f == true)
			System.out.println("true");
		if (z == true && f == true)
			System.out.println("true");
	}
}
