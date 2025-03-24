package stream.ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectStreamExam01 {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>(); 
		totalList.add(new Student("장희정", "남", 92)); 
		totalList.add(new Student("하승현", "여", 87)); 
		totalList.add(new Student("오문정", "남", 95)); 
		totalList.add(new Student("김은영", "여", 93));
		
		//학생들중 남학생만 뽑아 새로운 List로 만들자
		List<Student> manList = totalList.stream()
		.filter((s)->s.getGender().equals("남"))
		.collect(Collectors.toList());
		
		manList.add(new Student("삼식이", "남", 85));//새로운데이터 추가
		
		manList.stream().forEach(System.out :: println);
		
		System.out.println("----collect() 대신 toList() 사용해보자");
		List<Student> manList2 = totalList.stream()
				.filter((s)->s.getGender().equals("남"))
				.toList(); //java 16 추가 
		
		
		//java.lang.UnsupportedOperationException - ImmutableCollections
		//manList2.add(new Student("철이", "남", 88));//실행시 에러
		
		manList2.stream().forEach(System.out :: println);
		
		System.out.println("----toMap<K, V> 사용해보자-------");
		
		//학생들정보를 이름을 key , 점수를 value 만들이서 Map 리턴 
		Map<String, Integer> map =totalList.stream()
		  // .collect(Collectors.toMap((s)->s.getName(), (s)->s.getScore()));
			.collect(Collectors.toMap(Student :: getName , Student :: getScore));
		System.out.println(map);

	}

}














