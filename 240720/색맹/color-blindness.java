import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	char[][] map;
	char[][] map_change;
	static boolean[][] visited;
	static int[] dy = {0,0,1,-1};
	static int[] dx = {1,-1,0,0};
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		char[][] map = new char[n][n];
		char[][] map_change = new char[n][n];
		
		for(int i=0; i<n;i++) {
			String str = br.readLine();
			for(int j=0; j<n; j++) {
				map[i][j]=str.charAt(j);
				if(map[i][j]=='R' || map[i][j]=='G') {
					map_change[i][j]='R';
				}
				else {
					map_change[i][j]='B';
				}
			}
		}
		
		visited=new boolean[n][n];
		int ans1=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j]) {
					dfs(i,j,map);
					ans1++;
				}
			}
		}
		visited = new boolean[n][n];
		int ans2=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j]) {
					dfs(i,j,map_change);
					ans2++;
				}
			}
		}
		System.out.println(ans1+" "+ans2);
		
		
	}
	public static void dfs(int x,int y,char[][] maps) {
		if(visited[x][y]) {
			return;
		}
		visited[x][y]=true;
		
			
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx<0 || nx>=n || ny<0 || ny>=n) {
				continue;
			}
			if(maps[x][y]!=maps[nx][ny]) {
				continue;
			}
			dfs(nx,ny,maps);

		}
	}

}