import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student implements Comparable<Student>{
	String name;
	int height;
	int weight;
	
	public Student(String name, int height,int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public int compareTo(Student student) { //키 기준 오름차순 정렬
		return this.height - student.height;
	}
}
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Student[] list = new Student[n];
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int height = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			list[i] = new Student(name, height, weight);
		}
		
		Arrays.sort(list);
		for(Student student : list) {
			System.out.println(student.name+" "+student.height+" "+student.weight);
		}
	}
}