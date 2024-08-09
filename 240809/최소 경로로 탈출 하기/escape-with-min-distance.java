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
	static int[][] visited; //방문여부 확인 + 거리 계산
	static int[] dy = {1,-1,0,0}; //동서남북 이동
	static int[] dx = {0,0,1,-1}; //동서남북 이동
	static Queue<int[]> queue = new LinkedList<>(); //bfs용
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		visited = new int[n][m];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		bfs(0,0);
		if(visited[n-1][m-1]==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(visited[n-1][m-1]);
		}
	}
	
	public static void bfs(int x,int y) {
		queue.add(new int[] {x,y}); //초기 시작 위치 저장
		visited[x][y]=0;
		
		while(!queue.isEmpty()) {
			int[] temp =queue.poll();
			int tx = temp[0];
			int ty = temp[1];
			
			for(int i=0; i<4; i++) { //동서남북 탐색
				int nx = tx+dx[i];
				int ny = ty+dy[i];
				
				if(check(nx,ny)) {
					visited[nx][ny]=visited[tx][ty]+1;
					queue.add(new int[] {nx,ny}); //동서남북 새로운 위치 저장
				}
			}
		}
	}
	public static boolean check(int x,int y) {//이미 방문했거나 0이 아니라면 X
		return isRange(x,y) && map[x][y]==1 && visited[x][y]==0;
	}
	public static boolean isRange(int x,int y) {//범위 벗어나면 X
		return (0<=x && x<n && 0<=y && y<m);
	}

}