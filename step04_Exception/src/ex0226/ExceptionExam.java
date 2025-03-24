package ex0226;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("**메인 시작합니다*****");
		System.out.println("args = " + args);
		try {
			 String param = args[0];
	      System.out.println("args[0] = " + param);
	      
	      //String -> int 변환
	      int convertNo = Integer.parseInt(param);
	      System.out.println("convertNo = " + convertNo);
	      
	      int result = 100/convertNo;
	      System.out.println("나눈결과 = " + result);
	      
	      //Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception 
		}catch(ArrayIndexOutOfBoundsException e) {
			//예외발생했을때 해얄 할일
			System.out.println("e = " + e);//e.toString()
		}catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요~~");
			System.out.println( "e.getMessage() = "+ e.getMessage() );
		}catch (Exception e) {
			System.out.println("예외가 발생했어요~~");
			
			e.printStackTrace();//개발상태에서는 쓰고 product환경에서 모두 삭제필수
			
		}finally {
			System.out.println("난 예외발생 여부 상관없이 무조건 실행한다!");
		}
	      
		System.out.println("**메인 끝*****");

	}

}
///////////////////////////////////////
///
///
///
///
///
///
/// 실행할때 java ExceptionExam 값 값 값 ....
