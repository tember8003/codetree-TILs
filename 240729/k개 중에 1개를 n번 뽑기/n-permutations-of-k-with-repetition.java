import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int k,n;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		repeat(0);

	}
	public static void repeat(int cnt) {
		if(cnt==n) {
			for(int i=0; i<list.size(); i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
			return;
		}
		else {
			for(int i=1; i<=k; i++) {
				list.add(i);
				repeat(cnt+1);
				list.remove(list.size()-1);
			}
		}
	}

}