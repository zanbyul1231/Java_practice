package ex0221.enumex.constructor;

public enum RequestResult {
   /**
    * 배열의 경계를 벗어낫을때 
    * */
	INSERT_OUTINDEX,
	
	/**
	 * 상품코드가 중복일때
	 * */
	INSERT_DUPLICATE,
	
	/**
	 * 등록이 성공했을대 
	 * */
	INSERT_SUCCESS
}
