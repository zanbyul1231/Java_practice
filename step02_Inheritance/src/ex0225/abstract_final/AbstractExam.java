package ex0225.abstract_final;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * 모든 동물들의 공통의 속성과 메소드를 정의
 * */
abstract class Animal{
	int legs; //다리수 
	
	public abstract void sound();
	
	public abstract void run() ;
	
	public void eat() {
		System.out.println("잘 먹는다!!!");
	}
}
////////////////////////////////////////////
/*abstract*/ class Dog  extends Animal{
	public  void sound() {
		System.out.println("멍멍");
	}
	
	public  void run() {
		System.out.println("잘 뛴다.");
	}
	
}

///////////////////////////////////////////////
class Pig  extends Animal{
	
	@Override
	public void sound() {
		System.out.println("꿀꿀");
		
	}
	@Override
	public void run() {
		System.out.println("잘 못 뛴다~~");
	}
}
/////////////////////////////////////////////////
class Cat  extends Animal{
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}

	@Override
	public void run() {
		System.out.println("잘 뛰고 잘 올라간다.");
		
	}
	
	 @Override
	public void eat() {
		System.out.println("쥐를 좋아해~~");
	}

	
}

/////////////////////////////////////////////////////////
public class AbstractExam {
   
	/**
	 * 각 동물들이 가지고 있는 메소드를 모두 호출해보고 싶다.
	 * */
	//매개변수를 이용한 다형성
	public static void test2(Animal animal) { //Cat or Pig or Dog ......
		animal.eat();
		animal.sound();
		animal.run();
		
		System.out.println("-------------------------");
	}
	
	/*public static void test() {
		//Cat  , Pig, Dog
		Cat cat = new Cat();
		cat.eat();
		cat.sound();
		cat.run();
		
		Pig p = new Pig();
		p.eat();
		p.sound();
		p.run();
		
		
		Dog d = new Dog();
		d.eat();
		d.sound();
		d.run();
	}*/
	
	public static void main(String[] args) {
		 //test();
		Animal animal = null;//필드를 이용한 다형성
		
		animal = new Cat();
		test2(animal);
		
		animal = new Pig();
		test2(animal);
		
		animal = new Dog();
		test2(animal);
		
		

	}

}
















