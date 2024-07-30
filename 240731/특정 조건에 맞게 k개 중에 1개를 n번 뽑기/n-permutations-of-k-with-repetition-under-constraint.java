import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	//백트래킹 문제
	static int k,n;
	static int ans=0;
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		
		repeat(0);
	}
	public static void repeat(int length) {
		if(length==n) {
			for(int i=0; i<arr.size(); i++) {
				System.out.print(arr.get(i)+" ");
			}
			System.out.println();
			return;
		}
		for(int i=1; i<=k; i++) {
			if(arr.size()>=2) {//만약 2개까지 채워졌다면?
				if(arr.get(arr.size()-1) != arr.get(arr.size()-2) || arr.get(arr.size()-1)!=i) {
                    //첫번째 두번째 값이 
					arr.add(i);
					repeat(length+1);
					arr.remove(arr.size()-1);
				}
			}
			else {
				arr.add(i);
				repeat(length+1);
				arr.remove(arr.size()-1);
			}
		}
	}
}