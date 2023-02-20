package step_3_for;

import java.util.Scanner;

public class For12 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num, a, b, n=0;
		a = num = s.nextInt();
		do{
			b = (a/10) + (a%10);
			if(b>=10) b %= 10;
			a = (a%10)*10+b;
			n++;
		}while(num != a);
		System.out.println(n);
	}
}
