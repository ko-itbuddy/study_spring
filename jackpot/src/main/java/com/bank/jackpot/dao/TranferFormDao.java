package com.bank.jackpot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bank.jackpot.dao.interfaces.ITranferFormDao;
import com.bank.jackpot.dblib.MyDB;
import com.bank.jackpot.dto.AccDto;
import com.bank.jackpot.dto.TranferFormDto;

public class TranferFormDao implements ITranferFormDao {

	@Override
	public ArrayList<String> getAccList(String id) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<String>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="";


		try {
			// 쿼리 - Class Work의 행들을 start번호부터 size만큼 가져옴
			conn = MyDB.getCon();

			

			sql = "Select acc_number from acc where id = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			while(rs.next()) {
				result.add(rs.getString(1));	
			}



		}catch(Exception ex) {
			ex.printStackTrace();
			result =  null;
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return null;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return null;}

		}				
		return result;

	}

	@Override
	public int insertTransHis(TranferFormDto dto, String id) {
		// TODO Auto-generated method stub
		int result = 0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn = MyDB.getCon();
			String sql="INSERT INTO transhis (trans_datetime, acc_number, id, trans_type, trans_opacc, trans_money, trans_comment) VALUES (?, ?, ?, ?, ?, ?, ?)";

			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTrans_datetime());
			pstmt.setString(2, dto.getAcc_number()());
			pstmt.setString(3, id);
			pstmt.setInt(4, "출금");
			pstmt.setString(5, dto.getIntro());
			pstmt.setString(6, dto.getPhone());
			pstmt.setString(7, dto.getEmail());
			pstmt.executeUpdate();
			System.out.println("삽입성공");
			result = 1;
		}catch(Exception ex) {
			ex.printStackTrace();
			result= -1;
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return false;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return false;}

		}
		return result;
		
		
		
	}

	public static void main(String[] args) {
		TranferFormDao dao = new TranferFormDao();
		
		
		ArrayList<String> arrayList = dao.getAccList("hsjoo");
		
		for (String string : arrayList) {
			System.out.println(string);
		}
	}




}
