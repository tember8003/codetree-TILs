import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n,m;//배열 크기
	static int[][] map; //배열
	static boolean[][] visited; //방문여부 확인
	static int[] dy = {1,-1,0,0}; //동서남북 이동
	static int[] dx = {0,0,1,-1}; //동서남북 이동
	static Queue<int[]> queue = new LinkedList<>(); //bfs용
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n+1][m+1];
		visited = new boolean[n+1][m+1];
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=m; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		if(bfs()) { //만약 오측 하단까지 도달했다면
			System.out.println(1);
		}
		else { //도달하지 못한 경우
			System.out.println(0);
		}	
	}
	
	public static boolean bfs() {
		visited[1][1]=true;
		queue.add(new int[] {1,1}); //초기 시작 위치 저장
		
		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			int tx = temp[0];
			int ty = temp[1];
			
			for(int i=0; i<4; i++) { //동서남북 탐색
				int nx = tx+dx[i];
				int ny = ty+dy[i];
				
				if(nx>n||nx<1||ny>m||ny<1) { //범위 벗어나면 X
					continue;
				}
				if(visited[nx][ny] || map[nx][ny]!=1) { //이미 방문했거나 1이 아니라면 X
					continue;
				}
				
				if(nx==n && ny==m) { //우측 하단에 도달한 경우
					return true;
				}
				queue.add(new int[] {nx,ny}); //동서남북 새로운 위치 저장
				visited[nx][ny]=true;
			}
		}
		return false; //우측 하단 도달하지 못한 경우
	}

}