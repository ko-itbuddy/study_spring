package com.bank.jackpot.dblib;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MysqlDataType {

	java.util.Date dt = new java.util.Date();
	public Timestamp currentTime;

	public MysqlDataType() {
				
		SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		Calendar cal = Calendar.getInstance();
		String today = null;
		today = formatter.format(cal.getTime());
		Timestamp ts = Timestamp.valueOf(today);
		this.currentTime = ts;
		
		
	}
	
	public static void main(String[] args) {
		
		MysqlDataType myData = new MysqlDataType();
		
		System.out.println(myData.currentTime);
		
	}
	
}
