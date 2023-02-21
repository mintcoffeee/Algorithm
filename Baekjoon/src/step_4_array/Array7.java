package step_4_array;

import java.util.Scanner;
public class Array7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] ar = new int[30], tmp= new int[2];
		for(int i=0; i<28; i++) {
			ar[s.nextInt()-1]++;
		}
		for(int i=0; i<30; i++) {
			if(ar[i] == 0) System.out.println(i+1);
		}
	}
}


