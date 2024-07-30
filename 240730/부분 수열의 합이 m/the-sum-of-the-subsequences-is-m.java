import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	//dp문제
	static int n,m; //동전 종류, 금액
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		int[] dp = new int[m+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=n; i++) { //값 입력
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=m; i++) {
			dp[i]=Integer.MAX_VALUE;
		}
		dp[0]=0;
		
		for(int i=1; i<=n; i++) {
			for(int j=m; j>=0; j--) {
				if(j>=arr[i]) {
					if(dp[j-arr[i]]==Integer.MAX_VALUE) {
						continue;
					}
					dp[j]=Math.min(dp[j], dp[j-arr[i]]+1);
				}
			}
		}
		
		if(dp[m]==Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
			System.out.println(dp[m]);
		}
	}
}