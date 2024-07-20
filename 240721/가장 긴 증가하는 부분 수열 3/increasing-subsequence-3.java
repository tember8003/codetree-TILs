import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n+1]; 
		int[] arr = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			dp[i]=1;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=i+1; j<=n; j++) {
				if(arr[i]<arr[j]) {
					dp[j] = Math.max(dp[j], dp[i]+1);
				}
			}
		}
		Arrays.sort(dp);
		System.out.println(dp[n]);
	}
}