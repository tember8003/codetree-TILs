import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//int[] dp = new int[n+1];
		//Arrays.fill(dp, 0);
		int ans=0;
		while(n!=1) {
			if(n>=3 && n%3==0) {
				n/=3;
				ans++;
			}
			else if(n>=2 && n%2==0) {
				n/=2;
				ans++;
			}
			else {
				n--;
				ans++;
			}
		}
		System.out.println(ans);
	}
}