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
		for(int i=1; i<=100; i++) {
			for(int j=1; j<=100; j++) {
				if(map[i][j]!=1 && check(i,j)) {
					map[i][j]=2;
				}
			}
		}
		for(int i=1;i<=100; i++) {
			for(int j=1; j<=100; j++) {
				if(!visited[i][j] && map[i][j]==1) {
					dfs(i,j);
				}
			}
		}
		System.out.println(ans);

	}
	public static boolean check(int x,int y) {
		int count=0;
		count+=map[x+1][y]+map[x][y+1]+map[x-1][y]+map[x][y-1];
		if(count==4) {
			return true;
		}
		return false;
	}
	public static void dfs(int x,int y) {
		visited[x][y]=true;
		if(map[x+1][y]==0) {
			ans++;
		}
		if(map[x][y+1]==0) {
			ans++;
		}
		if(map[x-1][y]==0) {
			ans++;
		}
		if(map[x][y-1]==0) {
			ans++;
		}
		//System.out.println(x +" "+y+"좌표까지 ans값은 "+ans);
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx >100 || nx<1 || ny>100 || ny<1) {
				continue;
			}
			if(visited[nx][ny] || map[nx][ny]!=1) {
				continue;
			}
			visited[nx][ny]=true;
			dfs(nx,ny);
		}
	}

}