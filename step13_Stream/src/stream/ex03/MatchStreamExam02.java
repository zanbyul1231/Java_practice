package stream.ex03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MatchStreamExam02 {
	public static void main(String[] args) {
		List<Student> list  = Arrays.asList(
				   new Student("희정", 22, 80, "컴퓨터"),
				   new Student("나영", 25, 60, "과학"),
				   new Student("미영", 21, 82, "컴퓨터"),
				   new Student("삼순", 30, 95, "국어"),
				   new Student("삼식", 22, 70, "수학"),
				   new Student("효경", 50, 80, "국어")
		 );
		
		//allMatch - 모든학생의 점수가 80이상인지 ?
		boolean re = list.stream().allMatch((s)-> s.getScore() >=80);
		System.out.println("allMatch = " + re);
		
		//anyMatch - 학생중에 80이상이 한명이라도 있는지?
		 re = list.stream().anyMatch((s)-> s.getScore() >=80);
		System.out.println("anyMatch = " + re);
		
		//noneMatch - 80이상이 아무도 없니?
		re = list.stream().noneMatch((s)-> s.getScore() >=80);
		System.out.println("noneMatch = " + re);
		
		
		//max() - 가장 많은 나이
		Student st = list.stream()
		.max((s1, s2)-> s1.getAge() - s2.getAge())
		.orElse(null);
		
		System.out.println(st.getAge());
		
		System.out.println("----------------------");
		IntStream stream = Arrays.stream(new int [] {1,3,5,6,8});
		int max = stream.max().getAsInt();
		System.out.println("max = "+max);
		
		 stream = Arrays.stream(new int [] {1,3,5,6,8});
		int min = stream.min().getAsInt();
		System.out.println("min = "+min);
		
		//min -가장 적은 나이
		
		
		

	}

}












