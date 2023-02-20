package step_3_for;
import java.util.*;

public class Script4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int X = s.nextInt(), n=s.nextInt();
		int a,b, mul, sum=0;
		for(int i=0; i<n; i++) {
			a=s.nextInt();
			b=s.nextInt();
			mul = a*b;
			sum += mul;
		}
		System.out.println(sum == X ? "Yes" : "No");
	}
}
