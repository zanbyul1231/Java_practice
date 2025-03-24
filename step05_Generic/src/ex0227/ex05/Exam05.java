package ex0227.ex05;

public class Exam05 {

	public static void main(String[] args) {
		Course course = new Course();
		
		course.register1(new Applicant<Person>(new Person()));
		course.register1(new Applicant<Worker>(new Worker()));
		course.register1(new Applicant<Student>(new Student()));
		course.register1(new Applicant<HightStudent>(new HightStudent()));
		course.register1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		
		/////////////////////////////////////
		System.out.println("---<? super Worer> 인경우 -----------");
		course.register2(new Applicant<Person>(new Person()));
		course.register2(new Applicant<Worker>(new Worker()));
		
		//course.register2(new Applicant<Student>(new Student()));
		//course.register2(new Applicant<HightStudent>(new HightStudent()));
		//course.register2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println("---<? extends STudent> 인 경우 ----------");
		//course.register3(new Applicant<Person>(new Person()));
		//course.register3(new Applicant<Worker>(new Worker()));
		
		course.register3(new Applicant<Student>(new Student()));
		course.register3(new Applicant<HightStudent>(new HightStudent()));
		course.register3(new Applicant<MiddleStudent>(new MiddleStudent()));
		

	}

}






