import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	//재귀 문제
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		System.out.println(repeat(n));
	}
	public static int repeat(int cnt) {
		if(cnt==0) {
			return 1;
		}
		else if(cnt==1) {
			return 1;
		}
		else {
			return repeat(cnt-1)*cnt;
		}
	}
}