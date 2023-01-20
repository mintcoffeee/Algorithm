package step_5_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String7 {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		String t = s.nextLine();
//		int sum=0;
//		for(int i=0;i<t.length();i++) {
//			if(t.charAt(i) == ' ')
//				sum++;
//		}
//		if(t.charAt(0)==' ') sum--;
//		if(t.charAt(t.length()-1)==' ') sum--;
//		System.out.println(sum+1);
//		
		System.out.print(new StringTokenizer(new Scanner(System.in).nextLine()).countTokens());
	}
}

