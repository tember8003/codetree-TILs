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
	static int MOD = 10007;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		
		int[] arr = {1,2,5};
		int[] dp = new int[n+1];
		if(n>=5) {
			dp[1]=1; dp[2]=1; dp[5]=1;
		}
		else if(n<5 && n>1) {
			dp[1]=1; dp[2]=1;
		}
		else {
			dp[1]=1;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<3; j++) {
				if(i>=arr[j]) {
					dp[i]+=(dp[i-arr[j]])%MOD;
				}
			}
		}
		System.out.println(dp[n]%MOD);
	}
}