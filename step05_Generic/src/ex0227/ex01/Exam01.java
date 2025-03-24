package ex0227.ex01;

public class Exam01 {

	public static void main(String[] args) {
		
		/*Box box = new Box();
		box.setContent("abcd");
		
		//데이터를 조회
		Object content = box.getContent();
		
		if ( content instanceof String s) {
			int index =s.indexOf("b");
			System.out.println("index = " + index);
		}*/
		///////////제네릭을 사용한 경우/////////////////////
         
		 Box<String> box1 = new Box<String>();
		 box1.setContent("abcd");
		 
		 String content = box1.getContent();
		 int index =content.indexOf("b");
			System.out.println("index = " + index);
			
		///////////////////////////////////////////////////
		Integer it  = 5; //AutoBoxing
		int i = it; //UnBoxing
			
			
			
	    Box<Integer> box2 = new Box<>();	
	    box2.setContent(20);
	    
	   int v = box2.getContent();
	   ////////////////////////////////
	   Box<Board> box3 = new Box<Board>();
	   box3.setContent(new Board());
	   
	   Board b = box3.getContent();
	   System.out.println( b.bno );
		 
	}

}














