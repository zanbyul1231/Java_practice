package ex0307;

public class InterruptedExam01 {
	public static void main(String[] args) {
		System.out.println("**메인 시작합니다.***");
		
		//람다안에서는 super를 사용할수 없다.
		 Thread th = new Thread(()->{
			 System.out.println(new Object().toString());
			 System.out.println(Thread.currentThread().toString());
			 try {
				 while(true) {
					 System.out.println("점심 메뉴는?");
					
					 Thread.sleep(1);//0.001초
				 }
			 }catch (InterruptedException e) {
				e.printStackTrace();
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
