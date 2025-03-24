package ex0218.staticex;

public class StaticMethodExam {
	int a=5;
	static int b=10;
	
	//non-static영역안에서 static, non-staic모두 접근가능
	public void aa() {
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(StaticMethodExam.b);
		
		//메소드 호출
		bb();
		this.bb();
		
		dd();
		this.dd();
		StaticMethodExam.dd();
		
	}
	
	public void bb() {}
	
	
	// static 메소드안에서 non-static 접근 불가 / this 사용안됨
	public static void cc() {
		//System.out.println(a);
		//System.out.println(this.a);
		
		System.out.println(b);
		//System.out.println(this.b);
		System.out.println(StaticMethodExam.b);
		
		//메소드 호출
		//bb();
		//this.bb();
		
		dd();
		//this.dd();
		StaticMethodExam.dd();
		
	}
	public static void dd() {
		
	}

	/**
	 * 메인메소드 보다 먼저 실행된다.
	 * : 데이터로딩, 환경설정 정보 세팅, DB 세팅과 같은 서비스 시작되기전에 해야할 사전 작업
	 * */
	static {
		System.out.println("static init block ~~~~~~~");
	}
	
	
	public static void main(String[] args) {
		System.out.println("메인메소드 시작합니다.~~~~~~~");
		// aa 호출하고 싶다!! --> 같은 클래스에 있지만 static메소드에서 non-static 접근이기에 생성해서 접근
		
		//dd()호출
		StaticMethodExam.dd();
         
	}

}








