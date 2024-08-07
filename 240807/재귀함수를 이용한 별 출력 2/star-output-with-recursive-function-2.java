import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		repeat(n);
	}
	public static void repeat(int cnt) {
		if(cnt==0) {
			return;
		}
		
		for(int i=0; i<cnt; i++) {
			System.out.print("* ");
		}
		System.out.println();

		repeat(cnt-1);
        
		for(int i=0; i<cnt; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}