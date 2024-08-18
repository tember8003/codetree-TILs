import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    //누적합 문제
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][n+1];
		int[][] sum = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				sum[i][j]=sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+arr[i][j];
			}
		}
		
		int max_num = 0;
		for(int i=1; i<=n-k+1; i++) {
			for(int j=1; j<=n-k+1; j++) {
				max_num = Math.max(max_num, (sum[i+k-1][j+k-1] - sum[i-1][j+k-1] - sum[i+k-1][j-1] +sum[i-1][j-1]));
			}
		}
		
		System.out.println(max_num);
	}
}