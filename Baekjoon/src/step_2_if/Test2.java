package step_2_if;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(a>=90 && a<=100) System.out.println("A");
		else if(a>=80 && a<=89) System.out.println("B");
		else if(a>=70 && a<=79) System.out.println("C");
		else if(a>=60 && a<=69) System.out.println("D");
		else System.out.println("F");
		
	}
}
