package stream.ex05;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class GroppingStreamExam {

	public static void main(String[] args) {
		 List<Student> students = Arrays.asList( 
		            new Student("희정", 22, 88.5, "Computer Science"), 
		            new Student("찬범", 24, 76.2, "Mathematics"), 
		            new Student("가현", 23, 92.3, "Computer Science"), 
		            new Student("현솔", 25, 81.7, "Physics"), 
		            new Student("현준", 21, 85.4, "Mathematics") 
		       );
		 
		System.out.println("1. 전공별 그룹핑......");
		Map<String, List<Student>> map = students.stream()
		//.collect(Collectors.groupingBy((s)-> s.getMajor() ) );
		 .collect(Collectors.groupingBy(Student :: getMajor ) );
		
		//출력
		/*map.forEach(new BiConsumer<String, List<Student>>() {
			@Override
			public void accept(String t, List<Student> u) {
			   System.out.println(t +" = " + u);
			}
		});*/
		
		map.forEach((major , studentList)-> System.out.println(major +" = " + studentList));
		
		System.out.println("2. 전공별 학생수 계산(counting)......");
		Map<String, Long> majorcountMap = students.stream()
		.collect(Collectors.groupingBy(Student :: getMajor, Collectors.counting()));
		
		System.out.println(majorcountMap);
		
		System.out.println("3. 전공별 점수의 평균......");
		Map<String , Double> averageMap =students.stream()
		.collect(Collectors.groupingBy(Student :: getMajor , 
				                  Collectors.averagingDouble(Student :: getScore)));
		
		
		System.out.println(averageMap);

	}

}

















