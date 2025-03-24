package ex0305;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class BufferedFileCopyExam {
	public BufferedFileCopyExam() {
		String readFile = JOptionPane.showInputDialog("읽을 파일명?");
		String saveFile = JOptionPane.showInputDialog("저장 파일명?");
		
		 long start = System.nanoTime();
		 
		try(BufferedInputStream bis =
				new BufferedInputStream(new FileInputStream(readFile));
			BufferedOutputStream bos = 
					new BufferedOutputStream(new FileOutputStream(saveFile))){
			
			while(true) {
				//읽어서 저장하기 
				int i = bis.read();
				if(i==-1)break;
				bos.write(i);
			}
			long end = System.nanoTime();
			
			System.out.println("파일 복사 완료 했습니다.");
			System.out.println(end-start );
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new BufferedFileCopyExam();

	}

}
