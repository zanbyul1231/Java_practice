package ex0218.array;

class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)
	//int []  arr; //
	//int [] arr = new int [10];//자동초기화
	//int [] arr = new int [] {1,2,3,4,5,6,7,8,9,10};
	int [] arr =  {1,2,3,5,6,7,87};
	
   /*printArrayvalue 메소드작성
       => 메소드 안에서 위에 선언된 배열방의 값을 출력한다. 
	*/	
	public void printArrayvalue() {
		System.out.println("arr = "+ arr);
		System.out.println("arr.length = " + arr.length);
		
		int len = arr.length;
		for(int i=0; i< len ; i++) {
			System.out.println("arr["+i+"]="+ arr[i] );
		}
	}
}
/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
		ArrayValue av = new ArrayValue();
		av.printArrayvalue();
		
		System.out.println("***프로그램 종료합니다***");

	}
}