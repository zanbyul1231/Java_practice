package ex0228.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListExam02 {
	List<Integer> list = new ArrayList<Integer>(5);

    public ListExam02() {
    	
    	//추가
    	list.add(10); //autoBoxing
    	list.add(5);
    	list.add(20);
    	list.add(7);
    	list.add(21);
    	list.add(45);
    	list.add(30);
    	
    	//list에 저장된 요소의 개수
    	int size = list.size();
    	System.out.println("저장되 요소의 개수 = " + size);
    	
    	//출력 	
    	for(int i=0; i< size ; i++) {
        	int v = list.get(i);//unboxing
        	System.out.println("v = "+ v);
    	}
    	
    	//요소 제거
    	int re = list.remove(2);// 3번째 요소를 제거해라
    	System.out.println("re = " + re);
    	
    	///개선된 for//////////////////////////
    	System.out.println("---개선된 for----");
    	for( int a : list ) {
    		System.out.println("a = "+a);
    	}
    	
    	System.out.println("list = "+ list);//this.toString()
    	System.out.println("list = "+ list.toString());//this.toString()
    	
    }
    
    
	public static void main(String[] args) {
		new ListExam02();

	}

}







