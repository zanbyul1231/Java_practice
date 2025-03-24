package ex0307;

public class InterruptedExam02 {
	public static void main(String[] args) {
		System.out.println("**메인 시작합니다.***");
		
		 Thread th = new Thread(()->{
			
			 while(true) {
				 System.out.println("점심 메뉴는?");
				 if(Thread.interrupted())break;
				
			 }
			
		 });
		 
		 th.start();
		
		 //3초가 지나면 th 스레드를 멈추게 하고 싶다!!!!
		 try {
		  Thread.sleep(3000);//3초
		  
		  //잠시라도 일시 정지상태가 되었을때 interrupt를 감지하고 InterutedExecption가 발생된다.
		  th.interrupt();//스레드를 InterutedExecption을 발생시킨다.
		  
		  
		 }catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("**메인 종료합니다.***");
	}

}
