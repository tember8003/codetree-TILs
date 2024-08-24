import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Store implements Comparable<Store>{
	int set;
	int money;
	
	public Store(int set,int money) {
		this.set = set;
		this.money =money;
	}
	
	public int compareTo(Store s) {
		return s.money - this.money;
	}
}
public class Main {
	//dp 문제
	static int MAX_NUM = 1000000001;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		Store[] store = new Store[p];
		int[] dp = new int[n+1];
		Arrays.fill(dp, MAX_NUM);
		
		for(int i=0; i<p; i++) {
			st = new StringTokenizer(br.readLine());
			int set = Integer.parseInt(st.nextToken());
			int money = Integer.parseInt(st.nextToken());
			
			store[i] = new Store(set, money);
		}
		
		dp[0]=0;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<p; j++) {
				if(i + store[j].set <= n) {
					dp[i + store[j].set] = Math.min(dp[i + store[j].set], dp[i] + store[j].money);
				}
				else {
					dp[n] = Math.min(dp[n], dp[i]+store[j].money);
				}
			}
		}
		
		System.out.println(dp[n]);
	}
}