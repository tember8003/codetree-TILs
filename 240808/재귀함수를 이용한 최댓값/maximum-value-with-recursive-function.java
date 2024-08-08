import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//재귀 문제
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(repeat(arr,n-1,0));
	}
	public static int repeat(int[] arr,int cnt, int ans) {
		if(cnt<0) {
			return ans;
		}
		if(ans < arr[cnt]) {
			return repeat(arr,cnt-1,arr[cnt]);
		}
		else {
			return repeat(arr,cnt-1,ans);
		}
	}
}