import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Student implements Comparable<Student>{
	String name;
	int height;
	double weight;
	
	public Student(String name, int height,double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public int compareTo(Student student) {
		return this.name.compareTo(student.name);
	}
}
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		
		Student[] list = new Student[5];
		StringTokenizer st;
		
		for(int i=0; i<5; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int height = Integer.parseInt(st.nextToken());
			double weight = Double.parseDouble(st.nextToken());
			list[i] = new Student(name, height, weight);
		}
		
		Arrays.sort(list);
		System.out.println("name");
		for(Student student : list) {
			System.out.println(student.name+" "+student.height+" "+student.weight);
		}
		
		System.out.println();
		
		Arrays.sort(list,new Comparator<Student>() {
			public int compare(Student a,Student b) {
				return b.height - a.height;
			}
		});
		System.out.println("height");
		for(Student student : list) {
			System.out.println(student.name+" "+student.height+" "+student.weight);
		}
	}
}