package ex0227.ex04;

import ex0227.ex03.Home;

public class Exam04 {

	public static void main(String[] args) {
		
		Exam04 e = new Exam04();
		Box<String> b1 = e.test01("안녕");
		
		Box<Integer> b2 = e.test01(10);
		
		Box<Home> b3 = e.test01(new Home());
		

	}
	
	//제네릭 메소드
	public <T> Box<T> test01(T t){
		 Box<T> box = new Box<>();
		 box.setContent(t);
		 
		return box;
	}

}


