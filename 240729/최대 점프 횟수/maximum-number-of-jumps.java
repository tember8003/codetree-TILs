import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	//dp문제
	static int n; //배열 크기
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=n; i++) { //값 입력
			arr[i]=Integer.parseInt(st.nextToken());
			dp[i]=Integer.MIN_VALUE;
		}
		dp[1]=0;
		
		for(int i=2; i<=n; i++) {
			for(int j=1; j<i; j++) {
				if(dp[j]==Integer.MIN_VALUE) {
					continue;
				}
				
				if(j+arr[j]>=i) {//만약 j 인덱스에서 j칸을 이동할 수 있다면
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
		}
		
		Arrays.sort(dp); //오름차순 정렬
		System.out.println(dp[n]);
	}
}