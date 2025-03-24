package ex0227.shop;

public class ShoppingMall {

	public void enter(int age) throws NoKidsException {
		if(age <= 18) {
			//예외발생
			throw new NoKidsException(age+"살 - 애들은 가라~");
		}
		
		
		System.out.println(age +" =  입장하신걸 환영합니다.!!!");
		
	}
}
