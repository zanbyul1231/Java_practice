package ex0213.제어문;

public class SwitchExam02 {

	public static void main(String[] args) {
		//1~ 12사이의 난수를 발생한다. 
		int month = (int)(Math.random()*12)+ 1;
		
		int endDay=31;
		/*switch(month) {
		   case 2 : endDay=28; break;
		   case 4:case 6: case 9: case 11: endDay=30; break;
		   //default : endDay=31;
		}*/
		
		 //java 14 이후 부터 가능
		/* switch(month) {
		   case 2 : 
			   endDay=28; 
			   break;
		   case 4,6,9,11: 
			   endDay=30; 
		      break;
		   //default : endDay=31;
		}*/
		
		 //break 대신 -> {}로 사용가능
		/*switch(month) {
		   case 2 ->{ 
			   endDay=28; 
		   }   
		   case 4,6,9,11 ->{ 
			   endDay=30; 
		   }  
		   //default : endDay=31;
		}*/
		
		
		
		 endDay = switch(month) {
		   case 2 -> 28; 
		      
		   case 4,6,9,11  ->{ 
		      System.out.println("dddd");
		      yield 30; 
		   }
		   default -> 31; 
		 };
		
		
		
		
		//최종결과
		System.out.println(month+"월은 "+ endDay +"까지입니다.");
	}

}
