package step_2_if;

import java.util.*;

public class Dice7 {

	public static void main(String[] args) {
		int[] ar = new int[3];
		int count=0, temp=0;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		
		for(int i=0;i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) {
					count++;
					temp = ar[i];
				}
			}// for j
		}//for i
		
		
		int max = Arrays.stream(ar).max().getAsInt();
		
		if(count == 3) {
			System.out.println(10000+(temp*1000));
		}else if(count == 0) {
			System.out.println(max * 100);
		}else {
			System.out.println(1000+(temp*100));
		}
	}
}
