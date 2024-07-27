import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	//dp문제
	static int n; //배열 크기
	static int[][] arr; //배열
	static int[] dy = {1,-1,0,0}; //동서남북 이동용
	static int[] dx = {0,0,1,-1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		int[][] dp = new int[n][n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				dp[i][j]=1; //dp 배열 1로 초기화
			}
		}
		
		for(int x=0; x<n; x++) { //좌표 하나하나 모두 시작점으로 잡고 최댓값 찾기
			for(int y=0; y<n; y++) {
				for(int i=0; i<4; i++) { //동서남북 이동 진행
					int nx=x+dx[i];
					int ny=y+dy[i];
					//범위 안에 들어가고 예전 위치보다 값이 커지면 된다.
					if((nx<n && nx>=0 && ny<n && ny>=0 ) && arr[nx][ny] > arr[x][y]) {
						dp[nx][ny] = Math.max(dp[nx][ny], dp[x][y]+1);
					}
				}
			}
		}

		//DP 배열내 최댓값 찾기
		int ans=Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				ans = Math.max(ans, dp[i][j]);
			}
		}
		
		System.out.println(ans);
	}
}