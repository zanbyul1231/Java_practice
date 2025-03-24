package ex0227.ex03;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		
		return new Home();
	}

}
