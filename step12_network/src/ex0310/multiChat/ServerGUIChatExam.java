package ex0310.multiChat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 클라이언트와 멀티채팅을 위한 Server
 * */
public class ServerGUIChatExam {
     Socket sk;
     String userIp;
     List<ClientSocketThread> list = new ArrayList<>();
     
	 public ServerGUIChatExam() {
    	 try(ServerSocket server = new ServerSocket(8000)){
    		 while(true) {
    			System.out.println("client 접속 대기중입니다.");
    			sk = server.accept();//클라이언트 접속 대기
    			userIp = sk.getInetAddress().toString();
    			System.out.println(userIp+"님 접속 되었습니다.^^");
    			
    			//Thread를 생성해서 list에 저장한다.
    			ClientSocketThread th = new ClientSocketThread();
    			
    			th.start();//준비상태
    			list.add(th);
    			
    			System.out.println("현재 접속 인원 : " + list.size()+"명\n");
    			
    		 }
    		 
    	 }catch (Exception e) {
			e.printStackTrace();
		}
     }//생성자 끝
	 
	 /////////////////////////////////////////////////////
	 /**
	  * 클라이언트 Socket을 스레드로 만들어서 특정 클라이언트가 보내오는 내용을
	  * 읽어 접속된 모든 클라이언트에게 데이터를 전송하는 스레드
	  * */
	 class ClientSocketThread extends Thread{
		 BufferedReader br;
		 PrintWriter pw;
		 String nickName;
		 
		 ClientSocketThread(){
			 try {
				//읽기
				 br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
				 
				//쓰기 = 전송
				pw = new PrintWriter(sk.getOutputStream() , true);
			 }catch (Exception e) {
				System.out.println("생성자 catch.....");
				e.printStackTrace();
			}
		 }
		 
		 @Override
		public void run() {
			 try {
				
				//대화명 받기 준비
				nickName = br.readLine();
				
				//접속된 모든 client에게 "~님이 입장하셨습니다." 메시지 전송한다
				sendMessage("["+nickName+"]님 입장하셨습니다.");
				
			   while(true) {
				  String inputData =  br.readLine();//현재스레드 user의 br에서 데이터를 읽는다.
				  if (inputData == null)break;
				  //읽은 데이터를 모든 user에게 전송
				  sendMessage("["+nickName+"]" + inputData);
			   }
				 
				 
			 }catch (Exception e) {
				//현재 스레드에서 예외가 발생했다 즉 sk 끊힌 경우 
				//list에 현재 스레드를 제거한다.
				 list.remove(this);
				 
				 //모든 user에게 알린다.
				 sendMessage("["+nickName+"]님 퇴장하셨습니다.");
				 
				 //서버콘솔에 출력
				 System.out.println("["+nickName+"]님 퇴장하셨습니다. | 현재 인원 = " + list.size()+"명");
				
			}
		}
	 }//inner클래스 끝
	 
	 
	 /**
	  *  list에 있는 thread를 조회해서 pw를 이용해 모든 user에게 데이터를 전송하는 메소드 
	  * */
	 public void sendMessage(String message) {
		 for(ClientSocketThread th : list){
			th.pw.println(message);//클라이언트에게 전송한다
		 }
	 }
	  
     
	public static void main(String[] args) {
		new ServerGUIChatExam();

	}

}
