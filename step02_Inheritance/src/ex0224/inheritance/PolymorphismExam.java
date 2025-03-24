package ex0224.inheritance;
class CarCenter{
	
	//부모 > 자식
	public void engineer(Car cd){ //Car cd = ef; //매개변수를 이용한 다형성 
		System.out.println("cd = " + cd);
		
		 //부모타입 변수로는 자식부분 접근 불가!!!
	    //System.out.println("cd.a = " + cd.a );
		
		/*전달된 참조변수에 자식부분이 있기 때문에 접근이 가능하도록 
		 * ObjectDownCasting이 필요하다.
		 */
	     if(cd instanceof EfSonata) {
	    		EfSonata ef2 = (EfSonata)cd;
	    		System.out.println("ef2 = "+ ef2);
	    		System.out.println("ef2.a = " + ef2.a );
	     }
		
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
	}
	/*public void engineer(EfSonata cd){ //Car cd = ex; //매개변수를 이용한 다형성 
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
	}
	public void engineer(Carnival cd){ //Car cd = ex; //매개변수를 이용한 다형성 
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
	}
	public void engineer(Excel cd){ //Car cd = ex; //매개변수를 이용한 다형성 
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		
	}*/
	
}
///////////////////////////////////////////////
public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		
		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		
		Car c= new Car();
		////////////////////////////////////////////
		cc.engineer(c);//
		
		System.out.println("ef = "+ ef);
		System.out.println("ef.a = " + ef.a);
	    System.out.println("--------------------");
		
		cc.engineer(ef);//
		
		
		cc.engineer(ca);//
		cc.engineer(ex);//
		
		
	
	}
}
