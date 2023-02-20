package step_1;

import java.util.*;

public class King09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] chess = new int[6];
		int[] result = {1, 1, 2, 2, 2, 8};
		for(int i=0; i<chess.length; i++) {
			chess[i] = scan.nextInt();
			result[i] = result[i] - chess[i] ;
		}
		for(int data : result)
			System.out.print(data + " ");
		
		
	}
}
