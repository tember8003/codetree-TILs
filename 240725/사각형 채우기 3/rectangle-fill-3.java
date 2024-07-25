import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] dp = new long[n+1];
		dp[0]=1; dp[1]=2; 
		if(n<=1) {
			System.out.println(dp[n]);
		}
		else if(n==2) {
			dp[2]=7;
			System.out.println(dp[n]);
		}
		else {
			dp[2]=7;
			for(int i=3; i<=n; i++) {
				dp[i]=(2*dp[i-1]+3*dp[i-2])%1000000007;
				for(int j=i-3; j>=0; j--) {
					dp[i]+=(dp[j]*2)%1000000007;
				}
			}
			System.out.println(dp[n]);
		}
	}
}