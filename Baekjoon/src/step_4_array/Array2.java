package step_4_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Array2 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			if(a[i]<b) bw.write(a[i]+" ");
		}
		bw.flush(); // 버퍼 비우기
        bw.close();
        br.close();
		
	}
}
