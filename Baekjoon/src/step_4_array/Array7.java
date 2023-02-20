package step_4_array;

import java.util.Arrays;
import java.util.Scanner;import java.util.StringTokenizer;

public class Array7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringTokenizer st;double avg=0, sum=0;
		int n = s.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(s.next());
			ar[i] = Integer.parseInt(st.nextToken());
		}
		int max=Arrays.stream(ar).max().getAsInt();
		for(int i=0;i<n;i++) {
			sum  += (ar[i]/(double)max) * 100 ;
		}
		System.out.println(sum/n);
		
	}
}
