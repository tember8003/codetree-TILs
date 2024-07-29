import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{
	//dp문제
	static int n,m; //동전 종류, 금액
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[n+1];
		int[] dp = new int[m+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=n; i++) { //값 입력
			coin[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=m; i++) {
			dp[i]=Integer.MAX_VALUE; //최소를 구해야하므로 최댓값으로 초기화
		}
		dp[0]=0;
		
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				if(i>= coin[j]) {
					if(dp[i-coin[j]]==Integer.MAX_VALUE) {
						continue;
					}
					
					dp[i] = Math.min(dp[i], dp[i-coin[j]]+1);
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