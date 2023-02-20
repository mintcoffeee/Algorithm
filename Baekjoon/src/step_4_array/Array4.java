package step_4_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count=0; int[] ar = new int[9];int max=0;
		for(int i=0;i<9;i++) {
			ar[i] = Integer.parseInt(br.readLine());
			if(max < ar[i]) {
				max = ar[i];
				count = i+1;
			}
		}
		System.out.println(max+"\n"+count);
		bw.flush();
		bw.close();
	}
}
