import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N+1][N+1];
		int[][] dp = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1; i<=N; i++) {
			dp[i][1]=dp[i-1][1]+arr[i][1];
			dp[1][i]=dp[1][i-1]+arr[1][i];
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1])+arr[i][j];
			}
		}
		
		System.out.println(dp[N][N]);
	}

}