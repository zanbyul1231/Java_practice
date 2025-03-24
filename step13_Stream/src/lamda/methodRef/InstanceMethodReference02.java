package lamda.methodRef;

import java.util.function.Function;

class StringUtils { 
    public int getLength(String str) { //생성해서 접근하는 메소드
        return str.length(); 
    } 
} 
 ////////////////////////////
public class InstanceMethodReference02 { 
    public static void main(String[] args) { 
        StringUtils utils = new StringUtils(); 
         
        //기존방식
        Function<String, Integer> beforeLength = new Function<String, Integer>() {
			@Override
			public Integer apply(String str) {
				return utils.getLength(str);
			}
		};
		
		//람다식
		 Function<String, Integer> lambdaLength = (str)->  utils.getLength(str);
		
		//인스턴스 메소드 참조
		 Function<String, Integer> methodRefLength = utils :: getLength;
      
 
       System.out.println(beforeLength.apply("Hello")); // 5 
        System.out.println(lambdaLength.apply("Hello")); // 5 
        System.out.println(methodRefLength.apply("Hello")); // 5 
    } 
} 





