package com.bank.jackpot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bank.jackpot.dao.interfaces.IChinfoDao;
import com.bank.jackpot.dblib.MyDB;
import com.bank.jackpot.dto.ChinfoDto;

public class ChinfoDao implements IChinfoDao {

	@Override
	public ChinfoDto getBean(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="";
		
		ChinfoDto bean = new ChinfoDto();
		
		try 
		{
			conn = MyDB.getCon();

			sql = "SELECT name, tel, qa, pwd from user where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			rs.next();
			
			bean.setName(rs.getString(1));
			bean.setTel(rs.getString(2));
			bean.setQa(rs.getString(3));
			bean.setPwd(rs.getString(4));
			bean.setId(id);
			
			
			return bean;

		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
			return null;
		}
		finally 
		{
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return null;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return null;}

		}
		
		
	}

	@Override
	public boolean userUpdate(ChinfoDto user) {
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn = MyDB.getCon();
			String sql="update user set pwd = ?, qa = ?, tel = ? where id = ?";
			
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, user.getPwd());
			pstmt.setString(2, user.getQa());
			pstmt.setString(3, user.getTel());
			pstmt.setString(4, user.getId());

			pstmt.executeUpdate();
			
			return true;
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return false;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return false;}
		}


	}
	
	
	public static void main(String[] args) {
		
		ChinfoDao chinfoDao = new ChinfoDao();
		ChinfoDto chinfoDto = new ChinfoDto();
		
		chinfoDto = chinfoDao.getBean("hsjoo");
		
		System.out.println(chinfoDto.getId());
		System.out.println(chinfoDto.getPwd());
		System.out.println(chinfoDto.getName());		
		System.out.println(chinfoDto.getTel());
		System.out.println(chinfoDto.getQa());
		
		
		int int_pwd;
		
		int_pwd = Integer.parseInt(chinfoDto.getPwd());
		
		++int_pwd;
		
		chinfoDto.setPwd(String.valueOf(int_pwd));
		
		chinfoDao.userUpdate(chinfoDto);
		
		System.out.println(chinfoDto.getId());
		System.out.println(chinfoDto.getPwd());
		System.out.println(chinfoDto.getName());		
		System.out.println(chinfoDto.getTel());
		System.out.println(chinfoDto.getQa());
		
	}

}
