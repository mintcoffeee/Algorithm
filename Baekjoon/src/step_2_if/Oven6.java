package step_2_if;

import java.util.*;

public class Oven6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		b = b+c;
		int d = b/60;
		if(b>=60) {
			a += d;
			b -= d*60;
			if(a >= 24) {
				a-=24;
				System.out.println(a + " " + b);
			}else
				System.out.println(a + " " + b);
		}else
			System.out.println(a + " " + b);
	}
}
