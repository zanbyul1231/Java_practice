package lamda.constructorRef; 
import java.util.function.Function; 
 
class User { 
    String name; 
    public User(String name) { 
        this.name = name; 
    } 
     
    public void printName() { 
        System.out.println("User 이름: " + name); 
    } 
} 
 //////////////////////////////////////////////////
public class ConstructorReferenceWithParams02 { 
    public static void main(String[] args) { 
    
    	//기존방식
    	Function<String, User> beforeUser = new Function<String, User>() {
			@Override
			public User apply(String name) {
				return new User(name);
			}
		};
		
		//람다식
		Function<String, User> lambdaUser = (name)-> new User(name);
		
		//생성자 참조
		Function<String, User> constructorRefUser = User :: new ;
    	
         
        User user0 = beforeUser.apply("heejung"); 
        User user1 = lambdaUser.apply("Alice"); 
        User user2 = constructorRefUser.apply("Bob"); 
 
        user0.printName(); // User 이름: heejung 
        user1.printName(); // User 이름: Alice 
        user2.printName(); // User 이름: Bob 
    } 
}