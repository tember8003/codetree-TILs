import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] dp;
	static int ans=0;
	static int n,m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		dp = new int[n+1][m+1];
		
		for(int i=0;i<=m; i++) {
			dp[0][i]=1;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				dp[i][j] = dp[i][j-1];
				if(i<=j) {
					dp[i][j] += dp[i-1][j-1];
				}
			}
		}
		System.out.println(dp[n][m]);
	}
}