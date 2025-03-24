package ex0213.제어문;

public class IfExam02 {
    //실행을 위해서 반드시 필요한 메인메소드 
	public static void main(String[] args) {
		//1~ 12사이 난수 발생 해서 변수에 담는다. 
		int no = (int)(Math.random()*12)+ 1;
		
		//발생한 난수가 1이면 일요일, 2이면 월요일, 3이면 화요일, 4이면 수요일
		 // 5이면 목요일 6이면 금요일, 이외의 수는 토요일 출력한다.
	    char ch ='토';
		if(no==1) {
			ch='일';
		}else if(no==2) {
			ch='월';
		}else if(no==3) {
			ch='화';
		}else if(no==4) {
			ch='수';
		}else if(no==5) {
			ch='목';
		}else if(no==6) {
			ch='금';
		}/*else  {
			ch='토';
		}*/
		
		System.out.println(no+"는 "+   ch+"요일입니다.");
		
	}
}
