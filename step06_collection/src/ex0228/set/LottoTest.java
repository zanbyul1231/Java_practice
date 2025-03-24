package ex0228.set;

import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoTest {
	//Set<Integer> set = new HashSet<Integer>();//중복 x,  정렬 x
	//Set<Integer> set = new TreeSet<Integer>();//중복 x,  정렬 - 오름차순
	Set<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());//중복 x,  정렬 - 내림차순
	Random r = new Random();
	final static int MAX_COUNT=6;
    public LottoTest() {
    	
    	while( set.size() < MAX_COUNT) {
    		int no = r.nextInt(45)+1;
    		//System.out.println("no = " + no);
    	    set.add(no);
    	}
    	
    	System.out.println("====================");
    	System.out.println(set);
    }
    
	public static void main(String[] args) {
		System.out.println("***로또 생성하기 ******");
        new LottoTest();
	}

}
