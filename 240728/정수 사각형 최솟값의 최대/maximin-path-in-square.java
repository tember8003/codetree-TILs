import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n+3][n+3];
		int[][] dp = new int[n+3][n+3];
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		dp[1][1]=arr[1][1];
		for(int i=2; i<=n; i++) {
			dp[i][1]=Math.min(dp[i-1][1], arr[i][1]);
			dp[1][i]=Math.min(dp[1][i-1], arr[1][i]);
		}
		
		for(int i=2;i<=n; i++) {
			for(int j=2; j<=n; j++) {
				dp[i][j]=Math.min(Math.max(dp[i][j-1], dp[i-1][j]), arr[i][j]);
			}
		}
		
		System.out.println(dp[n][n]);
	}
}