package ex0214.제어문;

public class BreakContinueExam {

	public static void main(String[] args) {
		for(int i=1; i<=5 ; i++) { // i= 1 , 2 , 3 4 5
			for(int j=1; j<=5 ; j++) { //j= 1 , 2 ,3, 4, 5
				//if(j==3)break ;//아래문장 실행안하고 자기를 감싼for빠져나간다.
				//if(j==3)continue ;//아래문장 실행안하고  그다음 일을 하러 간다.
				
				//if(i==3)break ;
				if(i==3)continue;
			    System.out.print( j + " ");	
			}
			System.out.println();
			
		}
		System.out.println("---End----");

	}

}
