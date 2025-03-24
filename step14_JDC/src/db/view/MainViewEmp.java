package db.view;

import db.dao.EmpDAO;
import db.dto.Emp;

public class MainViewEmp {
	
	public static void main(String[] args) {
		System.out.println("---JDBC 시작---");
		
		EmpDAO dao = new EmpDAO();
		dao.getEmpInfo();
		
		System.out.println("삭제하기");
		dao.deleteByEmpno(-1);
		
		System.out.println("등록하기");
//		dao.insert(new Emp(9001, "최지원", "오너", 50000, null));

		System.out.println("수정하기");
		dao.update(new Emp("김이박최", "master", 30000, 9001));
		
	}
	
}
