import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	//dp문제
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] dp = new long[n+1];
		
		if(n<=3) {
			System.out.println(1);
		}
		else {
			dp[1]=1; dp[2]=1; dp[3]=1;
			for(int i=4; i<=n; i++) {
				dp[i]=dp[i-2]+dp[i-3];
			}
			System.out.println(dp[n]);
		}
	}
}