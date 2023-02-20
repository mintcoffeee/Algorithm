package step_3_for;
import java.util.*;

public class Star8 {

	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=0; i<n; i++){
            String star="";
            for(int j=n-i-1; j<n; j++){
            	star += "*";
            }
            System.out.print(String.format("%"+n+"s",star));
            System.out.println();
        }
	}
}

