import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Store{
	int set;
	int money;
	
	public Store(int set,int money) {
		this.set = set;
		this.money =money;
	}
}
public class Main {
	//dp 문제
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		Store[] store = new Store[p];
		int[] dp = new int[n+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		for(int i=0; i<p; i++) {
			st = new StringTokenizer(br.readLine());
			int set = Integer.parseInt(st.nextToken());
			int money = Integer.parseInt(st.nextToken());
			
			store[i] = new Store(set, money);
		}
		
		dp[0]=0;
		for(int i=1; i<=n; i++) {
			for(int j=0; j<p; j++) {
				if(i - store[j].set >= 0) {
					dp[i] = Math.min(dp[i], dp[i-store[j].set] + store[j].money);
				}
			}
		}
		
		System.out.println(dp[n]);
	}
}