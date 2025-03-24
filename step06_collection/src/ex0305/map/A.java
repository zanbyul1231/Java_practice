package ex0305.map;

public class A {
	int i=10;
	public void aa() {
		
	}

	class B {
		int i=5;
		public void bb() {
			System.out.println(i);
			System.out.println(this.i);
			
			System.out.println(A.this.i); //Outer클래스이름.this.변수
			
			aa();
		}
	}
}

//////////////////////////////
