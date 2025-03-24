package ex0306;

import java.io.Serializable;

/**
 * 객체가 파일에 저장하기 위해서 직렬화 필수 
 * : 필드만 직렬화 대상이 된다. 생성자, 메소드는 직렬화 안된다.
 * : static or transient 키워드가 붙어 있으면 직렬화 대상에서 제외
 * */
public class Student implements Serializable{
 
  private static final long serialVersionUID = 1L;
	
  private String name;
  private int age;
  private transient String addr; //직렬화 대상제외
  
  public Student() {}
  public Student(String name, int age, String addr) {
	super();
	this.name = name;
	this.age = age;
	this.addr = addr;
  }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}
    
  
  
}
