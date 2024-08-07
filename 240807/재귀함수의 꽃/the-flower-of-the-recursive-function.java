import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    //재귀 문제
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		repeat(n,false);
	}
	public static void repeat(int cnt,boolean check) {
		if(!check) {
			if(cnt==0) {
				repeat(cnt+1,true);
			}
			else {
				System.out.print(cnt+" ");
				repeat(cnt-1,check);
			}
		}
		else {
			if(cnt==n) {
				System.out.print(cnt);
				return;
			}
			else {
				System.out.print(cnt+" ");
				repeat(cnt+1,check);
			}
		}
	}
}