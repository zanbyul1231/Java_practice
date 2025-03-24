package ex0225.abstract_final;
//Error 를 수정하고 이유를 주석으로 처리하세요.

final class FinalClassExam{ //상속불가, 생성가능
 final int i = -999999;  //값변경불가
}

/////////////////////////////////////
abstract class AbstractClassExam{ //상속가능, 생성불가
    abstract String abstractMethodExam(int i,String s);    
    final int finalMethodExam(int i, int j){  //재정의불가
        return i+j;
    }
}

/////////////////////////////////////////////////////
class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
	/*int finalMethodExam(int i, int j){//Cannot override the final method from AbstractClassExam
		return i*j;
	}*/
	
}

class Sample02 /*extends FinalClassExam*/{  }//The type Sample02 cannot subclass the final class FinalClassExam


 
abstract class Sample03 extends AbstractClassExam{//The type Sample03 must be an abstract class to define abstract methods
	 String abstractMethodExam(String s, int i){
		return s+i;
	 }
	 
	abstract String abstractMethodExam(int i,String s);    

	void sampleMethod03(){
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

 
public class AbstractFinalClassTest{
    public static void main(String args[]){
		AbstractClassExam ace /*= new AbstractClassExam()*/; //Cannot instantiate the type AbstractClassExam
		FinalClassExam fce = new FinalClassExam();
		//fce.i=100000;//The final field FinalClassExam.i cannot be assigned
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
