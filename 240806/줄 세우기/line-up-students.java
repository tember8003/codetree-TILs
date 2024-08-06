import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student implements Comparable<Student>{
	int height;
	int weight;
	int num;
	
	public Student(int height,int weight,int num) {
		this.height = height;
		this.weight = weight;
		this.num = num;
	}
	
	public int compareTo(Student student) {
		if(this.height == student.height) {
			return student.weight - this.weight;
		}
		else {
			return student.height - this.height;		
		}
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
			int height = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			list[i] = new Student(height,weight,i+1);
		}
		
		Arrays.sort(list);
		for(int i=0; i<n; i++) {
			System.out.println(list[i].height+" "+list[i].weight+" "+list[i].num);
		}
	}
}