package step_4_array;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Array8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = new int[10];
		for(int i=0;i<10;i++) {
			a[i] = s.nextInt()%42;
		}
		int[] b = IntStream.of(a).distinct().toArray();
		System.out.println(b.length);
		
	}
}
