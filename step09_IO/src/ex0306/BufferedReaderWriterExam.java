package ex0306;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterExam {
	
	public BufferedReaderWriterExam() {
	  //문자단위로 파일 읽기 --> 보조스트림인 성능을 위한 Buffered 추가
		
		try(BufferedReader br = 
				new BufferedReader(new FileReader("src/ex0306/read.txt"));
			BufferedWriter bw = 
				new BufferedWriter(new FileWriter("src/ex0306/write.txt", true))){
			
			/*while(true) {
				int i = br.read();//한 문자씩 읽기
				if(i==-1)break;
				System.out.println("i = " + i +" , " + (char)i );
			}*/
			
			//한줄 읽기
			while(true) {
				String line = br.readLine();
				if(line ==null)break;
				System.out.println(line);
			}
			
			System.out.println("---문자단위 파일에 저장-------");
			bw.write(65);//A
			bw.write("곧 쉬어요~");
			bw.newLine();// 13, 10  대신 개행
			bw.write("참 쉬어요~~");
			bw.flush();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
        new BufferedReaderWriterExam();		

	}

}
