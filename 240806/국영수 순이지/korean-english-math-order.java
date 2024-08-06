import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student implements Comparable<Student>{
	String name;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int kor,int eng,int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math=math;
	}
	
	public int compareTo(Student student) { //국어 영어 수학 우선순위 기준 내림차순
		if(this.kor == student.kor) {
			if(this.eng == student.eng) {
				return student.math - this.math;
			}
			else {
				return student.eng - this.eng;
			}
		}
		else {
			return student.kor - this.kor;
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
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			list[i] = new Student(name, kor, eng, math);
		}
		
		Arrays.sort(list);
		for(Student student : list) {
			System.out.println(student.name+" "+student.kor+" "+student.eng+" "+student.math);
		}
	}
}