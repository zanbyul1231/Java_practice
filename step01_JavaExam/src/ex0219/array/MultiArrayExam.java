package ex0219.array;

public class MultiArrayExam {
    
	// 2차원 배열 선언
	//int  [][] arr ; //객체이다.  초기값 null
	//int  [][] arr = new int [3][4];
	
	//int [] [] arr = new int [][]{};
	/*int [] [] arr = {
			{1,2,3,4 },
			{2,4,6,8,10} ,
			{3,6}
	};*/
	
	int [][] arr = new int [3][];//행은 필수, 열은 생략
	
	public void test() {
		
		//각 행의 열의 개수를 생성
		arr[0] = new int [2];
		arr[1] = new int [] {2,6,8,9};
		arr[2] = new int [1];
		
		System.out.println("arr = " + arr);
		System.out.println("arr = " + arr[0]);//null --> 주소
		System.out.println("arr = " + arr[0][0]);//NullPointerException -> 셀의 값
		
		System.out.println("arr.length = "+arr.length);//행의 길이
		System.out.println("arr[0].length = " + arr[0].length);// 0행의 열의 길이
		
		System.out.println("*****************************");
	   // 공간의 값을 출력 
		int rowLen = arr.length;
		
		for(int i=0; i < rowLen ; i++) {
			 int colLen = arr[i].length;
			 for(int j=0; j < colLen ; j++) {
				 System.out.print(arr[i][j]+"\t");
			 }
			 System.out.println();
		}
	
	
	}
	
	
	public static void main(String[] args) {
		//MultiArrayExam m = new MultiArrayExam();
		//m.test();
		
		new MultiArrayExam().test();

	}

}
