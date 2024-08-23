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
		int k = Integer.parseInt(st.nextToken());
		
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			tree.add(num);
		}
		
		for(int i=0; i<k; i++) {
			sb.append(tree.last()+" ");
			tree.remove(tree.last());
		}

		System.out.println(sb.toString());
	}
}