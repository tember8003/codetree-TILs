import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Pair implements Comparable<Pair>{
	int x;
	int y;
	
	public Pair(int x,int y) {
		this.x= x;
		this.y =y;
	}

	@Override
	public int compareTo(Pair p) {
		if(this.x == p.x) {
			return this.y - p.y;
		}
		else {
			return this.x - p.x;
		}
	}
	
}
public class Main {
	//TreeSet 문제
	static TreeSet<Pair> tree = new TreeSet<Pair>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			tree.add(new Pair(x,y));
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(tree.ceiling(new Pair(x,y)) == null) {
				sb.append("-1 -1"+"\n");
			}
			else {
				Pair point = tree.ceiling(new Pair(x,y));
				sb.append(point.x +" "+ point.y+"\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}