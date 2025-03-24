package ex0305.map;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class PropertiesExam {
	Properties pro = new Properties();
	
	public PropertiesExam() {
		//저장 =추가
		pro.setProperty("name", "희정");
		pro.setProperty("age", "20");
		pro.setProperty("addr", "서울시 강남구");
		
		// 조회
		//모든 key의 정보 가져오기
		Set<String> keys = pro.stringPropertyNames();
		for(String key : keys) {
			String value = pro.getProperty(key);
			System.out.println(key+" = " + value);
		}
	    
	}
	///////////////////////////////////////////////
	/**
	 * 외부의 ~.properties 파일로딩하는 방법
	 *  1) IO를 이용하는 방법
	 *  2) ResourceBundle 이용방법
	 * */
	
	//1) IO를 이용하는 방법
	public void test01() {
		pro.clear();// 모두 제거하기 비운다.
		try {
			//외부의 a.properties 로딩하자
			//1. 파일의 위치의 기준 프로젝트가 기준!-경로설정할때 src기준...
		 	//InputStream inputStream = new FileInputStream("src/ex0305/map/a.properties");
		    //pro.load(inputStream);
		    
		 
		    //2. 클래스 위치한 패키지 내에서 파일 로딩할때 - / 생략(상대경로)
		   // InputStream inputStream =
		    // PropertiesExam.class.getResourceAsStream("a.properties");
		   //  pro.load(inputStream);
		
			 //3.클래스 위치한 패키지 내에서 파일 로딩할때 - / 생략(상대경로)
			// InputStream inpupStream = 
			//this.getClass().getResourceAsStream("a.properties"); 
			 //pro.load(inpupStream);
			  
		
			 //4.ClassLoader의 모든 경로에서 파일 읽음. 보통 resources 폴더의 파일 읽을때 사용.
			 InputStream inpupStream = 
			//this.getClass().getClassLoader().getResourceAsStream("b.properties"); 
			this.getClass().getClassLoader().getResourceAsStream("ex0305/map/a.properties"); 
			 pro.load(inpupStream);
			 
			 //5. ClassLoader의 Class내에 파일존재하는 경우
			/*InputStream inpupStream =
		this.getClass().getClassLoader().getResourceAsStream("ex0726/list/b.properties"); // 경로에 '/' 붙지않음. ClassLoader의 모든 경로에서 파일 읽음.
			 pro.load(inpupStream);*/
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("---출력해보자 ----");
		Set<String> keys = pro.stringPropertyNames();
		for(String key : keys) {
			String value = pro.getProperty(key);
			System.out.println(key+" = " + value);
		}
		
	}
	
	//2) ResourceBundle 이용방법
	public void test02() {
		System.out.println("---test2() -----------");
		/**
		 * ResourceBundle은 ~.properties파일을 로딩하는 전용 클래스로
		 * 파일의 확장자를 생략한다.
		 * 기준 경로는 classes 폴더가 기준이된다.
		 * */
		//ResourceBundle rb = ResourceBundle.getBundle("b"); // b.properties 
		ResourceBundle rb = ResourceBundle.getBundle("ex0305/map/a");
		for(String key  : rb.keySet() ) {
			String value = rb.getString(key);
			System.out.println(key +" = " + value);
		}
	}
	
  public static void main(String[] args) {
	 //new PropertiesExam().test01();
	  new PropertiesExam().test02();
  }
}









