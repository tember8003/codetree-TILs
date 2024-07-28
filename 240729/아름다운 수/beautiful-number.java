import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	//백트래킹 문제
	static int n;
	static int ans=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		
		repeat("",0);
        
		System.out.println(ans);

	}

	public static void repeat(String str, int length) {
		if(length==n) {
			ans++;
			return;
		}
		
		String temp="";
		for(int i=1; i<=4; i++) {
			if(length+i<=n) {
				for(int j=0; j<i; j++) { //해당 숫자만큼 같은 수 연달아나오게 하기
					temp+=Integer.toString(i);
				}
				repeat(str+temp,length+i);
			}
		}
	}

}