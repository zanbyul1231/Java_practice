package ws08.ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class StudentCollectionTest {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList< >();
		
		totalList.add(new Student("전현무", "남", 92));
		totalList.add(new Student("한혜진", "여", 87));
		totalList.add(new Student("이장우", "남", 95));
		totalList.add(new Student("박나래", "여", 93));
		
		System.out.println("--1. 남학생만 묶어 List 생성---");
		//1. 남학생만 묶어 List 생성
		/*List<Student> maleList = totalList.stream()
		 		.filter(s->s.getGender().equals("남"))
		 		.collect(Collectors.toList());*/
			
		List<Student> maleList = totalList.stream()
				.filter(s->s.getGender().equals("남"))
				.toList();
		
		maleList.stream()
			.forEach(System.out :: println);
		
		System.out.println();
		
		//2. 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		System.out.println("--2. 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기---");
		totalList.stream()
		 .sorted((o1,o2)->o1.getScore() - o2.getScore())
		 .forEach(s-> System.out.println(s));
		
		/**
		 * comparing는 비교에 사용될 값을 가져오는 메서드를 입력해주면 
		 *  그것을 기반으로 하는 Comparator를 알아서 만들어 반환
		
		 * 메소드 참조 종류
			정적 메소드 참조: ClassName::staticMethodName
			인스턴스 메소드 참조: instance::instanceMethodName
			
			클래스 메소드 참조: ClassName::instanceMethodName 
			           (일반적으로 특정 객체가 아니라 클래스에 속한 메소드 참조)
			           
			생성자 참조: ClassName::new
		 * */
		
		System.out.println("--Comparator.comparing() -클래스 메소드 참조 사용해보기 ---");
		totalList.stream()
		.sorted(Comparator.comparing(Student :: getScore))
		.forEach(s-> System.out.println(s.getName()+", "+s.getScore()));
		
		
		System.out.println("--Comparator.comparing() 사용해보기 ---");
		totalList.stream()
		.sorted(Comparator.comparing(new Function<Student, Integer>() {
		  @Override
		public Integer apply(Student t) {
			return t.getScore();
		}
		}))
		.forEach(s-> System.out.println(s.getName()+", "+s.getScore()));
		

		System.out.println("3.----");
		
		//3. 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		totalList.stream()
		 .sorted(Comparator.comparing(Student :: getScore).reversed())
		 .forEach(s-> System.out.println(s.getName()+", "+s.getScore()));
		
		System.out.println();
		
		//4. 학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
				.collect(
					Collectors.toMap(
						s -> s.getName(), //Student 객체에서 키가 될 부분 리턴
						s -> s.getScore() //Student 객체에서 값이 될 부분 리턴
					)
			);
			
		System.out.println(map);
		
		

	}
}
