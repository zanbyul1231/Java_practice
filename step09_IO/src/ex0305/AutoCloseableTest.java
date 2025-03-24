package ex0305;


class Test implements AutoCloseable{
	@Override
	public void close() throws Exception {
		System.out.println("close() call.......");
		
	}
}
////////////////////////////////////////////

public class AutoCloseableTest {
	public static void main(String[] args) throws Exception {
		
		try(Test t = new Test()){
		// try {
			//Test t = new Test();
			System.out.println("안녕~~~");
		
		 }
		System.out.println("--End----");

	}

}
