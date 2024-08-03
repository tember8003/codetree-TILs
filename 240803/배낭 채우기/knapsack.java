import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	//dp - 배낭문제
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[n+1][m+1];
		int[][] item = new int[n+1][2];
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			item[i][0]=Integer.parseInt(st.nextToken());
			item[i][1]=Integer.parseInt(st.nextToken());
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(item[i][0] > j) {
					dp[i][j]=dp[i-1][j];
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-item[i][0]]+item[i][1]);
				}
			}
		}
		System.out.println(dp[n][m]);
	}
}