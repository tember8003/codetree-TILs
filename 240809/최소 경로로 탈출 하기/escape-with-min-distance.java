import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    //BFS 문제
	static int n;
	static int m;
	static int[][] map; //배열
	static int[][] dist; //거리
	static boolean[][] visited; //방문여부 확인
	static int[] dy = {1,-1,0,0}; //동서남북 이동
	static int[] dx = {0,0,1,-1}; //동서남북 이동
	static Queue<int[]> queue = new LinkedList<>(); //bfs용
	static int ans=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n+1][n+1];
		dist = new int[n+1][n+1];
		visited = new boolean[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=m; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		bfs(1,1);
        if(dist[n][m]==0){
            System.out.println(-1);
        }
        else{
		    System.out.println(dist[n][m]); //최단거리 출력
        }
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
				if(visited[nx][ny] || map[nx][ny]==0) { //이미 방문했거나 0이라면 X
					continue;
				}
				
				dist[nx][ny] = dist[tx][ty]+1; //움직인 거리 설정
				queue.add(new int[] {nx,ny}); //동서남북 새로운 위치 저장
				visited[nx][ny]=true;
			}
		}
	}

}