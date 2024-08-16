import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	//우선순위 큐 오름차순 문제
	static PriorityQueue<Integer> pq = new PriorityQueue<>();
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		st= new StringTokenizer(br.readLine());
		
		int sum =0;
		double max_num=0;
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i]=num;
		}
		
		sum+=arr[n-1];
		pq.add(arr[n-1]);
		
		for(int i=n-2; i>=0; i--) {
			sum += arr[i];
			pq.add(arr[i]);
			
			int min_num = pq.peek();
			sum-=min_num;
			max_num = Math.max(max_num, (double)sum/(pq.size()-1));
			sum+=min_num;
		}
		
		System.out.printf("%.2f",max_num);
		
	}
}