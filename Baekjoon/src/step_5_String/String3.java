package step_5_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String a = br.readLine();
			System.out.println(String.valueOf(a.charAt(0))+ String.valueOf(a.charAt(a.length()-1)));
		}
		br.close();
	}
}
