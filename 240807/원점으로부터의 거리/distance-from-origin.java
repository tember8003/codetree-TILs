import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Line implements Comparable<Line>{
	int x;
	int y;
	int num;
	public Line(int x,int y,int num) {
		this.x = x;
		this.y = y;
		this.num = num;
	}

	public int compareTo(Line line) {
		if(Math.abs(line.x)+Math.abs(line.y) != Math.abs(this.x)+Math.abs(this.y)){
			return (Math.abs(this.x)+Math.abs(this.y)) - (Math.abs(line.x)+Math.abs(line.y));
		}
		return this.num - line.num;
		
	}
}
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Line[] list = new Line[n];
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[i] = new Line(x,y,i+1);
		}
		
		Arrays.sort(list);
		
		for(Line line : list) {
			System.out.println(line.num);
		}
		
	}
}