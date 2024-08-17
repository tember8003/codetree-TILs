import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	//해시셋 문제
	static HashSet<Integer> set = new HashSet<Integer>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			if(command.equals("find")) {
				if(set.contains(num)) {
					sb.append("true"+"\n");
				}
				else {
					sb.append("false"+"\n");
				}
			}
			else if(command.equals("add")) {
				set.add(num);
			}
			else {
				set.remove(num);
			}
		}
        
		System.out.println(sb.toString());
	}
}