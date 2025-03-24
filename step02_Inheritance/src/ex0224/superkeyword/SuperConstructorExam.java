package ex0224.superkeyword;

class Parent{
	/*Parent(){
		System.out.println(1);
	}*/
	
	Parent(int i){
		System.out.println(2);
	}
	Parent(String s){
		System.out.println(3);
	}
}
/////////////////////////////////////////////
class Child extends Parent{ //Child is a Parent 성립
	Child(){
	   this(3);
	   System.out.println(4);
	}
	Child(int i){
		super(i);
		System.out.println(5);
	}
	Child(boolean b){
		super("안녕");
		System.out.println(6);
	}
}


public class SuperConstructorExam {
	public static void main(String[] args) {
		 //new Child();//1 4
		//new Child(6); // 1 5
		//new Child(false); //1 6
		//정리 : 자식생성자 구현부 첫번째 줄에 super() 생략되어있다.
		//       자식이 인수가 있는 생성자를 호출해도 무조건 부모의 기본생성자를 호출한다.
		
		//////////////////////////////////////////////
		//만약, 1 , 2 ,3 없다면
		 //new Child();// 4
		//new Child(6); //  5
		//new Child(false); // 6
		//정리 : 부모에 생성자를 하나도 작성하지 않으면 자동으로 기본생성자 만들어진다.
		//////////////////////////////////////////////////////
		//만약, 1은 없고, 2,3은 있는경우 -  부모의 기본생성자 없이 생성자 추가 
		//정리 : 반드시 자식생성자 구현부 첫번째 줄에서 다른 생성자를 직접 호출해야한다.
		
	    new Child();
		 

	}
	
	
	
	
	
	
	
	
	

}
