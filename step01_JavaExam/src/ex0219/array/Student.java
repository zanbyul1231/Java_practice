package ex0219.array;


/**
 * 학생이 가질수 있는 속성(정보) 관리하는 객체
 *  : DTO(Data Transfer Object ) , VO(Value Object) 
 * */
public class Student {
    private String name; //이름
    private int age;//나이
    private String addr ;//주소 
    
    // 속성을 사용할수 있도록 setXxx, getXxx 제공!!
    /** 
     *  setXxx () 
     *   : 제한자 : public 
     *   : 리턴타입 : void 
     *   : 메소드이름 : setXxx()  --> ex) setName()
     *   : 인수 : 필수 
     * */
    public void setName(String name) {
    	//기능
    	this.name = name;
    }
    
    public void setAge(int age) {
    	if(age < 18) 
    		System.out.println("나이를 변경할수 없다");
    	else
    	 this.age = age;
    }
    
    public void setAdd(String addr) {
    	this.addr= addr;
    }
    
    /**
     * 조회 - getXxx
         : 제한자 : public 
     *   : 리턴타입 : 필수 
     *   : 메소드이름 : getXxx()  --> ex) getName()
     *   : 인수 : 없음 
     * */
    public String getName() {
    	return name+"님";
    }
    
    public int getAge() {
    	return age;
    }
    
    public String getAddr() {
		return addr;
	}
    
}












