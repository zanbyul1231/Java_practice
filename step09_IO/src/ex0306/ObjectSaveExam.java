package ex0306;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectSaveExam {
	
	public ObjectSaveExam() {
	  //객체를 파일에 저장 -  ObjectOutputStream 사용한다.
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/ex0306/ObjSave.txt")) ){
			
			Student st1 = new Student("나영", 20, "서울");
			Student st2 = new Student("효리", 25, "대구");
			
			List<Student> list = List.of(
					new Student("선희", 25, "제주도"),
					new Student("미미", 22, "대구"),
					new Student("호호", 23, "대전"));
			
			
			//저장
			oos.writeObject(st1);
			oos.writeObject(st2);
			
			oos.writeObject(list);
			
			
			System.out.println("저장 완료~~~");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
   public static void main(String[] args) {
	  new ObjectSaveExam();
   }
}
