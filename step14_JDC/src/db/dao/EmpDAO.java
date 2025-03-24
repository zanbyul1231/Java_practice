package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.dto.Emp;
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
				System.out.println(result + "삭제되었습니다.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.dbClose(con, st);
		}
		
	}
	
	public void insert(Emp emp) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "insert into emp(empno, ename, job, sal, hiredate) values (?, ?, ?, ?, now())";
		
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getJob());
			ps.setString(4, emp.getHiredate());
			
			int result = ps.executeUpdate();
			
			if(result == 0) {
				System.out.println("삽입되지 않았습니다.");
			}else {
				System.out.println("삽입되었습니다.");
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			DBManager.dbClose(con, ps);
		}
		
	}
	
	public void update(Emp emp) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "update emp set ename = ?, job = ?, sal = ? where empno = ?";
		
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, emp.getEname());
			ps.setString(2, emp.getJob());
			ps.setInt(3, emp.getSal());
			ps.setInt(4, emp.getEmpno());
			
			int result = ps.executeUpdate();
			
			
			System.out.println("수정되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.dbClose(con, ps);
		}
	}
	

}
