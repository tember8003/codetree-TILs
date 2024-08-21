import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	//treemap 문제
	static TreeMap<Integer,Integer> map = new TreeMap<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if(command.equals("add")) { //key value 추가
				int key = Integer.parseInt(st.nextToken());
				int val = Integer.parseInt(st.nextToken());
				
				map.put(key, val);
			}
			else if(command.equals("find")) { //value 찾기
				int key = Integer.parseInt(st.nextToken());
				
				if(map.containsKey(key)) {
					sb.append(map.get(key)+"\n");
				}
				else {
					sb.append("None"+"\n");
				}
			}
			else if(command.equals("print_list")){ //전체 value 출력
				if(map.isEmpty()) {
					sb.append("None"+"\n");
				}
				else {
					Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
					while(it.hasNext()) {
						Entry<Integer,Integer> entry = it.next();
						sb.append(entry.getValue()+" ");
					}
					sb.append("\n");
				}
			}
			else { //remove
				int key = Integer.parseInt(st.nextToken());
				
				map.remove(key);
			}
		}
		
		System.out.println(sb.toString());
	}
}