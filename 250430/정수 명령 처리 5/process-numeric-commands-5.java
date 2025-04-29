import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if(command.equals("push_back")) {
				int num = Integer.parseInt(st.nextToken());
				
				list.add(num);
			} else if(command.equals("pop_back")) {
				list.remove(list.size()-1);
			} else if(command.equals("size")) {
				sb.append(list.size()+"\n");
			} else {
				int num = Integer.parseInt(st.nextToken());
				
				sb.append(list.get(num-1)+"\n");
			}
		}
		
		System.out.println(sb.toString());

	}

}
