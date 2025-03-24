package ex0214.scannerex; //현재 클래스를 ex0214.scannerex폴더에 만들어주세요.

import java.util.Scanner; //java.util package에 있는 Scanner를 사용할께요.

public class ScannerExam {

	public static void main(String[] args) {
		//키보드 입력
        Scanner sc = new Scanner(System.in); //키보드입력을 받을 준비를 한다.
        
        while(true) {
        	System.out.println("1. 성적구하기      2. 종료 ----");
        	System.out.print("메뉴선택 > " );
        	int menuNo = sc.nextInt();
        	switch(menuNo) {
        	case 1 : 
        		System.out.print("국어점수는? : " );
                
                int kor = sc.nextInt();//키보드 입력 숫자 받기 
                //System.out.println("입력 점수는 "+ kor);
                
                System.out.print("영어점수는? : " );
                int eng = sc.nextInt();
               // System.out.println("입력 점수는 "+ eng);
                
                System.out.print("이름은 :" );
                //String name = sc.next();
                
                sc.nextLine();//기존에 남아 있는 \n을 제거한다.
                String name = sc.nextLine();
                
                System.out.println(name+"님 총점은 = "+ (kor+eng));
               break;
        	case 2 : 
        		System.out.println("다음에 만나요~~");
        		System.exit(0); //프로그램 강제종료
        		break;
        	default : System.out.println("번호는 1~ 2번만 해주세요.");
        	
        	}
        }
	}

}
