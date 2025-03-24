package ex0227.ex01;

/**
 * <T>는 제네릭타입으로 아직 결정되지 않은 타입을 선언하고
 * 실제로 사용할때 구체적인 타입으로 변환 
 * */
public class Box<T> {
   //필드
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}	
	
}
