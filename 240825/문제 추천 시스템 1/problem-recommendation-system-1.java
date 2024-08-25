import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Node implements Comparable<Node>{
	int P;
	int L;
	
	public Node(int P,int L) {
		this.P = P;
		this.L = L;
	}
	
	public int compareTo(Node n) {
		if(this.L == n.L) {
			return this.P - n.P;
		}
		else {
			return this.L - n.L;
		}
	}
}
public class Main {
    //TreeSet 문제
	static TreeSet<Node> tree = new TreeSet<Node>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			st= new StringTokenizer(br.readLine());
			int P = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			
			tree.add(new Node(P,L));
		}
		
		int m = Integer.parseInt(br.readLine());
		
		for(int i=0; i<m; i++) {
			st= new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if(command.equals("rc")) {
				int num = Integer.parseInt(st.nextToken());
				if(num==1) {
					sb.append(tree.last().P+"\n");
				}
				else {
					sb.append(tree.first().P+"\n");
				}
			}
			else if(command.equals("ad")) {
				int P = Integer.parseInt(st.nextToken());
				int L = Integer.parseInt(st.nextToken());
				
				tree.add(new Node(P,L));
			}
			else {
				int P = Integer.parseInt(st.nextToken());
				int L = Integer.parseInt(st.nextToken());
				tree.remove(new Node(P,L));
			}
		}
		System.out.println(sb.toString());
	}
}