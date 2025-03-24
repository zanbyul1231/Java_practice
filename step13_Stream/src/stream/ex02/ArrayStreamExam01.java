package stream.ex02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamExam01 {

	public static void main(String[] args) {
		System.out.println("1.String Array Stream ------------");
		String [] strArr = {"희정","현준","정화","민지","경찬"};
		/*for(String s:strArr) { //자료구조의 Iterator를 이용한 방식
			System.out.println(s);
		}*/
		
		//Stream을 이용해서  출력
		 //Arrays.stream(strArr).forEach((t)->System.out.println(t));//람다
		//Arrays.stream(strArr).forEach(System.out :: println);//메소드 참조
		
		Stream<String> stream = Arrays.stream(strArr);
		
		stream.forEach(System.out :: println);
		//stream.forEach(System.out :: println); //한번 사용한 Stream은 다시 사용불가
		
		System.out.println("2.int Array Stream ------------");
		int [] intArr = {1,2,3,4,5,6,7,8,9};
		IntStream.of(intArr).forEach(System.out :: println);
		
		System.out.println("3.range()  vs rangeClosed() ------------");
		IntStream.range(1, 10).forEach(System.out :: println);// 1 ~ 9
		System.out.println("-------------------");
		IntStream.rangeClosed(1, 10).forEach(System.out :: println);

	}

}






