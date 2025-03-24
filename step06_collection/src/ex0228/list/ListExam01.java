package ex0228.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

//public class ListExam01 extends ArrayList<Integer>{
public class ListExam01 extends Vector<Integer>{
    public ListExam01() {
    	super(5);//
    	
    	//추가
    	super.add(10); //autoBoxing
    	this.add(5);
    	add(20);
    	add(7);
    	add(21);
    	add(45);
    	add(30);
    	
    	//list에 저장된 요소의 개수
    	int size = super.size();
    	System.out.println("저장되 요소의 개수 = " + size);
    	
    	//출력 	
    	for(int i=0; i< size ; i++) {
        	int v = super.get(i);//unboxing
        	System.out.println("v = "+ v);
    	}
    	
    	//요소 제거
    	int re = this.remove(2);// 3번째 요소를 제거해라
    	System.out.println("re = " + re);
    	
    	///개선된 for//////////////////////////
    	System.out.println("---개선된 for----");
    	for( int a : this ) {
    		System.out.println("a = "+a);
    	}
    	
    	System.out.println("this = "+ this);//this.toString()
    	System.out.println("this = "+ this.toString());//this.toString()
    	
        //요소를 정렬하기
    	//Collections.sort(this);
    	Collections.sort(this, Collections.reverseOrder());
    
    	System.out.println("---개선된 for(정렬 후)----");
    	for( int a : this ) {
    		System.out.println("a = "+a);
    	}
    
    }
    
    
	public static void main(String[] args) {
		new ListExam01();

	}

}







