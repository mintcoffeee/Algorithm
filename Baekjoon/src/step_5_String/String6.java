package step_5_String;

import java.util.Scanner;

public class String6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int t=s.nextInt(), i=0;i<t;i++) {
			int r = s.nextInt();
			String c = s.next();
			for(int j=0;j<c.length();j++) {
				for(int k=0;k<r;k++) {
					System.out.print(c.charAt(j));
				}
			}
		System.out.println();
		}	
	}
}
