package senlathree;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class senlathree {
	public static void main (String [] args) {
	Scanner in = new Scanner (System.in);
	int size = in.nextInt();
	Integer arr[] = new Integer[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	Arrays.sort(arr,Collections.reverseOrder());
	for (int i = 0; i < size; i++) {
		System.out.print(arr[i]);
	}
	}
	
}


