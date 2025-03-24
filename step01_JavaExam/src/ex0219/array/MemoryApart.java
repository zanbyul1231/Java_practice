package ex0219.array;

class MultiArray{
	//정수형 2차원 배열 8*9  
		int [][] arr = new int [8][9];
		
	    public void array99() {
	    	int rowLen = arr.length;//행의길이
	    	
	    	for(int i=0; i< rowLen ; i++) {
	    		int colsLen = arr[i].length;
	    		for(int j=0; j < colsLen ; j++ ) {//각행의 열의 길만큼 반복
	    			//값변경
	    			arr[i][j] = (i+2)*(j+1);
	    			
	    			System.out.print( arr[i][j]+" ");
	    		}
	    		System.out.println();
	    	}
	    	
	    	//////////////////////////////////////////
	    	//개선된 for를 이용해서 출력해보자 
	    	System.out.println("---개선된 for ---");
	    	for( int [] row  : arr ) {
	    		for(int v: row) {
	    			System.out.print(v +" ");
	    		}
	    		System.out.println();
	    	}
	    	
	    	
	    }//methodend		
	}//class End
	//////////////////////////////////////
	public class MemoryApart{
	   public static void main(String[] args) {
		  new MultiArray().array99();
	  }
		
	}



