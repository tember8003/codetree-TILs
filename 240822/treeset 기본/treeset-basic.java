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
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if(command.equals("add")) {
				int num = Integer.parseInt(st.nextToken());
				
				tree.add(num);
			}
			else if(command.equals("remove")) {
				int num = Integer.parseInt(st.nextToken());
				
				tree.remove(num);
			}
			else if(command.equals("find")) {
				int num = Integer.parseInt(st.nextToken());
				
				if(tree.contains(num)) {
					sb.append(true+"\n");
				}
				else {
					sb.append(false+"\n");
				}
			}
			else if(command.equals("lower_bound")) {
				int num = Integer.parseInt(st.nextToken());
				
				if(tree.ceiling(num)== null) {
					sb.append("None"+"\n");
				}
				else {
					sb.append(tree.ceiling(num)+"\n");
				}
			}
			else if(command.equals("upper_bound")) {
				int num = Integer.parseInt(st.nextToken());
				
				if(tree.higher(num)==null) {
					sb.append("None"+"\n");
				}
				else {
					sb.append(tree.higher(num)+"\n");
				}
			}
			else if(command.equals("largest")) {
				if(tree.isEmpty()) {
					sb.append("None"+"\n");
				}
				else {
					sb.append(tree.last()+"\n");
				}
			}
			else {
				if(tree.isEmpty()) {
					sb.append("None"+"\n");
				}
				else {
					sb.append(tree.first()+"\n");
				}
			}
		}
		System.out.println(sb.toString());
	}
}