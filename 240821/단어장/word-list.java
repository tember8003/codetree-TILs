import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	//treemap 비율 문제
	static TreeMap<String,Integer> map = new TreeMap<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++) {
			String word = br.readLine();
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word,1);
			}
		}
		
		Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String,Integer> entry = it.next();
			sb.append(entry.getKey() + " "+ entry.getValue()+"\n");
		}
		System.out.println(sb.toString());
	}
}