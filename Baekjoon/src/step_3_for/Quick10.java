package step_3_for;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class Quick10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuilder sb = new StringBuilder();
//		StringTokenizer st;
		String str;
//		int a,b;
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			if (st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				System.out.println(a+b);
				bw.write(String.valueOf(a + b));
				bw.newLine();
			} else {
				break;
			}
		}
	}
	
}

