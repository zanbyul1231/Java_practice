package db.view;

import db.dao.EmpDAO;

public class MainView {
	
	public static void main(String[] args) {
		System.out.println("---JDBC 시작---");
		
		EmpDAO dao = new EmpDAO();
		dao.getEmpInfo();
		
		dao.deleteByEmpno(7369);
		
	}
	
}
