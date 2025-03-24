package ex0227;

public class ThrowsExam {
	public void aa(int i) throws ArithmeticException, NullPointerException {
        System.out.println("aa call....");
		//try {
          this.bb(i);
		//}catch (ArithmeticException e) {
		//	System.out.println("예외 발생 = " + e.getMessage());
		//}
		System.out.println("aa end.....");
	}
	
	public void bb(int i)throws ArithmeticException, NullPointerException {
		System.out.println("bb call....");
		try {
			//try {
			  int result = 100/i; //ArithmeticException 가능성
			  System.out.println("나눈 결과 = " + result);
			//}catch (ArithmeticException e) {
			//	System.out.println("0으로 나눌수 없어요.");
			//}
		}finally {
			System.out.println("bb end.....");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("***메인 시작 *****");
		ThrowsExam te = new ThrowsExam();
		try {
			//te.aa(2);
			te.aa(0);
		}catch (ArithmeticException | NullPointerException e) {
			System.out.println("오류가 발생했어요~~");
		}
		System.out.println("***메인 끝 *******");
	}

}






