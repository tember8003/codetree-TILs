import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[n+1][3];
		
		dp[1][1]=1; dp[1][2]=0;
		dp[2][1]=1; dp[2][2]=1;
		if(n<=2) {
			System.out.println(dp[n][1]+dp[n][2]);
		}
		
		for(int i=3; i<=n; i++) {
			dp[i][1]=(dp[i-1][1]+dp[i-2][1])%10007;
			dp[i][2]=(dp[i-1][2]+dp[i-2][2])%10007;
		}
		
		System.out.println((dp[n][1]+dp[n][2])%10007);
	}
}