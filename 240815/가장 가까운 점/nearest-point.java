import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Pair implements Comparable<Pair>{
	int x,y;
	
	public Pair(int x,int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public int compareTo(Pair o) {
		if((Math.abs(this.x)+Math.abs(this.y)) == (Math.abs(o.x)+Math.abs(o.y))) {
			if(Math.abs(this.x)==Math.abs(o.x)) {
				return Math.abs(this.y) - Math.abs(o.y);
			}
			else {
				return Math.abs(this.x) - Math.abs(o.x);
			}
		}
		else {
			return (Math.abs(this.x)+Math.abs(this.y)) - (Math.abs(o.x)+Math.abs(o.y));
		}
	}
	
}
public class Main {
	//우선순위 큐 객체 정렬 문제
	static PriorityQueue<Integer> pq = new PriorityQueue<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		Pair[] pair = new Pair[n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			pair[i] = new Pair(x, y);
			
			pq.add(pair[i]);
		}
		
		for(int i=0; i<m; i++) {
			Pair bestP = pq.poll();
			int x = bestP.x+2;
			int y = bestP.y+2;
			
			
			pq.add(new Pair(x,y));
		}
		
		System.out.println((pq.peek().x) +" "+(pq.peek().y));
	}
}