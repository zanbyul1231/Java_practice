package ex0212;


//class String{ }

//class System{ }

public class Test{
    //실행을 위해 반드시 필요한 메인메소드 작성
	public static void  main(String[] args) {
		
		//변수선언
		int i; //수자
		boolean b;//true, false
		
		
		Test t; //Test저장
		System s ; //System 저장
		
		//모니터 출력 
		System.out.println("\"안\t녕\n하세요.");
		System.out.println("Good nice"); //syso + ctrl + space + enter
		
		char ch0 = 'A';//10진수 A
		
		char ch1 = 65;//10진수 A	
		char ch2 = 0x0041; //16진수 A
		char ch3 = '\u0041'; //유니코드 A

		System.out.println(ch0);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);

	}

}
