package com.bank.jackpot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bank.jackpot.dblib.MyDB;
import com.bank.jackpot.dto.*;


//Logical		Physical		Domain		Type			Allow Null	Default Value	Comment
//아이디		id				아이디		VARCHAR2(12)	N		
//계좌번호		acc_number		계좌번호		INT(12)			N		
//계좌금액		acc_money		금액			INT				Y		
//계좌개설일		acc_create		일			DATE			Y		
//계좌 삭제일시	acc_deldatetime	삭제일시		DATETIME		Y	NULL	
//계좌 비밀번호	acc_pwd			비밀번호		VARCHAR2(14)	Y		
//계좌 종류		acc_type		계좌 종류		TEXT			Y	NULL	
public class AccDao {

	
	
	public ArrayList<AccDto> SelectAll() {
		
		//
		ArrayList<AccDto> result = new ArrayList<AccDto>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="";


		try {
			// 쿼리 - Class Work의 행들을 start번호부터 size만큼 가져옴
			conn = MyDB.getCon();

			

			sql = "SELECT, id acc_number, acc_money, acc_create, acc_deldatetime, acc_pwd, acc_type FROM acc";

			pstmt = conn.prepareStatement(sql);


			rs = pstmt.executeQuery();

			while(rs.next()) {
				result.add(new AccDto(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getTimestamp(4), rs.getTimestamp(5),rs.getString(6),rs.getString(7)));	
			}



		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return null;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return null;}

		}				
		return result;
	}
	
	
}
