package ex0305;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputOutExam {
    public FileInputOutExam() {
    	FileInputStream fis=null;
    	FileOutputStream fos =null;
    	try {
	    	//byte단위로 파일 읽기 - InputStream --> FileInputStream
	    	fis = new FileInputStream("src/ex0305/test.txt");
    		//fis = new FileInputStream("src/ex0305/FileExam.java");
	    	
	    	int i=0;
	    	while(( i = fis.read())!= -1) {
		    	//1byte씩 읽기
		    	System.out.println("i = " + i +", " + (char)i);
	    	}
	    	
	    	///////////////////////////////////////////
	    	/*int length = fis.available();//읽어들일수있는 byte수를 리턴
	    	System.out.println("length = " + length);
	    	
	    	byte b [] = new byte [length];
	    	int i = fis.read(b); //i는 읽어들인  byte 수 리턴 
	    	System.out.println("i = " + i);
	    	
	    	//byte []을 String으로 변환
	    	String data = new String(b);//
	    	System.out.println("data = " + data);*/
	    	
	    	////byte단위 파일저장//////////////////////////////////
	    	//fos = new FileOutputStream("src/ex0305/write.txt");
	    	fos = new FileOutputStream("src/ex0305/write.txt", true);//이어쓰기
	    	fos.write(65);
	    	fos.write(97);
	    	
	    	fos.write(32);
	    	
	    	fos.write(100);
	    	
	    	fos.write(13);
	    	fos.write(10);
	    	
	    	fos.write(70);
	    	
	    	 String message="이제 쉬어요~~";
	    	 
	    	 fos.write(message.getBytes());//String -> byte 배열로 변환 
	    	
	    	fos.flush();//
	    	
    	}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			  if(fis != null)fis.close();
			  if(fos != null) fos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
    	
    }
	public static void main(String[] args) {
		new FileInputOutExam();

	}

}
