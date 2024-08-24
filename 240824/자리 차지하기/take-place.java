import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	//TreeSet 문제
	static TreeSet<Integer> tree = new TreeSet<Integer>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		boolean[] check = new boolean[m+1];
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			arr[i]=num;
		}
		
		for(int i=1; i<=m; i++) {
			tree.add(i);
		}
		
		int ans=0;
		
		for(int i=0; i<n; i++) {
			if(tree.floor(arr[i])!=null) {
				int num = tree.floor(arr[i]);
				tree.remove(num);
				
				ans++;
			}
			else {
				break;
			}
		}
		
		System.out.println(ans);
	}
}