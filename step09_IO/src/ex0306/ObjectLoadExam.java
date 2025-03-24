package ex0306;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectLoadExam {
    public ObjectLoadExam() {
    	//파일 복원 
    	try(ObjectInputStream ois =
    			new ObjectInputStream(new FileInputStream("src/ex0306/ObjSave.txt"))){
    		
    		Student st1 = (Student)ois.readObject();
    		Student st2 = (Student)ois.readObject();
    		
    		List<Student> list = (List<Student>)ois.readObject();
    		
    		
    		System.out.println(st1); //st1.toString()
    		System.out.println(st2);
    		System.out.println(list);
    		
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
    
	public static void main(String[] args) {
		new ObjectLoadExam();
	}

}
