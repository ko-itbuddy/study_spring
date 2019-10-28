package com.bank.jackpot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bank.jackpot.dblib.MyDB;
import com.bank.jackpot.dto.FindpwformDto;

public class FindpwFormDao {
	static Connection conn = null;



	public FindpwFormDao(Connection conn){

		this.conn = conn;

	}
	public String Findpw(String getid,String Name, String qa){

		PreparedStatement pstmt = null;


		ResultSet rs = null;
		String result = "";
		String sql ="";

		try {
			conn = MyDB.getCon();

			pstmt = conn.prepareStatement( 

					"select pwd from user " +

					"where id = ? and name = ? and qa = ? ");
			pstmt.setString(1, (String) getid);
			
			pstmt.setString(2, Name);

			pstmt.setString(3, qa);

			rs = pstmt.executeQuery();

			if( rs.next() )

				result = rs.getString("pwd");

			else

				result = "NOTFOUND";

		} 
	
	catch (Exception e) {
		// TODO: handle exception
			result = "ERROR";
			
		}
		finally {

			if(rs!=null)try { rs.close(); } catch(SQLException ex) {}

			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}

		}

		return result;


	}



	

	public static void main(String[] args) {
		FindpwFormDao dao = new FindpwFormDao(conn);
		FindpwformDto dto = new FindpwformDto();
//		FindidFormDao findidformdao = new FindidFormDao(conn);
//		FindidFormDto findidformdto = new FindidFormDto();
//		findidformdao.setName("12332");
//		findidformdao.setQa("123");
//
//
//		System.out.println(findidformdao.getId());
//		System.out.println(findidformdao.getPw());
		dto.setId("milk9503");
		dto.setName("이민혁");
		dto.setqa("1-심곡초등학교");
		
		String pwd;
		
		pwd = dao.Findpw((String) dto.getid,dto.getName(), dto.getqa());
		
		System.out.println(pwd);
		


		//System.out.print(mem.deleteMember(member));


	}
	//			private char[] getPw() {
	//				// TODO Auto-generated method stub
	//				return null;
	//			}
	//			private char[] getId() {
	//				// TODO Auto-generated method stub
	//				return null;
	//			}
	//			private void setQa(String string) {
	//				// TODO Auto-generated method stub
	//				
	//			}
	//			private void setName(String string) {
	//				// TODO Auto-generated method stub
	//				
	//			}


}





