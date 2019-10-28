package com.bank.jackpot.dblib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDB {

	public static Connection getCon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//String url = "jdbc:mysql://localhost:3306/javadb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
			String url = "jdbc:mysql://itbuddy.iptime.org:8233/yuhan";
			String user = "yuhan";
			String pwd = "yuhan1234";

			con = DriverManager.getConnection(url, user, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}


	public static void main(String[] args) {
		Connection con = getCon();
		if (con != null){System.out.println("연결 완료");}
		else{System.out.println("연결 실패");}


	}
}
