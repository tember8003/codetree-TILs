import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] map=new int[102][102];
	static boolean[][] visited= new boolean[102][102];
	static int[] dy = {1,-1,0,0};
	static int[] dx = {0,0,1,-1};
	static int ans=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			map[x][y]=1;
		}
		
		dfs(1,1);
		System.out.println(ans);

	}
	
	public static void dfs(int x,int y) {
		if(map[x][y]==1) {
			ans++;
			return;
		}
		
		if(visited[x][y]) {
			return;
		}
		
		visited[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx >100 || nx<1 || ny>100 || ny<1) {
				continue;
			}
			dfs(nx,ny);
		}
	}

}