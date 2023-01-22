package step_5_String;
import java.io.IOException;
import java.util.Scanner;
public class String9 {
	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		String a = s.next();
//		int count=0;
//		for(int i=0;i<a.length();i++) {
//			switch(a.charAt(i)) {
//			case 'A': case 'B': case 'C':
//				count +=3;
//				break;
//			case 'D': case 'E': case 'F':
//				count +=4;
//				break;
//			case 'G': case 'H': case 'I':
//				count +=5;
//				break;
//			case 'J': case 'K': case 'L':
//				count +=6;
//				break;
//			case 'M': case 'N': case 'O':
//				count +=7;
//				break;
//			case 'P': case 'Q': case 'R': case 'S':
//				count +=8;
//				break;
//			case 'T': case 'U': case 'V':
//				count +=9;
//				break;
//			case 'W': case 'X': case 'Y': case 'Z':
//				count +=10;
//				break;
//			}
//		}
//		System.out.println(count);
//		
		
		int n, s = 0;
		while ((n = System.in.read() - 65) > -1){
			s += (n - n / 18 - n / 25) / 3 + 3;
		}
		System.out.print(s);
	}

}
