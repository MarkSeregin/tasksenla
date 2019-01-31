package senlatwo;
import java.util.Scanner;

public class senlatwo {
	public static void main (String [] arggs) {
		Scanner in = new Scanner (System.in);
		int n = 0;
		n = in.nextInt();
		while(n != 0) {
		System.out.println(fib(n));
		n--;
		}
	}
	public static int fib (int n) {
		if (n == 1) 
			return 1;
	    if (n == 2) 
	    	return 1;
	    return fib(n - 1) + fib(n - 2);
		}
	}

