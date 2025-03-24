package ex0227.ex05;

public class Course {
  /**
   * 모든 사람을 허용(등록)
   * */
	 public void register1(Applicant<?> applicant) {
		 //System.out.println(applicant.getKind());
		 
		 System.out.println(applicant.getKind().getClass().getSimpleName()+"가 신청하셨습니다. register1");
	 }
	 
	/**
	 * 직장인만 허용(등록)
	 * */
	public void register2(Applicant<? super Worker> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName()+"가 신청하셨습니다. register2");	 
	}
	
	/**
	 * 학생만 허용 (등록)
	 * */
	public void register3(Applicant<? extends Student> applicant) {
		System.out.println(applicant.getKind().getClass().getSimpleName()+"가 신청하셨습니다. register3");	  
	}
}


