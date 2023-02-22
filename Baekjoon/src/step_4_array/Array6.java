package step_4_array;

import java.util.Scanner;

public class Array6 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(), m=s.nextInt();
		int[] ar=new int[n];
		int tmp;
		for(int i=0;i<n;i++) {ar[i] = i+1;}
		for(int j=0;j<m;j++) {
			int a=s.nextInt(), b=s.nextInt();
			tmp = ar[a-1];
			ar[a-1] = ar[b-1];
			ar[b-1] = tmp;
		}
		for(int d:ar) System.out.print(d + " ");
	}

}
