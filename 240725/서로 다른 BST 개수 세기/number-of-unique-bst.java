import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;
	static int[] dp;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2; i<=n; i++) {
			dp[i]=bst(i);
		}
		System.out.println(dp[n]);
		
	}
	public static int bst(int n) {
		int num_bst=0;
		for(int i=0; i<n; i++) {
			num_bst += dp[i] * dp[n-i-1];
		}
		return num_bst;
	}
}