package ex0306;import java.io.InterruptedIOException;

public class ThreadExam {

	public static void main(String[] args) {
		System.out.println("***메인 시작합니다.*****");
		
		// 1~ 100까지 출력
		NumberThread th1 = new NumberThread("첫번째 스레드");
		NumberThread th2 = new NumberThread("두번째 스레드");
		
		Thread th3 = new Thread(new AlphaThread(), "세번째 스레드");
		
		th1.start();
		th2.start();
		th3.start();
		
		/*th1.run();
		th2.run();
		th3.run();*/
//		try {
//		  th1.join(); //th1 스레드가 일을 다 마칠때가지 이 메소드를 실행한 메인 스레드는 일시정지
//		}catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("th1.sum = " + th1.sum); //5050??
		
		System.out.println("****메인 종료합니다.****");

	}

}
///////////////////////////////////////////////
/**
 *  1~ 100까지 출력하는 스레드
 * */
class NumberThread extends Thread{
	int sum=0;
	NumberThread(String name){
		super(name);//스레드 이름 설정
	}
	
	//스레드로 동작할 기능 작성
	@Override
	public void run() {
		
		for(int i=1 ; i<=100 ; i++) {
			System.out.println(super.getName() +" => " + i);
			
			sum+=i;//누적
			
			/*int time = (int)(Math.random()*100);//0~499
			try {
			  Thread.sleep(100);//일시정지상태
			}catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
			
		    Thread.yield(); //양보 (실행중인 상태를 Runnable상태로 만든다)
		}
		
		System.out.println(super.getName() +"스레드 종료합니다.sum = " + sum);
	}
}
///////////////////////////////////////////
/**
 * A~Z  출력하는 스레드 
 * */
class AlphaThread implements Runnable{

	@Override
	public void run() {
		//현재 동작하고 있는 스레드가 누구인지 가져오기 
		Thread th = Thread.currentThread();
		
		for(char ch='A' ; ch <='z' ; ch++) {
			System.out.println(th.getName() +"==> "+ch);
			
			/*int time = (int)(Math.random()*100);//0~499
			try {
			  Thread.sleep(100);//일시정지상태
			}catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			
			Thread.yield(); //양보 (실행중인 상태를 Runnable상태로 만든다)
		}
		
		System.out.println(th.getName() +"스레드 종료합니다.");
		
	}
}
//////////////////////////////////////////////










