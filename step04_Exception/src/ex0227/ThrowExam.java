package ex0227;

import java.io.IOException;

public class ThrowExam {
	/**
	 * 매개변수로 전달된 i의 값은 음수면 안된다!
	 * */
	public void aa(int i) throws IOException{
		System.out.println("aa call.....");
		if(i < 0) {
			/*IllegalArgumentException e = 
					new IllegalArgumentException("음수는 안돼요~~");//
			
			throw e;// e 의 예외를 발생시켜라 
			
			//throw new IllegalArgumentException("음수는 안돼요~~");*/
			
			throw new IOException("음수 안됩니다!!!!");//Checked 예외이기 때문에 반드시 예외처리 필수
			
			
		}
		
		
		System.out.println("aa end.....");
	}

	public static void main(String[] args) throws IOException {
		System.out.println("****메인 시작****");
		
		new ThrowExam().aa(-5);
		
		System.out.println("****메인 끝 ******");

	}

}
