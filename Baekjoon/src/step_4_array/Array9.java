package step_4_array;
import java.util.*;
public class Array9 {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n=s.nextInt(), m=s.nextInt();
//		int[] a=new int[n];
//		for(int i=0;i<n;i++) a[i]=i+1;
//		for(int w=0; w<m; w++) {
//			int i=s.nextInt()-1,j=s.nextInt()-1;
//			int r=i;
//			Integer[] b = new Integer[j-i+1];
//			for(int k=0;i<=j;i++,k++) {
//				b[k] = a[i];
//			}
//			List<Integer> list = Arrays.asList(b);
//			Collections.reverse(list);
//			Integer[] c = list.toArray(b);
//			for(Integer d : c) {
//				a[r] = d;
//				r++;
//			}
//		}//for w
//		for(int d : a) System.out.print(d+" ");
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(), m=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) a[i]=i+1;
		for(int i=0;i<m;i++) {
			List<Integer> b = new ArrayList<Integer>();
			int f=s.nextInt()-1, t=s.nextInt()-1;
			for(int j=f;j<=t;j++) {
				b.add(a[j]);
			}
			for(int j=t,k=0;j>=f;j--,k++) {
				a[j] = b.get(k);
			}
		}
		for(int d:a) System.out.print(d+" ");
		
	}
}

