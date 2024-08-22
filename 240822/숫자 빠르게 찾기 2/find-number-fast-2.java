import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	//TreeSet 문제
	static TreeSet<Integer> tree = new TreeSet<Integer>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			tree.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i=0; i<m; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(tree.ceiling(num) == null) {
				sb.append(-1+"\n");
			}
			else {
				sb.append(tree.ceiling(num)+"\n");
			}
		}
		System.out.println(sb.toString());
	}
}