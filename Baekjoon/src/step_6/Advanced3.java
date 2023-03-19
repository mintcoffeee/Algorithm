package step_6;

import java.util.Scanner;

public class Advanced3 {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		StringBuilder sb = new StringBuilder();
//		for(int w=n,j=1;j<=2*n-1;j+=2) {
//			for(int i=w-1;i>0; i--) {
//				sb.append(" ");
//			}
//			for(int k=0;k<j;k++) {
//				sb.append("*");
//			}
//			sb.append("\n");
//			w--;
//		}
//		System.out.print(sb);
//		String[] line = sb.toString().split("\n");
//		for(int i=n-2;i>=0;i--) {
//			System.out.println(line[i]);
//		}
		
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i=N-1;i>-N;i--){
			for (int j=0;j<Math.abs(i);j++) //for_1
				System.out.print(" ");
			
			for (int j=0;j<2*N-2*Math.abs(i)-1;j++) //for_2
				System.out.print("*");
			
			System.out.println();
		}
		/*
		 N=5
		 for_1		for_2
			 4		1
			 3		3
			 2		5
			 1		7
			 0		9
			 1		7
			 2		5
			 3		3
			 4		1
		 
		 */
				
	}
}
