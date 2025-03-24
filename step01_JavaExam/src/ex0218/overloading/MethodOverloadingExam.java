package ex0218.overloading;

//MethodOverloadingExam.java
class OverloadedMethod{
	private int i; // 맴버필드 0
       
	public void  setOverload(int i){
		this.i = i;//인수로 전달된 지역변수의 값을 전역변수에 저장(할당)
		System.out.println("setOverload(int i) call....");
	}
	
	public int getOverload(){
		return i; //this.i 해도 된다.
	}
	
	//setOverload를 Overloading하세요. 리턴도 하세요.
	public void setOverload(String s) {
		System.out.println("setOverload(String s) ..");
	}
	
	protected int setOverload() {
		System.out.println("setOverload()....");
		return 4;
	}
	
	//setOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	
	//setOverload를 또 또Overloading 하세요. 리턴 안해요



	//getOverload를 Overloading하세요. 리턴도 하세요.
	
	//getOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	
	//getOverload를 또 또Overloading 하세요. 리턴 안해요
		
	
}
/////////////////////////////////////////////////
class  MethodOverloadingExam{
       
  public static void main(String [] agr){
     //OverloadedMethod객체에서 호출가능한  메소드들을 한번씩 호출하세요.
	  OverloadedMethod om = new OverloadedMethod();
	  //he method setOverload(int) in the type OverloadedMethod is not applicable for the arguments (double)
	  //om.setOverload(4.2);
        
	}   


}






