package step_2_if;

import java.util.*;

public class Yun3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연도입력 : ");
		int yun = scan.nextInt();
		
		if(yun%4 == 0) {
			if(yun%400 != 0 && yun%100 ==0) 
				System.out.println("0");
			else 
				System.out.println("1");
		}else 
			System.out.println("0");
	}
}
