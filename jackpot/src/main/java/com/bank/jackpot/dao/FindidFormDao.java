package com.bank.jackpot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bank.jackpot.dao.interfaces.IExMemberDao;
import com.bank.jackpot.dao.interfaces.IFindFormDao;
import com.bank.jackpot.dblib.MyDB;
import com.bank.jackpot.dto.ChinfoDto;
import com.bank.jackpot.dto.ExMemberDto;
import com.bank.jackpot.dto.FindidFormDto;

public class FindidFormDao {


	static Connection conn = null;



	public FindidFormDao(Connection conn){

		this.conn = conn;

	}
	public String Findid(String Name, String qa){

		PreparedStatement pstmt = null;


		ResultSet rs = null;
		String result = "";
		String sql ="";

		try {
			conn = MyDB.getCon();

			pstmt = conn.prepareStatement( 

					"select id from user " +

					"where name = ? and qa = ? ");

			pstmt.setString(1, Name);

			pstmt.setString(2, qa);

			rs = pstmt.executeQuery();

			if( rs.next() )

				result = rs.getString("id");

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

	public String findpw(String id, String name ,String qa) throws SQLException {

		PreparedStatement pstmt = null;

		ResultSet rs = null;

		try {

			conn = MyDB.getCon();
			pstmt = conn.prepareStatement( 

					"select pwd from user " +

					"where id = ? and name = ? and qa");

			pstmt.setString(1, id);

			pstmt.setString(2, name);

			pstmt.setString(3, qa);



			rs = pstmt.executeQuery();

			if( rs.next() )

				return (rs.getString("pwd"));

			else

				return null;

		} finally {

			if(rs!=null)try { rs.close(); } catch(SQLException ex) {}

			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}

		}



	}

	public static void main(String[] args) {
		FindidFormDao dao = new FindidFormDao(conn);
		FindidFormDto dto = new FindidFormDto();
//		FindidFormDao findidformdao = new FindidFormDao(conn);
//		FindidFormDto findidformdto = new FindidFormDto();
//		findidformdao.setName("12332");
//		findidformdao.setQa("123");
//
//
//		System.out.println(findidformdao.getId());
//		System.out.println(findidformdao.getPw());
		
		dto.setName("이민혁");
		dto.setQa("1-심곡초등학교");
		
		String id = "";
		
		id = dao.Findid(dto.getName(), dto.getQa());
		
		System.out.println(id);
		


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
