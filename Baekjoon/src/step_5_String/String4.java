package step_5_String;

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), sum=0;
		String c = s.next();
		for(int i=0;i<c.length();i++) {
			sum += c.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
