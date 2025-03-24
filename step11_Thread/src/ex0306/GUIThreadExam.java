package ex0306;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIThreadExam extends JFrame{
	
	//화면구성을 담당할 Component 준비 
	JTextField text1 = new JTextField(5);
	JTextField text2 = new JTextField(5);
	JButton btn = new JButton("눌려봐");
	
    public GUIThreadExam() {
    	super("시계~~");
    	
    	//Container의 layout을 변경한다.
    	super.setLayout(new FlowLayout());
    	
    	//JFrame 창=Container 에 컴포넌트들을 추가한다.
    	Container con = super.getContentPane();
    	con.add(text1 );
    	con.add(text2);
    	con.add(btn);
    	
    	
    	//창의 크기
    	super.setSize(500, 400);
    	
    	//정중앙놓기
    	super.setLocationRelativeTo(null);//
    	
    	// 창을 보여줘
    	super.setVisible(true);
    	
    	//x  클릭했을때 창닫기 
    	super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	//시계스레드 시작
    	new ClockThread().start();
    	
    	//text박스에 숫자(1~ 1000) 출력 하는 스레드
    	new Thread(()->{
    		//기능
    	    for(int i=1; i<=1000 ; i++) {
    	    	//text1에 추가
    	    	text1.setText(i+"");
    	    	try {
    	    	 Thread.sleep(10);//0.01초
    	    	}catch (InterruptedException e) {
					e.printStackTrace();
				}
    	    }
    	}).start();
    	
    	//버튼을 클릭했을때 A~Z까지 text2에 출력한다.
    	/*btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});*/
    	
    	btn.addActionListener((e)->{
    		//System.out.println("되니?");
    		
    		new Thread(()->{
    			for(char ch='A' ; ch <='z' ; ch++) {
        			text2.setText( ch+"" );
        			try {
        			  Thread.sleep(200);
        			}catch (Exception ex) {
						ex.printStackTrace();
					}
        		}
    		}).start();
    		
    	});
    	
    	
    }//생성자끝
    
	public static void main(String[] args) {
		new GUIThreadExam();//

	}
	
	/////////////////////////////////////////
	/**
	 *  JFrame title에 시계움직이기 
	 * */
	class ClockThread extends Thread{
		@Override
		public void run() {
			while(true) {
				Calendar now = Calendar.getInstance();//현재날짜와 시간
				int y = now.get(Calendar.YEAR);
				int m = now.get(Calendar.MONTH);
				int d = now.get(Calendar.DATE);
				
				int h = now.get(Calendar.HOUR);
				int min = now.get(Calendar.MINUTE);
				int s = now.get(Calendar.SECOND);
				
				String time = y+"년 "+m+"월 "+ d+"일 "+h+" : "+min+" : "+s ;
				
				//JFrame title에 time 추가 
				//setTitle(time);
				
			    GUIThreadExam.this.setTitle(time);
			    try {
			      Thread.sleep(1000);//1초 정지해 
			    }catch (InterruptedException e) {
					e.printStackTrace();
				}
			    
			}//while문끝
		}//run끝
	}//inner클래스 끝		

}//클래스끄 
//////////////////////////////////////////////////////















