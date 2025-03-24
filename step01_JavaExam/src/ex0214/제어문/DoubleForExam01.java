package ex0214.제어문;

public class DoubleForExam01 {
	public static void main(String[] args) {
		//1.  1 ~ 100가지 10행 10열로 출력 (for문 안에 for문이용)
		System.out.println("1.  1 ~ 100가지 10행 10열로 출력 (for문 안에 for문이용)");
		int sum=0;
		
		for(int i=0; i < 10; i++) {//10행
			for(int j=1; j<=10; j++) {//10열
				System.out.print( ++sum  +" ");
			}
	        System.out.println();
		}
		
		
		System.out.println("\n1.  1 ~ 100가지 10행 10열로 출력 (for문 안에 for문이용)");
		
		for(int i=0; i < 100; i+=10) {//10행  0  10  20  30  40 ... 
			for(int j=1; j<=10; j++) {//10열
				System.out.print((i+j)  +" ");
			}
	        System.out.println();
		}
		
		
		System.out.println("\n1.  1 ~ 100가지 10행 10열로 출력 (for문 안에 for문이용)");
		
		for(int i=0; i < 10; i++) {//10행   0 1 2 3 4 
			for(int j=1; j<=10; j++) {//10열
				System.out.print( (i*10+j)  +" ");
			}
	        System.out.println();
		}
		
		
		System.out.println("\n2. 1 ~ 100가지 10행 10열로 출력 (for문 안에  if문이용)");
		//2. 1 ~ 100가지 10행 10열로 출력 (for문 안에  if문이용)
		for(int i=1; i <= 100; i++) {//10행   0 1 2 3 4 
			System.out.print(i +" ");
			if(i%10==0)System.out.println();
		}
		
		
		//3. 구구단 출력  -  for 문안에 for문이용
		/*
		 * 
		 *  2*1=2  3*1=3 ..... 9*1=9
		 *  2*2=4  3*2=4  4*2=4
		 *  2*3=6
		 *  ..
		 *  
		 *  2*9=18              9*9=81
		 * 
		 * */
		for( int row =1 ; row<= 9; row++) {//9행
			for(int col=2 ; col <=9; col++) {//8열
				System.out.print(col +"*" + row +"="+(col*row)+"\t");
			}
			 System.out.println();
		}	
		
		System.out.println("--5단만 빼고..---");
		// 5단만 빼고 찍기
		for( int row =1 ; row<= 9; row++) {//9행
			for(int col=2 ; col <=9; col++) {//8열
				if(col==5)continue;
				System.out.print(col +"*" + row +"="+(col*row)+"\t");
			
			}
			 System.out.println();
		}
		
		
		//5단까지 찍기 
		System.out.println("--5단까지..---");
		// 5단만 빼고 찍기
		for( int row =1 ; row<= 9; row++) {//9행
			for(int col=2 ; col <=9; col++) {//8열
				if(col==6)break;
				System.out.print(col +"*" + row +"="+(col*row)+"\t");
			
			}
			 System.out.println();
		}
		

	}

}
