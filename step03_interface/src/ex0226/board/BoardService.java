package ex0226.board;

import java.util.List;

/**
 * 모든 게시판유형이 공통으로 사용할 메소드를 정의
 *  : 규격서역할 
 * */
public interface BoardService {
   /**
    * 등록하기
    * @return : int   
    *          0이면 실패, 1이상이면 성공
    *          
    * @param : Board 
    *          Free or QA or Upload          
    * */
	int insert(Board board); 
	
	/**
	 *수정하기
	 * */
	int update(Board board);
	
	
	/**
	 * 글번호로 검색하기 
	 * @param : 글번호
	 * @return : Free or QA or Upload 
	 * */
	Board selectByBno(int bno);
	
	//////////////////////////////////////////////////
	/**
	 * java 1.8 version 이후 추가
	 *  : interface 안에 있는 메소드에 static or default 제한자를 추가하면
	 *    body있는 메소드를 만들수 있다.
	 *    body가 있는 메소드는 구현객체들이 재정의 선택적으로 할수 있다.
	 *    
	 *    1) static
	 *         : 구현객체없이 바로 interface이름.메소드이름() 호출
	 *    
	 *    2) default
	 *         : 반드시 구현 객체가 있어야 호출할수 있다 .
	 * */
	
	/**
	 * 삭제
	 * */
	default boolean delete(int bno) {
		System.out.println("삭제기능입니다....");
		return true;
	}
	
	/**
	 * 전체검색
	 * */
	static List<Board> selectAll(){
		
		return null;
	}
	
}













