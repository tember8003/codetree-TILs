import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	//백트래킹 문제
	static int n;
	static int ans=0;
	static int[] plus = {1,2,5};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		
		repeat(0);
		System.out.println(ans);

	}
	public static void repeat(int sum) {
		if(sum>n) {
			return;
		}
		else if(sum==n) {
			ans++;
			return;
		}
		for(int i=0; i<3; i++) {
			repeat(sum+plus[i]);
		}
	}
}