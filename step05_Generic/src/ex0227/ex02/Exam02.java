package ex0227.ex02;

public class Exam02 {

	public static void main(String[] args) {
		//상품 생성
		Product<Tv, String> p1 = new Product<>();
		p1.setKind(new Tv());
		p1.setModel("model1");
		
		Tv tv = p1.getKind();
		String model = p1.getModel();
		
		//////////////////////////////////////////
		
		Product<Audio, Integer> p2 = new Product<>();
		p2.setKind(new Audio());
		p2.setModel(100);
		

	}

}
