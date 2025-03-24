package ex0305.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {
	Map<Integer, String> map = new HashMap<>();
    public MapExam() {
    	//put은 key 없으면 추가, 있으면 value 수정
    	
    	//추가
    	map.put(40, "희정");
    	map.put(10, "나영");
    	
    	/*
    	 * put의 리턴값은 key가 중복이 아니면 null
    	 * key가 중복이면 수정전의 value 가 나온다.
    	 * */
    	String v = map.put(40, "효리");//key중복->  수정
    	System.out.println("v = " + v);
    	
    	map.put(50, "희정");
    	map.put(20,"미미");
    	
    	//출력
    	System.out.println("map = "+ map);//map.toString()
    	System.out.println("map.size() = " + map.size());
    	
    	//////key 와 value를 조회 ////////////////////////////////////
    	//map에 있는 모든 key들의 정보를 조회
    	Set<Integer> keySet = map.keySet();
    	Iterator<Integer> it = keySet.iterator();
    	while(it.hasNext()) { //요소가 있을동안 반복
    		int key = it.next();//요소꺼내기
    		String value = map.get(key);
    		System.out.println(key +" = " + value);
    	}
    	
    	System.out.println("---개선된 for 변경-------------");
    	for( Integer key : map.keySet()) {
    		String value = map.get(key);
    		System.out.println(key +" = " + value);
    	}
    	
    	System.out.println("----Map.Entry<K,V>---------------");
    	Set<Entry<Integer, String>> set = map.entrySet();
    	
    	for(Map.Entry<Integer, String> entry : set) {
    	    int key = entry.getKey();
    	    String s = entry.getValue();
    	    System.out.println(key+" = " + s);
    	}
    }
    
	public static void main(String[] args) {
		new MapExam();

	}

}










