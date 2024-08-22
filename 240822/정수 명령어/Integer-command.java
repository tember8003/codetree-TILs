import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	//TreeSet 문제
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			TreeSet<Integer> tree = new TreeSet<Integer>();
			int t = Integer.parseInt(br.readLine());
			for(int j=0; j<t; j++) {
				st = new StringTokenizer(br.readLine());
				String command = st.nextToken();
				
				if(command.equals("I")) {
					int num = Integer.parseInt(st.nextToken());
					
					tree.add(num);
				}
				else {
					int num = Integer.parseInt(st.nextToken());
					
					if(tree.isEmpty()) {
						continue;
					}
					if(num < 0) {
						//tree.first();
						tree.remove(tree.first());
					}
					else {
						//tree.last();
						tree.remove(tree.last());
					}
				}
			}
			if(tree.isEmpty()) {
				sb.append("EMPTY"+"\n");
			}
			else {
				sb.append(tree.last()+" "+ tree.first()+"\n");
			}
		}
		System.out.println(sb.toString());
	}
}