package senlasix;
import java.util.Scanner;

public class senlasix {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		String s;
		s = in.nextLine();
		System.out.println(s.replaceAll("[0-9]+", ""));
	}
}
