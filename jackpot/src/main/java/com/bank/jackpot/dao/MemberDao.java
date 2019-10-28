package com.bank.jackpot.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import com.bank.jackpot.dao.interfaces.IMemberDao;
import com.bank.jackpot.dblib.MyDB;
import com.bank.jackpot.dblib.MysqlDataType;
import com.bank.jackpot.dto.templates.Acc;
import com.bank.jackpot.dto.templates.User;
import com.mysql.cj.xdevapi.PreparableStatement;

public class MemberDao implements IMemberDao{
	
	@Override
	public boolean InsertMember(User user) {
		Connection con = MyDB.getCon();
		PreparedStatement pstmt = null;
		String sql = "";
		
		if(con == null) {
			return false;
		}
		else{
			
			try{
				sql = "INSERT INTO user(id, pwd, name, birth, tel, qa) VALUES(?, ?, ?, ?, ?, ?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getId());
				pstmt.setString(2, user.getPwd());
				pstmt.setString(3, user.getName());
				pstmt.setInt(4, user.getBirth());
				pstmt.setString(5, user.getTel());
				pstmt.setString(6, user.getQa());
				pstmt.executeUpdate();
				
				return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
			finally {
				if(pstmt != null) try { pstmt.close(); } catch(Exception e) {e.printStackTrace();}
				if(con != null) try { con.close(); } catch(Exception e) {e.printStackTrace();}
			}
		}
	}

	
	@Override
	public boolean InsertAcc(User user) {
		Connection con = MyDB.getCon();
		MysqlDataType dt = new MysqlDataType(); // 계좌생성 일자를 위한 MysqlDataType 객체 생성
		PreparedStatement pstmt = null;
		String sql = "";
		String str_Acc = "777";
		
		Random rand = new Random(); // 계좌를 위한 random 객체 생성
		int iAcc1 = rand.nextInt(101); // 0 ~ 100 까지 랜덤 숫자 반환
		int iAcc2 = rand.nextInt(10001);
		String c_Acc = Integer.toString(iAcc1);
		String r_Acc = Integer.toString(iAcc2);
		
		if(c_Acc.length() == 1)
			c_Acc = "00" + c_Acc;
		else if(c_Acc.length() == 2)
			c_Acc = "0" + c_Acc;
		
		if(r_Acc.length() == 1)
			r_Acc = "00000" + r_Acc;
		else if(r_Acc.length() == 2)
			r_Acc = "0000" + r_Acc;
		else if(r_Acc.length() == 3)
			r_Acc = "000" + r_Acc;
		else if(r_Acc.length() == 4)
			r_Acc = "00" + r_Acc;
		else if(r_Acc.length() == 5)
			r_Acc = "0" + r_Acc;
		
		str_Acc = str_Acc + c_Acc + r_Acc; // 최종 계좌 (777-xxx-xxxxxx)
		

		if(con == null) {
			return false;
		}
		else{
			try {
				sql = "INSERT INTO acc(id, acc_number, acc_money, acc_create, acc_pwd, acc_type) VALUES(?, ?, ?, ?, ?, ?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getId());
				pstmt.setString(2, str_Acc);
				pstmt.setInt(3, 10000);
				pstmt.setTimestamp(4, dt.currentTime);
				pstmt.setString(5, "0000");
				pstmt.setString(6, "일반계좌");
				pstmt.executeUpdate();
				
				return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return false;
			}
			finally {
				if(pstmt != null) try { pstmt.close(); } catch(Exception e) {e.printStackTrace();}
				if(con != null) try { con.close(); } catch(Exception e) {e.printStackTrace();}
			}
		}
	}


	@Override
	public boolean SelectMember(String id) {
		Connection con = MyDB.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";
		
		try {
			if(con == null) {
				return false;
			}
			else {
				sql = "SELECT * FROM user WHERE id = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		finally{
			if(pstmt != null) try { pstmt.close(); } catch(Exception e) {e.printStackTrace();}
			if(con != null) try { con.close(); } catch(Exception e) {e.printStackTrace();}
		}
	}
}
