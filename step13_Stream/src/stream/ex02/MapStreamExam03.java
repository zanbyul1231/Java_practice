package stream.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapStreamExam03 {
	public static void main(String[] args) {
		List<Student> list  = Arrays.asList(
		   new Student("희정", 22, 80, "컴퓨터"),
		   new Student("나영", 25, 60, "과학"),
		   new Student("미영", 21, 82, "컴퓨터"),
		   new Student("삼순", 30, 95, "국어"),
		   new Student("삼식", 22, 70, "수학"),
		   new Student("효경", 28, 80, "국어")
		);
		
		// 전체 출력
		list.stream().forEach(System.out :: println);
		
		System.out.println();
		
		// 점수만 출력
		list.stream()
		//.mapToInt((s)->s.getScore()) //IntStream
		.mapToInt(Student :: getScore)
		.forEach(System.out::println);
		
		System.out.println();
		
		//점수의 총점
		int sum = list.stream().mapToInt(Student:: getScore).sum();
		System.out.println("총점 : " + sum);
		
		//점수의 평균
		double avg = list.stream()
				.mapToInt(Student:: getScore)
				.average()
				.orElse(0.0);
		
		int count=(int)list.stream().mapToInt(Student::getScore).count();
		
		System.out.println("인원수 : " +  count);
		System.out.println("평균 : " +  avg);
		
		System.out.println();
		
		//점수가 80 이상인 학생들의 이름만 검색
		list.stream()
		//.map((s)->s.getName())
		.filter(s->s.getScore() >= 80)  //Stream<Student>
		.map(Student :: getName)        //Stream<String>
		.forEach(System.out :: println);
		
		

	}

}










