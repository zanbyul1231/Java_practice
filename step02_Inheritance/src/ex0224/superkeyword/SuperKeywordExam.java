package ex0224.superkeyword;

class Animal{
	int age=5;
	String bodyColor; //null
	
	public void sound() {
	   System.out.println("super sound  call");
	}
	public void eat() {
		System.out.println("super eat call");
	}
}
//////////////////////////////////////////
class Cat extends Animal{ //Cat is a Animal 성립
	int age = 2;
	int weight;//0
	
	@Override // @는 annotation 
	public void sound() {
		System.out.println("야옹~~~~");
	}
	
	public void run() {
		System.out.println("잘 뛴다~~~");
	}
	
	public void test() {
		System.out.println(age);//2
		System.out.println(this.age);//2
		System.out.println(super.age);//5
		System.out.println("=================");
		System.out.println(bodyColor);//
		System.out.println(this.bodyColor);//
		System.out.println(super.bodyColor);//
		System.out.println("=================");
		System.out.println(weight);//
		System.out.println(this.weight);//
		
		//System.out.println(super.weight);//자식에 있는 필드를 super로접근불가
		
		System.out.println("---메소드 호출 -----");
		sound();
		this.sound();
		super.sound();
		
		System.out.println("---------------------");
		eat();
		this.eat();
		super.eat();
		
		System.out.println("-----------------");
		run();
		this.run();
		//super.run();//자식에 있는 메소드를 super로접근불가
	}
}
//////////////////////////////////////////////////
public class SuperKeywordExam {
	public static void main(String[] args) {
		 //new Cat().test();
		
	    Cat cat = new Cat();
	    System.out.println(cat.age);
	    System.out.println(cat.bodyColor);
	    System.out.println(cat.weight);
	    
	    cat.sound();
	    cat.eat();
	    cat.run();
	    
	    
	    System.out.println("-----------------------------");
	    Animal animal = new Cat();//다형성(animal변수로 Animal 영역만 접근가능)
	    System.out.println(animal.age);//5
	    System.out.println(animal.bodyColor);//null
	    //System.out.println(animal.weight);
	    
	    animal.sound();//야옹(부모타입일지라도 재정의된 메소드는 반드시 재정의된 메소드가 호출된다)
	    
	    animal.eat();
	    //animal.run();
	    
	    System.out.println("animal주소 = " + animal);
	    
	    //animal로 접근이 안되는 자식부분을 ObjectDownCasting을 이용해서 접근가능
	   if(animal instanceof Cat) { 
		    Cat c = (Cat)animal; //자식 < 부모
		    System.out.println("c주소 = " + c);
		    
		    System.out.println(c.weight);
		    c.run();
	   }

	}

}












