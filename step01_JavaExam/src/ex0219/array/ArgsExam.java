package ex0219.array;

public class ArgsExam {
	public static void main(String[] args) {
		System.out.println("**메인 시작하기 **");
		
		System.out.println("args = " + args);
		System.out.println("args.length = " + args.length);
		
		//전달된 값을 출력 
		for(int i=0; i < args.length ; i++) {
			 System.out.println("args [ " + i +"] = " + args[i] );
		}
		
		System.out.println("--개선 된 for문 ---");
		//개선된 for 변경
		for(String s :  args ) {
			System.out.println(s);
		}
		
		
		//만약 인수로  숫자 두개 전달된다고 가정하고 두수의 합 구한다.
		// 문자열 --> 숫자로 변환 - Interger.parseInt(문자열)
		
		System.out.println(  args[0] + args[1] );//문자열이 + 붙이기

		int no1 = Integer.parseInt(args[0]);
		int no2 = Integer.parseInt(args[1]);
		
		System.out.println(  no1 + no2 );
		
		System.out.println("**메인 끝 **");

	}
}

/*
 *  컴파일
 *  실행 -   java ArgsExam 값 값 값 값......
 * 
 * */


