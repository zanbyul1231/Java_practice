package ex0305;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class FileCopyExam {
	public FileCopyExam() {
		String readFile = JOptionPane.showInputDialog("읽을 파일명?");
		String saveFile = JOptionPane.showInputDialog("저장 파일명?");
		
		 long start = System.nanoTime();
		 
		try(FileInputStream fis =new FileInputStream(readFile);
				FileOutputStream fos = new FileOutputStream(saveFile)){
			
			while(true) {
				//읽어서 저장하기 
				int i = fis.read();
				if(i==-1)break;
				fos.write(i);
			}
			long end = System.nanoTime();
			
			System.out.println("파일 복사 완료 했습니다.");
			System.out.println(end-start );
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new FileCopyExam();

	}

}
