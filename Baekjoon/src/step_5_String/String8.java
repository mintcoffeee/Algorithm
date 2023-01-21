package step_5_String;

import java.util.Scanner;

public class String8 {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		String x=s.next(), y=s.next();
//		char[] xr = new char[x.length()], yr = new char[y.length()];
//		for(int j=0,i=x.length()-1;i>-1;i--,j++) {
//			xr[j] = x.charAt(i);
//			yr[j] = y.charAt(i);
//		}
//		int n = Integer.parseInt(String.valueOf(xr));
//		int m =  Integer.parseInt(String.valueOf(yr));
//		System.out.println(n > m ? n : m);
		
		//다른 사람 숏코딩 
	    Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
		int b=sc.nextInt();
		a=a%10*100+a/10%10*10+a/100;
		b=b%10*100+b/10%10*10+b/100;
		System.out.println(a<b?b:a);
	
	}
	
	

}
