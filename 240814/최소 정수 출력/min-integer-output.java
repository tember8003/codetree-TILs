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
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num==0) {
				if(pq.isEmpty()) {
					sb.append(0+"\n");
				}
				else {
					sb.append(pq.poll()+"\n");
				}
			}
			else {
				pq.add(num);
			}
		}
		
		System.out.println(sb.toString());
	}
}