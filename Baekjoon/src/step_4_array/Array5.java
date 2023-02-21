package step_4_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int[] ar = new int[n];
		for (int i = 0; i < m; i++) {
		    input = br.readLine().split(" ");
		    int start = Integer.parseInt(input[0]);
		    int end = Integer.parseInt(input[1]);
		    int value = Integer.parseInt(input[2]);
		    for (int j = start; j <= end; j++) {
		        ar[j-1] = value;
		    }
		}
		for (int d : ar) {
		    bw.write(d+" ");
		}
		bw.flush();

	}
}
