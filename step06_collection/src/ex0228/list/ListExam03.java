package ex0228.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListExam03 {
	private List<Emp> list = new ArrayList<Emp>();
	
	/**
	 * 생성자를 이용해서 사원 5명 정도 데이터 추가
	 * */
	public ListExam03() {
		list.add(new Emp(10, "장희정",22, "서울"));
		list.add(new Emp(50, "이나영",35, "대구"));
		list.add(new Emp(30, "이효리",25, "부산"));
		list.add(new Emp(40, "삼순이",20, "서울"));
		list.add(new Emp(20, "삼식이",28, "부산"));
		
		//System.out.println(list);
	}
	
	/**
	 * 저장된 모든 사원정보 리턴
	 * */
	public List<Emp> selectAll(){
		
		
		
		return list;
	}
	
	
	/**
	 * 사원번호에 해당하는 사원정보 리턴
	 * */
	public Emp selectByEmpno(int empno) {
		/*for(int i=0; i< list.size(); i++) {
			Emp emp = list.get(i);
			if(emp.getEmpno() == empno)return emp;
		}*/
		
		for(Emp emp : list) {
			if(emp.getEmpno() == empno)return emp;
		}
		
		
		return null;
	}
	
	
	 /**
	  * 주소를 인수로 전달받아 동일한 주소의
	  * 사원들 검색
	  * 
	  * @return : List<Emp> --> null?
	  * */
	 public List<Emp> selectByAddr(String addr){
		 List<Emp> foundList = new ArrayList<Emp>();
		 for(Emp emp : list) {
			 if(emp.getAddr().equals(addr)) {
				 //같다.
				 foundList.add(emp);
			 }
		 }
		 return foundList;
	 }
	
	
	/**
	 * 사원번호를 기준으로 정렬 - Comparable
	 * */
	 public List<Emp> sortByEmpno(){
		 /**
		  * Sorts the specified list into ascending order,
		  *  according to the natural ordering of its elements.
		  *  All elements in the list must implement the Comparable interface. 
		  *  Furthermore, all elements in the list must be mutually comparable 
		  *  (that is, e1.compareTo(e2)must not throw 
		  *  a ClassCastException for any elements e1 and e2 in the list). 
		  * */
		 
		 List<Emp> shallowCopy = new ArrayList<Emp>(list);
		 System.out.println("------------");
 		Collections.sort(shallowCopy);
 		System.out.println("------------");
		 
		 return shallowCopy;
	 }
	 
	
	 
	 
	/**
	  * 나이를 기준으로 정렬하기 -Comparator
	  *  
	  * */
	 public List<Emp> sortByAge(){
		 List<Emp> shallowCopy = new ArrayList<Emp>(list);
		 
		 //1.외부에 구현객체를 정의
		// Collections.sort(shallowCopy, new SortTest());
		 
		 
		 //2.익명이너클래스
		/* Collections.sort(shallowCopy, new Comparator<Emp>() {
			 @Override
			public int compare(Emp o1, Emp o2) {
				return o1.getAge() - o2.getAge();
			}
		});*/
		 
		 //3. 람다식
		 Collections.sort(shallowCopy,  (a,b)-> a.getAge() - b.getAge()  );
		 
		 return shallowCopy;
	 }
	 
	 

	public static void main(String[] args) {
		ListExam03 e = new ListExam03();
		System.out.println("1. 사원번호 검색 ");
		Emp emp = e.selectByEmpno(90);
		System.out.println("emp = " + emp);
		
		System.out.println("2. 주소로 검색 ");
		List<Emp> foundList = e.selectByAddr("서울2");
		System.out.println("개수  =  "+ foundList.size() );
		if(foundList.isEmpty()) {
			System.out.println("찾는 주소가 없습니다.");
		}else {
			System.out.println(foundList);
		}
		
		/////////////////////////////////
		System.out.println("3. 사원번호를 기준으로 정렬... ");
		List<Emp> list = e.sortByEmpno();
		for(Emp ex : list) {
			System.out.println(ex);
		}
		
		System.out.println("-4. 나이로 졍렬하기 ------------------");
		list = e.sortByAge();
		for(Emp ex : list) {
			System.out.println(ex);
		}

	}

}

/////////////////////////////////////////////////

 class SortTest implements Comparator<Emp>{
	@Override
	public int compare(Emp o1, Emp o2) {
		//return o1.getAge() - o2.getAge();
		return  o2.getAge()- o1.getAge();
	}
	 
 }


























