import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> maps = new HashMap<String, Integer>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				String name = st.nextToken();
				if(maps.containsKey(name)) {
					maps.put(name, maps.get(name)+1);
				}
				else {
					maps.put(name, 1);
				}
			}
		}
		List<String> KeySet = new ArrayList<String>(maps.keySet());
		KeySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return maps.get(o2).compareTo(maps.get(o1));
            }
        });
		int cnt=0;
		int ans=0;
		for(String key : KeySet) {
			if(cnt==3) {
				break;
			}
			cnt++;
			ans += maps.get(key);
		}
		
		System.out.println((int)(ans/3));

	}

}