package senlafive;
import java.util.Scanner;

public class senlafive {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		String s;
		s = in.nextLine();
		if (prov(s) == true)
            System.out.println("This word is polindrome");
		else
            System.out.println("This word is not polindrome");
	}
		public static Boolean prov(String s) {
		    for (int i = 0; i < s.length() / 2; ++i) {
		        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
		        	return false;
		        }
		    }
		    return true;
		}
	}

