import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	//누적합 문제
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[1000003];
		int[] sum = new int[1000003];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[num]=1;
		}
		
		for(int i=1; i<=1000000; i++) {
			sum[i] = sum[i-1]+arr[i];
		}
		
		for(int i=0; i<Q; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0) {
				sb.append(sum[b]+"\n");
			}
			else {
				sb.append((sum[b] - sum[a-1])+"\n");
			}
		}
		
		System.out.println(sb.toString());	
	}
}