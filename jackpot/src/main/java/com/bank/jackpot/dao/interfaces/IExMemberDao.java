package com.bank.jackpot.dao.interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.bank.jackpot.dto.ExMemberDto;
/*
 * 작년 jsp떄 코드임 그떈 뭔지 모르고 썼는데 이제 알듯
 * 회원	MEMBER	MEM	
회원아이디		MEMID	VARCHAR(15)
회원비밀번호		MEMPASSWD	VARCAHR(15)
회원이름		MEMNAME	VARCHAR(10)
직업코드	JOBCODE	JOBCODE	INT
회원소개		MEMINTRO	TEXT(255)
회원폰번호	MEMBER PHONE NUMBER	MEMPHONE	VARCHAR(13)
회원이메일		MEMEMAIL	VARCAHR(45)
회원블로그주소	MEMBER BLOG ADDRESS	MEMBLOG	VARCAHR(45)
회원등록일자	MEMBER REGISTRATION DATE	MEMREGDATE	TIMSTAMP

 * 
 * */
public interface IExMemberDao {

	public boolean isExist(String id);


	public ExMemberDto getBean(String id);




	//로그인
	public boolean loginCheck(ExMemberDto member);



	//회원가입
	public boolean insertMember(ExMemberDto member) ;
	//회원정보수정
	public boolean updateMember(ExMemberDto member) ;
	//회원 탈퇴
	public boolean deleteMember(ExMemberDto member) ;
	//모든 회원 가져옴
	public ExMemberDto[] getAllTable();

}
