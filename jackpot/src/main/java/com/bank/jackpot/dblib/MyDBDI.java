package com.bank.jackpot.dblib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.activation.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class MyDBDI {

	public static Connection getCon(){
		Connection con = null;
		try {

			AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:mysql_connector.xml");
			DriverManagerDataSource ds = ctx.getBean("DmDataSource", DriverManagerDataSource.class);			
			con = ds.getConnection();
			
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
