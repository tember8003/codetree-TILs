import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	//HashMap 사용 문제
	static HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();	
            
			if(command.equals("add")) {
				int k = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				
				maps.put(k, v);

			}
			else if(command.equals("remove")) {
				int k = Integer.parseInt(st.nextToken());
				
				maps.remove(k);

			}
			else {
				int k = Integer.parseInt(st.nextToken());
				
				if(maps.containsKey(k)) {
					sb.append(maps.get(k)+"\n");
				}
				else {
					sb.append("None"+"\n");
				}

			}
		}

		System.out.println(sb.toString());

	}
}