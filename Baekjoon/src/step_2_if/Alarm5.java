package step_2_if;

import java.util.*;

public class Alarm5 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if(m-45 <0) {
			if(h-1<0) {
				h = h-1+24;
				m = m-45+60;
				System.out.println(h + " " + m);
			}else {
				h--;
				m = m-45+60;
				System.out.println(h + " " + m);
			}
		}else {
			m = m-45;
			System.out.println(h + " " + m);
		}
	}

}
