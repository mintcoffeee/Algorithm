package step_5_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class String10 {
	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		while(s.hasNext())
			System.out.println(s.nextLine());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while((str = br.readLine()) != null)
			System.out.println(str);
	}
}
