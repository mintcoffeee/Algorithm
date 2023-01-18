package step_5_String;

import java.util.Scanner;

public class String5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String c = s.next();
//		int[] a = new int[26];
//		for(int j,i=0;i<a.length;i++) {
//			for(j=0;j<c.length();j++) {
//				if('a'+i == c.charAt(j)) {
//					a[i] = j;
//					break;
//				}
//			}
//			if(j==c.length()) a[i] = -1;
//		}
//		for(int d:a) System.out.print(d+" ");
		
		int i=97;
		while(i<123)
			System.out.print(c.indexOf(i++)+" ");	
		//indexOf : indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며
		//			만약 찾지 못했을 경우 "-1"을 반환
	}
}
