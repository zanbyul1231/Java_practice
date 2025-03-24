package stream.ex02;

import java.util.Arrays;
import java.util.List;

public class FilterStreamExam02 {
	public static void main(String[] args) {
		List<String> list = 
				Arrays.asList("장희정","정정화","오윤겸","장희정","손지민","황태윤","오윤겸");
		
		System.out.println("1.중복행 제거 -------------");
		long count = list.stream().distinct().count();
		System.out.println("개수 : " + count);
		
		list.stream().distinct().forEach(System.out :: println);
		
		System.out.println("1. filter 요소 걸러내기 -------------");
		
		list.stream().filter((s)->s.equals("장희정")).forEach(System.out::println);
		
		System.out.println();
		list.stream().filter((s)->s.startsWith("장")).forEach(System.out::println);
		
		System.out.println();
		list.stream().filter((s)->s.endsWith("겸")).forEach(System.out::println);
		
		System.out.println();
		
		list.stream()
		.distinct()
		.filter((s)->s.startsWith("장"))
		.forEach(System.out :: println);
		

	}

}











