package ex0307;

public class SynchronizedExam {

	public static void main(String[] args) {
		System.out.println("**** 메인 시작합니다.*******");
		
		//공유객체 생성
		Bank bank = new Bank();
		
		CustomerThread th1 = new CustomerThread(bank, "생산자", true);
		CustomerThread th2 = new CustomerThread(bank, "소비자", false);
		
		th1.start();
		th2.start();
		
		System.out.println("****메인 종료합니다.*********");

	}

}
//////////////////////////////////////////////
/**
 * 여러 스레드 공유할 객체 
 * */
class Bank{
	int balance;//0
	
	/**
	 * 잔액을 인출 or 입금을 하는 기능
	 * @param : name은 생산자 or 소비자
	 *          state true이면 생산 / false 이면 소비 
	 *          
	 *          
	 *  제한자 synchronized : 특정 스레드가 메소드안에서 실행중일때는 다른 스레드 제어권을 뺏어가지 
	 *                        못한다. 메소드를 빠져나가야 잠금이 풀린다.  
	 *                        
	 *          wait() : 현재 스레드를 일시정지상태만듦
	 *          notify() , notfyAll() : wait()에 의해 일시정지상태의 스레드를 Runnable 상태로 만듦
	 *          단, wait() , notify(), notifyAll()메소드는 반드시 synchronzied 블럭안에서만 
	 *          가능하다. synchronzied블럭없이 사용함  java.lang.IllegalMonitorStateException에러 발생
	 *                              
	 * */
	public synchronized void balanceChage(String name , boolean state) {
		
		if(state) {//생산자
			if(balance < 1) {
				System.out.print(name+"===> 현재 잔액 확인 : " + balance+" , ");
				balance++;
				System.out.println(name+"====> 증가후 잔액확인 : " + balance);
			}else {
				System.out.println(name+"스레드는 wait() 중입니다....");
				try {
				  super.wait();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}else {//소비자
			if(balance >= 1) {
				System.out.print(name+"===> 현재 잔액 확인 : " + balance+" , ");
				balance--;
				System.out.println(name+"====> 감소후 잔액확인 : " + balance);
			}else {
				System.out.println(name+" 스레드 wait() 중입니다.");
				try {
				  super.wait();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		//wait()에 의해 일시정지중인 스레드를 깨운다.
		notifyAll();
		
		
	}//메소드끝
}//클래스끝

///////////////////////////////////////////////////
/**
 *고객 스레드
 * */
class CustomerThread extends Thread{
	Bank bank;
    boolean state;
	CustomerThread(Bank bank, String name, boolean state){
		super(name);//스레드이름 설정
		this.bank=bank;
		this.state=state;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=50 ; i++) {
			bank.balanceChage(super.getName() , state );
		}
		
		System.out.println(super.getName() +" 스레도 종료합니다.^^");
	}
}
//////////////////////////////







