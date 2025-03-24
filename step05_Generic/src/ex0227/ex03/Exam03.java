package ex0227.ex03;

public class Exam03 {

	public static void main(String[] args) {
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
		
		System.out.println("-------------");
		HomeAgency homeAgency = new HomeAgency();
		Home home =homeAgency.rent();
		home.room();
		
		
		

	}

}
