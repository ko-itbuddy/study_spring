package com.bank.jackpot.dto.templates;



public class User {
//	Key	Logical	Physical	Domain	Type	Allow Null	Default Value	Comment
//	PK	아이디	id	아이디	VARCHAR2(12)	N		
//		이름	name	이름	CHAR(10)	Y		
//		비밀번호	pwd	비밀번호	VARCHAR2(14)	Y		
//		생년월일	birth	생년월일	INT(6)	Y		
//		전화번호	tel	전화번호	CHAR(13)	Y		
//		본인확인 질문 답변	qa	내용	TEXT	Y	NULL	

	
	    private String id		="";
	    private String name     ="";
	    private String pwd	    ="";
	    private int birth     	= 0;
	    private String tel	    ="";
	    private String qa		="";
	    
	    
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public int getBirth() {
			return birth;
		}
		public void setBirth(int birth) {
			this.birth = birth;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getQa() {
			return qa;
		}
		public void setQa(String qa) {
			this.qa = qa;
		}
	
}
