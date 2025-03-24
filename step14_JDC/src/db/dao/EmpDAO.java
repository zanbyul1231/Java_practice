package db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.util.DBManager;

public class EmpDAO {

	public void getEmpInfo() {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs =null;
		
		String sql = "select empno, ename, hiredate from emp";
		
		try {
			con = DBManager.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString(2);
				String hiredate = rs.getString("hiredate");
				
				System.out.println(empno + " | " + ename + " | " + hiredate);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.dbClose(con, st, rs);
		}
	}
	
	public void deleteByEmpno(int empno) {
		
		Connection con = null;
		Statement st = null;
		
		String sql = "delete from emp where empno = " + empno;
		
		try{
			con = DBManager.getConnection();
			st = con.createStatement();
			int result = st.executeUpdate(sql);
			if(result == 0) {
				System.out.println("삭제되지 않았습니다.");
			}else {
				System.out.println("삭제되었습니다.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.dbClose(con, st);
		}
		
	}
	
	

}
