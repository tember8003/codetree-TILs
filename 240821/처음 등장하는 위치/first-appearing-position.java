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
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(map.containsKey(num)) {
				continue;
			}
			else {
				map.put(num, i);
			}
		}
		
		Iterator<Entry<Integer,Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer,Integer> entry = it.next();
			sb.append(entry.getKey() + " "+ entry.getValue()+"\n");
		}
		System.out.println(sb.toString());
	}
}