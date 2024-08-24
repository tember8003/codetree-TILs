import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	static int MAX_NUM = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			arr[i]=num;
		}
		Arrays.sort(arr);
		
		int left = 0;
		int right = 1;
		
		int ans = MAX_NUM;
		while(right < n) {
			if(arr[right] - arr[left] < m) {
				right++;
			}
			else {
				ans = Math.min(ans, (arr[right]-arr[left]));
				left++;
			}
			
			if(left==right) {
				right++;
			}
		}
		
		if(ans == MAX_NUM) {
			System.out.println(-1);
		}
		else {
			System.out.println(ans);
		}
	}
}