import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int Q;
	static ArrayList<Integer> gaemi = new ArrayList<Integer>();
	static ArrayList<Boolean> gaemi_broken = new ArrayList<Boolean>(Arrays.asList(false));
	static int command;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Q = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		gaemi.add(0);
		
		for(int i=0; i<Q; i++) {
			st = new StringTokenizer(br.readLine());
			command = Integer.parseInt(st.nextToken());
			
			switch(command) {
			case 100:
				int N = Integer.parseInt(st.nextToken());
				for(int j=0; j<N; j++) {
					gaemi.add(Integer.parseInt(st.nextToken()));
					gaemi_broken.add(false);
				}
				break;
			case 200:
				gaemi.add(Integer.parseInt(st.nextToken()));
				gaemi_broken.add(false);
				break;
			case 300:
				gaemi_broken.set(Integer.parseInt(st.nextToken()),true);
				break;
			case 400:
				sb.append(minRoad(Integer.parseInt(st.nextToken()))+"\n");
				break;
			}
				
		}
		
		System.out.println(sb.toString());

	}
	public static int minRoad(int num) {
		if(num==1) {
			return gaemi.get(gaemi.size()-1) - gaemi.get(1); 
		}
		else {
			int minNum = 0;
			int lowerNum =0;
			int upperNum =1000000000;
			int midNum;
			
			
			while(lowerNum <= upperNum) {
				midNum = (lowerNum + upperNum)/2;
				
				int numTemp=0;
				
				int last=-1000000001;
				
				for(int i=1; i<gaemi.size(); i++) {
					if(gaemi_broken.get(i)) {
						continue;
					}
					
					int current = gaemi.get(i);
					
					if(current - last >midNum) {
						numTemp++;
						last = current;
					}
				}
				
				if(numTemp <= num) {
					minNum = midNum;
					upperNum = midNum - 1;
				}
				else {
					lowerNum = midNum + 1;
				}
			}
			return minNum;
		}
	}

}
