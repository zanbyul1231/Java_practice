package lamda.methodRef; 
import java.util.function.Function; 
 
class Utils { 
    public static int square(int x) { 
        return x * x; 
    } 
} 
 ///////////////////////////////////////////////////

 
public class MethodReferenceExample01 { 
    public static void main(String[] args) { 
    	//기존방식
    	Function<Integer, Integer> beforeSquare = new Function<Integer, Integer>() {		
			@Override
			public Integer apply(Integer t) {			
				return Utils.square(t);
			}
		};
		
		//람다식
		Function<Integer, Integer> lambdaSquare = (t)-> Utils.square(t);
    	
    	//static 메소드 참조 문법  : 람다식을 더욱 간결
		Function<Integer, Integer> methodRefSquare = Utils :: square;
		
   
        System.out.println(beforeSquare.apply(5)); // 25 
        
        System.out.println(lambdaSquare.apply(5)); // 25 
       System.out.println(methodRefSquare.apply(5)); // 25 
    } 
} 





