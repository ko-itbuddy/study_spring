package com.bank.jackpot.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ExMemberDto {
	
	
	/*
회원	MEMBER	MEM	
회원아이디		MEMID	VARCHAR(15)
회원비밀번호		MEMPASSWD	VARCAHR(15)
회원이름		MEMNAME	VARCHAR(10)
직업코드	JOBCODE	JOBCODE	INT
회원소개		MEMINTRO	TEXT(255)
회원폰번호	MEMBER PHONE NUMBER	MEMPHONE	VARCHAR(13)
회원이메일		MEMEMAIL	VARCAHR(45)
회원블로그주소	MEMBER BLOG ADDRESS	MEMBLOG	VARCAHR(45)
회원등록일자	MEMBER REGISTRATION DATE	MEMREGDATE	TIMSTAMP



	*/
	private	String id="";		
	private	String passwd="";	
	private	String name	="";    
	private	int jobcode	=0;    
	private	String intro	=""	 ;
	private	String phone	=""	 ;
	private	String email	=""	 ;
	private	String blogaddress	=""	 ; 
	private Timestamp reg_date;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJobcode() {
		return jobcode;
	}
	public void setJobcode(int jobcode) {
		this.jobcode = jobcode;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBlogaddress() {
		return blogaddress;
	}
	public void setBlogaddress(String blogaddress) {
		this.blogaddress = blogaddress;
	}
	public Timestamp getReg_date() {
		return reg_date;
	}
	public void setReg_date() {
		SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		Calendar cal = Calendar.getInstance();
		String today = null;
		today = formatter.format(cal.getTime());
		Timestamp ts = Timestamp.valueOf(today);
		this.reg_date = ts;
	}
	public void setReg_date(Timestamp reg_date) {

		this.reg_date = reg_date;
	}
	
}
