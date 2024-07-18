import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> maps = new HashMap<String, Integer>();
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			String[] name = new String[3];
			for(int j=0; j<3; j++) {
				name[j]= st.nextToken();
			}
			Arrays.sort(name);
			String temp = "";
			for(int j=0; j<3; j++) {
				temp+=name[j];
			}
			if(maps.containsKey(temp)) {
				maps.put(temp, maps.get(temp)+1);
			}
			else {
				maps.put(temp, 1);
			}
		}
		
		int ans=0;
		List<String> keySet = new ArrayList<>(maps.keySet());
		for(String key : keySet) {
			ans = Math.max(ans, maps.get(key));
		}
		
		System.out.println(ans);

	}

}