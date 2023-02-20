package step_1;

import java.util.Scanner;

public class Multi11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		
		int[] br = {b%10, b%100/10, b/100};
		int sum = 0;
		int[] result = new int[3];
		for(int i=0; i<result.length; i++) {
			result[i] = a * br[i];
			sum += result[i]*Math.pow(10,i);
			System.out.println(result[i] + " ");
		}
		System.out.println(sum);
	}
}
