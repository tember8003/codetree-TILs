import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Line implements Comparable<Line>{
	int point;
	int num;
	public Line(int point,int num) {
		this.point = point;
		this.num = num;
	}
	
	public void SetPoint(int point) {
		this.point = point;
	}

	public int compareTo(Line line) {
		if(this.point == line.point) {
			return this.num - line.num;
		}
		return this.point - line.point;
	}
}
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		Line[] listSort = new Line[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			int point = Integer.parseInt(st.nextToken());
			arr[i] = point;
			listSort[i] = new Line(point, i+1);
		}
		
		Arrays.sort(listSort);
		boolean[] visited = new boolean[n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<listSort.length; j++) {
				if(!visited[j] && arr[i]==listSort[j].point) {
					System.out.print(j+1+" ");
					visited[j]=true;
					break;
				}
			}
		}
		
		
	}
}