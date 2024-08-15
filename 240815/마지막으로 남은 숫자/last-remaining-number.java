import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	//우선순위 큐 내림차순 문제
	static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		st= new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			pq.add(num);
		}
		
		while(!pq.isEmpty()) {
			if(pq.size()==1) {
				break;
			}
			int one = pq.poll();
			int two = pq.poll();
			
			if(one-two==0) {
				continue;
			}
			pq.add(one - two);	
		}
		if(pq.isEmpty()) {
			System.out.println(-1);
		}
		else {
			System.out.println(pq.peek());
		}
	}
}