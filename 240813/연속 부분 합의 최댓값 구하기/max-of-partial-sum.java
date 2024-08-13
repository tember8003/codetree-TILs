import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//dp 문제
	static int[] arr = new int[100001];
	static int[] dp = new int[100001];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			dp[i]=Integer.MIN_VALUE;
		}
		dp[1]=arr[1];
		
		for(int i=2; i<=n; i++) {
			dp[i]=Math.max(dp[i-1]+arr[i], arr[i]);
		}
		
		int ans = Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {
			ans = Math.max(dp[i], ans);
		}
		System.out.println(ans);
	}
}