package ex0213.제어문;

public class IfExam01 {
   //실행을 위해서 반드시 필요한 메인메소드 작성
	
	public static void main(String [] args) {
		//1 ~ 100사이의 난수를 저장한다.
		int no = (int)(Math.random()*100 + 1);
		
		//
		if(no % 2 == 0) {//no를 2로 나눈 나머지가 0 이니?
			System.out.println(no+"는 짝수");
		}else {
			System.out.println(no+"는 홀수");
		}
		///////////////////////////////////////
		//난수 발생
		//double nansu = Math.random()*5; //0 ~ 4.xxx
		//System.out.println("nansu = " + nansu);
		
	}
	
}




