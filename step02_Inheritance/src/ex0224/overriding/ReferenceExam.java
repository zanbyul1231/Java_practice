package ex0224.overriding;

class ObjectExam{
	private String str;
	public ObjectExam(){   }
	public ObjectExam(String str){ 
		this.str =str;
	}
	
	//재정의 
	@Override
	public String toString() {
		return str +" = " + super.toString();
	}
	
}

////////////////////////////////////////////////////
public class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			
			String s01="장희정"; 
			String s02="Java";
			String s03=new String("월요일");
			
			ObjectExam oe1=new ObjectExam("배고파2222");
			ObjectExam oe2=new ObjectExam("안녕");
			
			System.out.println(c);//a
			
			/*
			 * print(Object obj) or println(Object obj)
			 *  : 인수로 전달된 obj.toString()메소드를 자동을 호출하고
			 *    그 toString()이 리턴하는 문자열을 모니터에 출력!!
			 * 
			 * */
			
			System.out.println(s01.toString());//장희정
			System.out.println(s02);//Java
			System.out.println(s03);//월요일 
			
			System.out.println(oe1);//주소값 --> 졸지말자 -> 배고파
			System.out.println(oe2.toString());//주소값 --> 졸지말자 ->  안녕
			
	}
}










