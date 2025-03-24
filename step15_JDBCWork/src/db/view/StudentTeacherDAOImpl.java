package db.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.dao.StudentTeacherDAO;
import db.util.DBManager;
import db.vo.Student;
import db.vo.Teacher;

public class StudentTeacherDAOImpl implements StudentTeacherDAO {

	@Override
	public List<Student> getGenderByWomen() {

		List<Student> ls = new ArrayList<Student>();

		Student st = null;

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "select * from student where  수_주민등록번호 like '%-2%'";

		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			

			while (rs.next()) {
				int stno = rs.getInt("수강생번호");
				String stname = rs.getString(2);
				String stjumin = rs.getString(3);
				String stphone = rs.getString(4);
				String staddr = rs.getString(5);
				String stemail = rs.getString(6);

//				System.out.println(stno + " | " + stname + " | " + stjumin + " | " + stphone + " | " + staddr + " | " + stemail);

				st = new Student(stno, stname, stjumin, stphone, staddr, stemail);

				ls.add(st);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.dbClose(con, ps, rs);
		}

		return ls;
	}

	@Override
	public List<Teacher> getTeacherInfoByAddr(String gu) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from teacher  where 주소 like ?";
		
		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, gu);
			
			rs = ps.executeQuery(sql);
			
			while(rs.next()) {
				int tno = rs.getInt("강사번호");
				String tname = rs.getString(2);
				String tjumin = rs.getString(3);
				String tphone = rs.getString(4);
				String taddr = rs.getString(5);
				String temail = rs.getString(6);
				String tcode = rs.getString(7);
				
				System.out.println(tno + " | " + tname + " | " + tjumin + " | " + tphone + " | " + taddr + " | " + temail + " | " + tcode);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.dbClose(con, ps, rs);
		}

		return null;
	}

	@Override
	public Teacher getTeacherInfoBySubject(String subject) {
		List<Teacher> lt = new ArrayList<Teacher>();

		Teacher t = null;

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "select * from teacher  where 주소 like ?";

		try {
			con = DBManager.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				int tno = rs.getInt("강사번호");
				String tname = rs.getString(2);
				String tjumin = rs.getString(3);
				String tphone = rs.getString(4);
				String taddr = rs.getString(5);
				String temail = rs.getString(6);
				String tcode = rs.getString(7);

//				System.out.println(tno + " | " + tname + " | " + tjumin + " | " + tphone + " | " + taddr + " | " + temail + " | " + tcode);

				

				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.dbClose(con, ps);
		}

		return null;
	}

	@Override
	public Teacher getTeacherInfoByNo(int teacherNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
