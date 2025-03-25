package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.util.DBManager;

public class TransactionDAO {
	/**
	 * 계좌이체 기능 구현
	 */
	public void transfer(String inputAccount, String outputAccount, int money) {

		Connection con = null;

		try {
			con = DBManager.getConnection();
			con.setAutoCommit(false);

			int result = this.withdraw(con, outputAccount, money);
			if (result == 0)
				throw new SQLException("출금계좌번호 오류로 이체 실패");

			result = this.deposit(con, inputAccount, money);
			if (result == 0)
				throw new SQLException("입금계좌번호 오류로 이체 실패");

			if (this.balanceCheck(con, inputAccount))
				throw new SQLException("계좌 잔액 초과로 이체 실패");

			con.commit();
			System.out.println("계좌 이체 성공");

		} catch (Exception e) {
//			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException ex) {
				e.printStackTrace();
			}
			System.out.println(e.getMessage() + "\n");
		} finally {
			DBManager.dbClose(con, null);
		}

	}

	public int withdraw(Connection con, String outputAccount, int money) throws SQLException {

		String sql = "update bank set balance=balance-? where account = ?";

		int result = 0;

		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, money);
			ps.setString(2, outputAccount);

			result = ps.executeUpdate();

		}

		return result;
	}

	public int deposit(Connection con, String inputAccount, int money) throws SQLException {

		String sql = "update bank set balance=balance + ? where account = ?";

		int result = 0;

		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, money);
			ps.setString(2, inputAccount);

			result = ps.executeUpdate();

		}

		return result;
	}

	public boolean balanceCheck(Connection con, String inputAccount) throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select balance from bank where account = ?";

		boolean result = false;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, inputAccount);
			rs = ps.executeQuery();
		}finally {
			
		}

		return result;
	}

	public static void main(String[] args) {
		TransactionDAO dao = new TransactionDAO();
		System.out.println("--1. 출금계좌 오류----");
		// dao.transfer("A02", "A05",200);//입금, 출금, 금액

		System.out.println("--2. 입금계좌 오류----");
		// dao.transfer("A04", "A01",200);//입금, 출금, 금액

		System.out.println("--3. 입금계좌의 총액 1000원 이상인경우----");
		// dao.transfer("A02", "A01",700);//입금, 출금, 금액

		System.out.println("--4. 성공----------");
		dao.transfer("A02", "A01", 100);// 입금, 출금, 금액
	}
}