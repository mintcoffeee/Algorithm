package step_4_array;
import java.util.*;
public class Array9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(), m=s.nextInt();
		Integer[] a = new Integer[n];
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) a[i]=i+1;
		for(int i=0; i<m;i++) {
			for(int c=s.nextInt()-1, d=s.nextInt()-1;c<=d;c++) {
				list.add(a[c]);
			}
			Collections.reverse(list);
			a[c] = list.toArray(a);
		}
		
		for(int da : a) System.out.println(da);
	}
}

