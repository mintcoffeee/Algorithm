package step_5_String;

import java.util.Scanner;

public class String0 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String c = s.next();
		int i = s.nextInt();
		System.out.println(c.charAt(i-1));
	}
}
