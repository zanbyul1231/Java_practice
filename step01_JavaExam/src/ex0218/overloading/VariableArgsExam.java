package ex0218.overloading;

public class VariableArgsExam {
	
	public void test(int ... params) { // ... int형 인수 0개 이상 허용
		System.out.println(params);// 배열
		
		for(int index=0; index < params.length ; index++) {
			System.out.print(params[index] +" ");
		}
		
		System.out.println("\n--------------");
	}
	
	public void test2(Object ... objects ) {// 자바의 모든 타입이 0개 이상 허용
		
	}
	
	public void test3(String name, int ... params) {
	//public void test3( int ... params , String name) { //the variable argument type int of the method test3 must be the last parameter
		
	}

	public static void main(String args []) {
		
		VariableArgsExam va = new VariableArgsExam();
		va.test(4);
		va.test();
		
		va.test(4 , 3, 2);
		va.test(3,4,5,6,7,8,9);
		System.out.println("**************");
		
		va.test2("안녕");
		va.test2();
		va.test2("배고프다", 10, true , 4.5);


	}

}
