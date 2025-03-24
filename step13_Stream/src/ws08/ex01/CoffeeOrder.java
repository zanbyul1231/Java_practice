package ws08.ex01;

import java.util.List;
import java.util.stream.Collectors;

public class CoffeeOrder {

	public static void main(String[] args) {
		/**
		 * 1. 아침에 들어온 모든 커피 주문 목록을 List에 coffes라는 이름으로 담는다.
			2. 1을 소스로 스트림을 생성한다. 
			3. 주문 들어온 커피 목록 중에서 알파벳 “ o” 로 끝나는 커피가 가장 먼저 들
			어온 주문이다. 이 커피들을 기본 정렬을 하면 고객이 주문한 순서와 일치
			한다.
			4. 마지막으로 중복을 제거한 다음 커피들을 모아서 최종 출력한다.

		 * */
		
		List<String> coffees=  List.of(
									"Cappuccino",
									"Americano",
									"Espresso",
									"Caramel Macchiato",
									"Focha",
									"Cappuccino",
									"Espresso",
									"Batte"				
								);
		
		System.out.println("----올림차순으로 기본정렬하고--");
		List<String>	coffeeEndingIn1 = coffees.stream()
			     .sorted() //기본정렬
				.distinct()
				.collect(Collectors.toList());
		System.out.println(coffeeEndingIn1);
		
		
		
		System.out.println("----올림차순으로 기본정렬하고 끝이 o로 끝나는 주문먼저..------------");

		List<String>	coffeeEndingIn2 = coffees.stream()
			     .sorted()
			     .sorted((o1,o2)->{
					 if(o1.endsWith("o")  &&  !o2.endsWith("o")) {
						 return -1;// 오른쪽이 크다
					 }else if(!o1.endsWith("o")  &&  o2.endsWith("o")) {
						 return 1; //왼쪽이 크다
					 }else {
						return 0; // 같다
					 }
					})
				.distinct()
				.collect(Collectors.toList());
				
				System.out.println(coffeeEndingIn2);
	}

}
