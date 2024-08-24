import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Node implements Comparable<Node>{
	int x;
	int y;
	
	public Node(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public int compareTo(Node n) {
		if(this.x == n.x) {
			return this.y - n.y;
		}
		else {
			return this.x - n.x;
		}
	}
}
public class Main {
	static TreeSet<Node> tree = new TreeSet<Node>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			tree.add(new Node(x,y));
		}
		
		for(int i=0; i<m; i++) {
			int num = Integer.parseInt(br.readLine());
			int temp_y = 0;
			if(tree.ceiling(new Node(num,temp_y))==null) {
				sb.append("-1 -1"+"\n");
			}
			else {
				sb.append(tree.ceiling(new Node(num,temp_y)).x+" "+tree.ceiling(new Node(num,temp_y)).y+"\n");
				tree.remove(tree.ceiling(new Node(num,temp_y)));
			}
		}
		
		System.out.println(sb.toString());
	}
}