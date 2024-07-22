import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n+1];
		if(n==2) {
			System.out.println(1);
		}
		else {
			for(int i=3; i<=n; i++) {
				dp[i]=Math.max(dp[i-2], dp[i-3])%10007+1;
			}
			System.out.println(dp[n]);
		}
	}
}