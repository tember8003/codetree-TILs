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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		int[] dp = new int[m+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		dp[0]=1;
		for(int i=1; i<=n; i++) {
			for(int j=m; j>=0; j--) {
				if(dp[j]==1 && arr[i]+j<=m) {
					dp[j+arr[i]]=1;
				}
			}
		}
        if(dp[m]==0){
            System.out.println("No");
        }
        else if(dp[m]==1){
            System.out.println("Yes");
        }
		
	}
}