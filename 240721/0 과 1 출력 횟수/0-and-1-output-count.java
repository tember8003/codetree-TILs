import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int zero=0;
	static int one=0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n==0) {
			System.out.println(1+" "+0);
		}
		else if(n==1){
			System.out.println(0+" "+1);
		}
		else {
			codetree(n);
			System.out.println(zero+" "+one);
		}
		
	}
	public static void codetree(int n) {
		if(n==0) {
			zero++;
		}
		else if(n==1) {
			one++;
		}
		else {
			codetree(n-1);
			codetree(n-2);
		}
	}

}