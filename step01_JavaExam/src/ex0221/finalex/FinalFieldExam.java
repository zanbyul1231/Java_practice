package ex0221.finalex;



public class FinalFieldExam {
	int i;//0
	final int j; // final필드 / 반드시 초기화(명시적 초기화 + 생성자를 이용한 초기화)
	static final int k;//상수 / 반드시 초기화  
	
	static {
		k=30;
		//FinalFieldExam.k=30;//The final field FinalFieldExam.k cannot be assigned
	}
	
	public FinalFieldExam(int value) {
		this.j = value;
		
	
		//k= value;
	}
	
	
	public void test() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
	
		
		i=100;
		//j=10; //값변경 불가
		//k=50; //값변경 불가 
	}

	public static void main(String[] args) {
		FinalFieldExam f = new FinalFieldExam(100);
		f.test();
		
		FinalFieldExam f2 = new FinalFieldExam(5);
      
	}

}
