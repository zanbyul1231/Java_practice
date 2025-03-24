package ex0219.array;

class ObjectOne{ //ObjectOne 는 자료형
	public int a;
}
/////////////////////////////
public class ObjectInArray{
	//메인 메소드에서 
	 public static void main(String[] args) {
		
		//ObjectOne 타입을 5개 까지 저장하는 배열을 선언하고
		 ObjectOne [] arr = new ObjectOne [5];
		 System.out.println(arr);
		 
		 for(int i=0; i< arr.length ; i++) {
			  System.out.print( "생성전 : " + arr[i] +"\t" );
			  
			  //생성
			  arr [i] = new ObjectOne();
			  System.out.print( "생성후 : " + arr[i] +"\t" );
		      
			  System.out.println("arr["+i+"].a = "+arr[i].a);
		 
		 }
		 System.out.println("-------------------------");
		 for(int i=0; i < arr.length ; i++) {
			 arr[i].a = i*10;
			 System.out.println("arr["+i+"].a = "+arr[i].a);
		 }
		 
		 /* for(ObjectOne obj : arr) {
			 System.out.println(obj);
			 
			 obj.a = 10;
		 }*/
		 
		 System.out.println("--개선된 for--");
//		 for(ObjectOne  obj : arr ) {
//			 System.out.println(obj);
//			 obj = new ObjectOne();
//		 }
		
		//5개의 ObjectOne객체를 생성하세요.
		//각 객체가 갖고있는 전역변수 출력
		//각 객체의 주소값 출력
			
		//각각의 ObjectOne객체가 서로 다른 a의 값을 갖도록 a의 값을 변경하세요.			
		//각 ObjectOne 객체의 a를 출력하세요
			
	 }
	
}
