package com.bank.jackpot.dto.templates;

public class Celt {

	
//	Key	Logical			Physical	Domain		Type			Allow Null	Default Value	Comment
//	PK, FK	아이디		id			아이디		VARCHAR2(12)	N		
//	PK	공인인증서코드		cel_code	공인인증서코드	INT(12)	N		
//		공인인증서 비밀번호	cel_pwd		비밀번호		VARCHAR2(14)	Y		

	
	
	private String id;
	private int cel_code; 
	private String cel_pwd;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCel_code() {
		return cel_code;
	}
	public void setCel_code(int cel_code) {
		this.cel_code = cel_code;
	}
	public String getCel_pwd() {
		return cel_pwd;
	}
	public void setCel_pwd(String cel_pwd) {
		this.cel_pwd = cel_pwd;
	}

}
