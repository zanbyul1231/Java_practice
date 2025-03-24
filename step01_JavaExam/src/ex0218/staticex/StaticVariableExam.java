package ex0218.staticex;

class Test{
	int a; //전역필드 = 인스턴스 필드
	static int b;  //전역필드 = static 필드 
}
/////////////////////////////////////////
public class StaticVariableExam {
	public static void main(String[] args) {
		 Test t1 = new Test();
		 Test t2 = new Test();
		 Test t3 = new Test();
		 
		 System.out.println("t1 = " + t1);
		 System.out.println("t2 = " + t2);
		 System.out.println("t3 = " + t3);
		 
		 // non-static 필드 
		 System.out.println("t1.a = " + t1.a);
		 System.out.println("t2.a = " + t2.a);
		 System.out.println("t3.a = " + t3.a);
		 
		 System.out.println("--변경 후 ---");
		 //값변경
		 t2.a=100;
		 System.out.println("t1.a = " + t1.a);
		 System.out.println("t2.a = " + t2.a);
		 System.out.println("t3.a = " + t3.a);

		 
		// static 필드 
		 System.out.println("--static 필드 ---");
		 System.out.println("t1.b = " + t1.b);
		 System.out.println("t2.b = " + t2.b);
		 System.out.println("t3.b = " + t3.b);
		 
		 System.out.println("--변경 후 ---");
		 //값변경
		 //t2.b=50;
		 Test.b=70;
		 System.out.println("t1.b = " + t1.b);
		 System.out.println("t2.b = " + t2.b);
		 System.out.println("t3.b = " + t3.b);
	}

}
