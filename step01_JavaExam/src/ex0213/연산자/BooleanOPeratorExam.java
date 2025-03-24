package ex0213.연산자;

class BooleanOPeratorExam{
	public static void main(String args[]){
		boolean  t= true ;
		boolean f=false;
		
		System.out.println("true&false=" + (t&f));
		System.out.println("true&true=" + (t&t));
		System.out.println("false&false="+(f&f));
		System.out.println();
	
		System.out.println("true|false="+(t|f));
		System.out.println("true|true="+(t|t));
		System.out.println("false|false="+(f|f));
		System.out.println();

		//^ 는 양쪽이 같으면 false, 다르면  true
		System.out.println("true^false="+(t^f));
		System.out.println("true^true="+(t^t));
		System.out.println("true^false="+(t^f));
		System.out.println("true^true="+(t^t));
		System.out.println();

		System.out.println("true&&false="+(t&&f));
		System.out.println("true&&true="+(t&&t));
		System.out.println("true&&false="+(t&&f));
		System.out.println("false&&false="+(f&&f));
		System.out.println();

		System.out.println("true||false="+(t||f));
		System.out.println("true||true="+(t||t));
		System.out.println("false||false="+(f||f));
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i=" + i+"\tint j="+j);
		
		System.out.println("i>=j==>>"+(i>=j));//i가 j보다 크거나 같니?
		
		System.out.println("i>j=>>"+(i>j));
		System.out.println("i<=j=>>"+(i<=j));
		System.out.println("i<j=>>"+(i<j));
		
		System.out.println("i==j=>>"+(i==j));//같니?
		//System.out.println("i==j=>>"+(i=j));//대입해
		
		
		System.out.println("i!=j=>>"+(i != j));
		
		System.out.println("====================");
		
		//System.out.println( true | test()  );//주기가 긴연산자로 메소드 호출한다.
		
		//System.out.println( true || test()  );//주기가 짧은 연산자

	
		//System.out.println( false & test()  ); //false
		//System.out.println( false && test()  ); //false
		
		//삼항연산자
		// 조건식 ? 참인경우 : 거짓인경우 ;
		
		// 평균이 60이상이면 합격 , 아니면 불합격
		double avg = 70;// promotion 
		
		String result = avg > 60 ? "합격" : "불합격";
		
		System.out.println(avg + "는 " + result +" 입니다.");
		
		System.out.println("----------------------");
		//System.out.println(5/0);// -> 결과 ArithmeticException
		//System.out.println(   5/0.0 );//-> 결과 Infinity     Double.isInfinite()
		System.out.println(  5%0.0); //-> 결과 NaN       Dobule.isNaN()

		System.out.println("---End---");
		
		 i = 128; //값변경
		 
		 //byte b = i; //Type mismatch: cannot convert from int to byte
		 byte b = (byte)i;//casting
		 System.out.println("b = " + b);
		 
		 byte a=3, c=5;
		 
		 byte g = (byte)(a + c); //Type mismatch: cannot convert from int to byte
		
		
	}//메인메소드 끝
	
	
	public static boolean test() {
		System.out.println("test call..");
		
		return true;
		
	}
	
	
	
}









