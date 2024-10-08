import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;//배열 크기
	static int k; //시작 지점
	static int[][] map; //배열
	static boolean[][] visited; //방문여부 확인
	static int[] dy = {1,-1,0,0}; //동서남북 이동
	static int[] dx = {0,0,1,-1}; //동서남북 이동
	static Queue<int[]> queue = new LinkedList<>(); //bfs용
	static int ans=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		map = new int[n+1][n+1];
		visited = new boolean[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(!visited[x][y]) {
				ans++;
				bfs(x,y);
			}
		}
		System.out.println(ans);
	}
	
	public static void bfs(int x,int y) {
		visited[x][y]=true;
		queue.add(new int[] {x,y}); //초기 시작 위치 저장
		
		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			int tx = temp[0];
			int ty = temp[1];
			
			for(int i=0; i<4; i++) { //동서남북 탐색
				int nx = tx+dx[i];
				int ny = ty+dy[i];
				
				if(nx>n||nx<1||ny>n||ny<1) { //범위 벗어나면 X
					continue;
				}
				if(visited[nx][ny] || map[nx][ny]!=0) { //이미 방문했거나 0이 아니라면 X
					continue;
				}
				
				ans++;
				queue.add(new int[] {nx,ny}); //동서남북 새로운 위치 저장
				visited[nx][ny]=true;
			}
		}
	}

}