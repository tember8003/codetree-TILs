import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{
	//dp문제 + 누적합?
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n+1];
		double[] dp = new double[n+1];
		dp[0]=1;
		
		for(int i=1; i<=n; i++) {
			arr[i]=Double.parseDouble(br.readLine());
			dp[i]=dp[i-1]*arr[i];
		}
		
		double ans=0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				ans=Math.max(ans,(dp[i]/dp[j]));
			}
		}
        
		System.out.println(String.format("%.3f", ans));
	}
}