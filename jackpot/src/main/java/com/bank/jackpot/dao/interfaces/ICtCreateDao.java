package com.bank.jackpot.dao.interfaces;
import com.bank.jackpot.dto.templates.Celt;

public interface ICtCreateDao
{
	/*
	private String id;
	private int cel_code; //auto_crement 
	private String cel_pwd;
	 */
	
	//공인인증서 존재 유무를 구해오는 메소드
	boolean getCert(String id);
	
	//공인인증서 생성 메소드
	void setCert(String id, String cel_pwd);
	
	//공인인증서 비밀번호 구해오는 메소드
	String getCertPw(String id);
}
