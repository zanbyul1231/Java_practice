package ex0228.lamda;

public class LamdaExam {
	public static void main(String[] args) {
	//1. 기존방식
		//AInterface a = new Test();
		//a.aa();
		
	 //2. Anonymous Inner class 형식
		/*AInterface a = 	new AInterface() {
			@Override
			public void aa() {
				System.out.println("Anonymous cal..");
				
			}
		};
		
		a.aa();*/
		
		/*3. 람다식 -  (변수,...) -> 기능
		@FunctionalInterface인경우만 가능*/
		//AInterface a = ()->System.out.println("람다식...");
		//a.aa();	
		
		BInterface b = i ->{
			System.out.println("i= " + i);
			System.out.println("인수가 있는 람다~");
		};
		
		//b.bb(5);
		
		
		//CInterface c = (i, j) -> i+j;
		CInterface c = (i, j) -> {
			return i+j;
		};
		
		//호출
		int re = c.cc(4, 6);
		System.out.println("re = " + re);

	}

}

///////////////////////////////////
class Test implements AInterface{

	@Override
	public void aa() {
		System.out.println("되니?");
		
	}
	
}
