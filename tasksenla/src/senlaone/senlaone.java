package senlaone;
import java.util.Scanner;

public class senlaone {
	public static void main(String[] args)
    {  
    	Scanner in = new Scanner (System.in);
    	int n = 0;
    	int sum = 0;
    	n = in.nextInt();
    	while(n != 0) {
    		if(simple(n)==true) {
    			if(n != 1)
    			System.out.println(n);
    			n--;
    			sum++;
    		}
    		else {
    			n--;
    		}
    	}
    	System.out.print("All simple numbers: ");
    	System.out.println(sum-1);
    }
public static boolean simple(int n)  
{ 
    for (int i = 2; i < n; i++) 
    {
        if (n % i == 0)  
        {
            return false;  
        }
    }
    return true;  
}
}