import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n+1];
		int[] sum = new int[n+1];
		Arrays.fill(arr, 1);
		
		for(int i=0; i<b; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num]=0;
		}
		sum[1]=arr[1];
		
		for(int i=2; i<=n; i++) {
			sum[i] = sum[i-1]+arr[i];
		}
		
        //최대 수를 구한 후, (k - 최대)를 하면 최소 개수를 구할 수 있다.
		int min_num =0;
		for(int i=1; i<=n-k; i++) {
			min_num = Math.max(min_num, (sum[i+k]-sum[i]));
		}
		
		min_num = k - min_num;
		
		System.out.println(min_num);
	}
}