package ex0228.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetExam extends HashSet<String>{//중복안된다!!, 순서x
    public SetExam(String [] args) {
    	//추가
    	for(String s: args) {
    		 boolean re = super.add(s);
    		 System.out.println(s+" 결과 = " + re);
    	}
    	
    	System.out.println("저장된 개수 = " + super.size());
    	System.out.println("저장요소 = " + this );
    	
    	/////////////////////////////////////////////////
    	System.out.println("---------------------");
    	//요소를 하나씩 추출
    	Iterator<String> it = super.iterator();
    	while(it.hasNext()) { //요소가 있을동안 반복해라
    		String element = it.next();//요소꺼내기
    		System.out.println(element);
    	}
    	
    	System.out.println("----개선된 for ------");
    	for(String s : this) {
    		System.out.println(s);
    	}
    	
    	System.out.println("---삭제하기 ----");
    	boolean b = super.remove("효리4");
    	System.out.println("b = " + b);
    	
    	System.out.println(this);
    	
    	
    }
	public static void main(String[] args) {
		new SetExam(args);

	}

}
//  실행 java SetExam 값 값 값.....






