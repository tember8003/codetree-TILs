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
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++){
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if(command.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				pq.add(num);
			}
			else if(command.equals("pop")) {
				sb.append(pq.poll()+"\n");
			}
			else if(command.equals("size")) {
				sb.append(pq.size()+"\n");
			}
			else if(command.equals("empty")) {
				if(pq.isEmpty()) {
					sb.append(1+"\n");
				}
				else {
					sb.append(0+"\n");
				}
			}
			else {
				sb.append(pq.peek()+"\n");
			}
		}
		System.out.println(sb.toString());
	}
}