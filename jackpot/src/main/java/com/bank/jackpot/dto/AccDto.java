package com.bank.jackpot.dto;


import java.sql.Timestamp;

public class AccDto {

//	Logical		Physical		Domain		Type			Allow Null	Default Value	Comment
//	아이디		id				아이디		VARCHAR2(12)	N		
//	계좌번호		acc_number		계좌번호		INT(12)			N		
//	계좌금액		acc_money		금액			INT				Y		
//	계좌개설일		acc_create		일			DATE			Y		
//	계좌 삭제일시	acc_deldatetime	삭제일시		DATETIME		Y	NULL	
//	계좌 비밀번호	acc_pwd			비밀번호		VARCHAR2(14)	Y		
//	계좌 종류		acc_type		계좌 종류		TEXT			Y	NULL	

	
	private String id;
	private int acc_number;
	private int acc_money;
	private Timestamp acc_create;
	private Timestamp acc_deldatetime;  
	private String acc_pwd;
	private String acc_type;
	
	
	
	public AccDto(String id, int acc_number, int acc_money, Timestamp acc_create, Timestamp acc_deldatetime,
			String acc_pwd, String acc_type) {
		super();
		this.id = id;
		this.acc_number = acc_number;
		this.acc_money = acc_money;
		this.acc_create = acc_create;
		this.acc_deldatetime = acc_deldatetime;
		this.acc_pwd = acc_pwd;
		this.acc_type = acc_type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(int acc_number) {
		this.acc_number = acc_number;
	}
	public int getAcc_money() {
		return acc_money;
	}
	public void setAcc_money(int acc_money) {
		this.acc_money = acc_money;
	}
	public Timestamp getAcc_create() {
		return acc_create;
	}
	public void setAcc_create(Timestamp acc_create) {
		this.acc_create = acc_create;
	}
	public Timestamp getAcc_deldatetime() {
		return acc_deldatetime;
	}
	public void setAcc_deldatetime(Timestamp acc_deldatetime) {
		this.acc_deldatetime = acc_deldatetime;
	}
	public String getAcc_pwd() {
		return acc_pwd;
	}
	public void setAcc_pwd(String acc_pwd) {
		this.acc_pwd = acc_pwd;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	


	
}
