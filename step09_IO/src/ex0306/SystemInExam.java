package ex0306;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInExam {

	public static void main(String[] args) throws Exception{
		//키보드입력
		InputStream is = System.in; //byte단위로 읽기
		/*int i = is.read(); //1byte읽기
		System.out.println(i +" = " + (char)i );*/
		
		//byte단위(InputStream) 처리를 -> 문자단위(Reader)  처리 변환 -> Buffered이용
		
		//1. byte단위(InputStream) 처리를 -> 문자단위(Reader)  처리 변환
		InputStreamReader isr = new InputStreamReader(is);
		/*int i = isr.read(); //한 문자 읽기
		System.out.println(i +" = " + (char)i );*/
		
		//2.  Reader를 Buffered 이용
		BufferedReader br = new BufferedReader(isr);
		String data = br.readLine();
		System.out.println("data = " + data);

	}

}







