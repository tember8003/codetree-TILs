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
		
		for(int i=0; i<n; i++) {
			String color = br.readLine();
			if(map.containsKey(color)) {
				map.put(color,map.get(color)+1);
			}
			else {
				map.put(color, 1);
			}
		}
		
		int size = n;
		Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String,Integer> entry = it.next();
			double val =(double)((100*entry.getValue() / size));
			System.out.print(entry.getKey()+" ");
			System.out.printf("%.4f",val);
			System.out.println();
		}
	}
}