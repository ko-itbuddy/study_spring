package com.bank.jackpot.dto.templates;

import java.sql.Timestamp;

public class Transhis {

//	Logical	Physical	Domain	Type	Allow Null	Default Value	Comment
//	계좌번호	acc_number	계좌번호	INT(12)	N		
//	아이디	id	아이디	VARCHAR2(12)	N		
//	이체 기록일시	trans_datetime	일시	DATETIME	N		
//	이체 구분	trans_type	이체구분	CHAR(1)	Y	+|-	
//	이체 상대 계좌	trans_opacc	계좌번호	INT(12)	Y		
//	이체 금액	trans_money	금액	INT	Y		
//	이체 내용	trans_comment	내용	TEXT	Y	NULL	


	private int acc_number;
	private String id;
	private Timestamp trans_datetime;
	private String trans_type;
	private int trans_opacc;
	private int trans_money;
	private String trans_comment;
	public int getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(int acc_number) {
		this.acc_number = acc_number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Timestamp getTrans_datetime() {
		return trans_datetime;
	}
	public void setTrans_datetime(Timestamp trans_datetime) {
		this.trans_datetime = trans_datetime;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	public int getTrans_opacc() {
		return trans_opacc;
	}
	public void setTrans_opacc(int trans_opacc) {
		this.trans_opacc = trans_opacc;
	}
	public int getTrans_money() {
		return trans_money;
	}
	public void setTrans_money(int trans_money) {
		this.trans_money = trans_money;
	}
	public String getTrans_comment() {
		return trans_comment;
	}
	public void setTrans_comment(String trans_comment) {
		this.trans_comment = trans_comment;
	}
	
	
	
}
