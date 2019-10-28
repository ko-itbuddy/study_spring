package com.bank.jackpot.dto;

import java.sql.Timestamp;

public class TranferFormDto {

//	Logical	Physical	Domain	Type	Allow Null	Default Value	Comment
//	계좌번호	acc_number	계좌번호	INT(12)	N		
//	계좌 비밀번호	acc_pwd			비밀번호		VARCHAR2(14)	Y			
//	이체 기록일시	trans_datetime	일시	DATETIME	N		
//	이체 구분	trans_type	이체구분	CHAR(1)	Y	+|-	
//	이체 상대 계좌	trans_opacc	계좌번호	INT(12)	Y		
//	이체 금액	trans_money	금액	INT	Y		
//	이체 내용	trans_comment	내용	TEXT	Y	NULL	


	private int acc_number;
	private String acc_pwd;
	private String trans_comment_my;
	private String trans_comment_op;
	private int trans_opacc; // 상대계좌
	private int trans_money;
	private Timestamp trans_datetime;
	
	
	public int getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(int acc_number) {
		this.acc_number = acc_number;
	}
	public String getAcc_pwd() {
		return acc_pwd;
	}
	public void setAcc_pwd(String acc_pwd) {
		this.acc_pwd = acc_pwd;
	}
	public String getTrans_comment_my() {
		return trans_comment_my;
	}
	public void setTrans_comment_my(String trans_comment_my) {
		this.trans_comment_my = trans_comment_my;
	}
	public String getTrans_comment_op() {
		return trans_comment_op;
	}
	public void setTrans_comment_op(String trans_comment_op) {
		this.trans_comment_op = trans_comment_op;
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
	public Timestamp getTrans_datetime() {
		return trans_datetime;
	}
	public void setTrans_datetime(Timestamp trans_datetime) {
		this.trans_datetime = trans_datetime;
	}

}
