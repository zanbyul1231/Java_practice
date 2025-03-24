package ex0214.제어문;

public class ForExam01 {
	public static void main(String[] args) {
		//1. 1~ 100가지 한줄로 출력
				System.out.println("1. 1~ 100가지 한줄로 출력 ======");
				int i;//지역변수 선언- 초기화전에 사용할수 없다. 
				
				for(i=1; i <=100 ; i++) {
				  System.out.print(i + " ");
				}
				
				
				System.out.println("\n" + i);
				
				//2. A ~Z 까지 한줄로 출력
				System.out.println("\n2. A ~Z 까지 한줄로 출력 ======");
			    for(i=0; i <26 ; i++) {
			    	System.out.print((char)('A' +i) +"\t");
			    }
			    
			    
			    System.out.println("\n\n2. A ~Z 까지 한줄로 출력 ======");
			    for(char ch='A'; ch <='Z' ; ch++) {
			    	System.out.print(ch  +" ");
			    }
			    
			    
			    System.out.println("\n\n2. A ~Z 까지 한줄로 출력 ======");
			    for(i=65; i <=90 ; i++) {
			    	System.out.print((char)i  +" ");
			    }
			    
			   
			
				//3. 1~ 10 까지  합 구해서 출력
			    System.out.println("\n\n3. 1~ 10 까지  합 구해서 출력 ======");
			    int sum=0;
			    for(i=1; i <=10 ; i++) {
			    	//누적
			    	sum+=i;  //sum = sum+i;
			    }
			    System.out.println("총합 : "+ sum);
			    
			    
			
				
				//4. 1 ~ 100 사이의 7의 배수만 출력 
			    System.out.println("\n\n4. 1 ~ 100 사이의 7의 배수만 출력  ======");
			    for(i=1; i <=100 ; i++) {
			    	if(i%7==0)
			    		System.out.print(i+" ");
			    }
			    
				
			    System.out.println("\n\n4. 1 ~ 100 사이의 7의 배수만 출력  ======");
			    for(i=0 ; i <=100 ; i+=7) {
			    	System.out.print(i+" ");
			    }
			    
				
				//5. 100 ~ 1 사이의 5 의 배수만 출력 
			    System.out.println("\n\n45. 100 ~ 1 사이의 5 의 배수만 출력  ======");
			    for(i=100 ; i >=1 ; i--) {
			    	if(i%5==0)System.out.print(i+"\t");
			    }
	}

}
