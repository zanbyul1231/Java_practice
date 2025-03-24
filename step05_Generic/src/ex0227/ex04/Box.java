package ex0227.ex04;

import ex0227.ex03.Car;

public class Box<T> {
   private T content;

	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}
	///////////////////////////////////////
	
	//일반메소드
	public <A, F> A test01(A t, F f){
		
		return t;
		
	}
	
	//일반메소드
	public <A, F > T test02(A t, F f){
		
		return content;
		
	}
	
	// return "안녕" 하면 컴파일 에러가 발생하는데, 
	//그 이유는 제네릭 타입 <T>는 호출 시점에서 결정되기 때문이다
	public <F> F test05(F f){
		
		//test02("dd",4);
		//test02(new Car() , "dd");
		
		//return "안녕";
		
		return f;
		
	}
	
	//Integer i =~.test02();
	
	
   
   
   
}










