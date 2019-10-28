package com.bank.jackpot.dto;

public class LoginFormDto {
//	Key	Logical	Physical	Domain	Type	Allow Null	Default Value	Comment
//	PK	아이디	id	아이디	VARCHAR2(12)	N		
//		이름	name	이름	CHAR(10)	Y		
//		비밀번호	pwd	비밀번호	VARCHAR2(14)	Y		
//		생년월일	birth	생년월일	INT(6)	Y		
//		전화번호	tel	전화번호	CHAR(13)	Y		
//		본인확인 질문 답변	qa	내용	TEXT	Y	NULL	

    private String id		="";
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	private String pwd	    ="";	
}
