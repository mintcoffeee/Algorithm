package step_4_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Array1 {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		StringBuilder sd = null;
//		StringTokenizer st;
//		int n = s.nextInt();
//		int count=0;
//		int[] ar = new int[n];
//		for(int i=0; i<n; i++) {
//			st = new StringTokenizer(s.next());
//			ar[i] = Integer.parseInt(st.nextToken());
//		}
//		int find = s.nextInt();
//		for(int i=0; i<ar.length; i++) {
//			if(ar[i]==find) count++;
//		}
//		System.out.println(count);
		Scanner s = new Scanner(System.in);
		int v[]=new int[201];
		
		for(int a=s.nextInt(),i=0;i<a;i++){
			v[s.nextInt()+100] ++;
		}
		System.out.print(v[s.nextInt()+100]);
	}
}
