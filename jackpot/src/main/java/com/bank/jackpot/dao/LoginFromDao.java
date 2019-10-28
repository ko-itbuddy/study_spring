package com.bank.jackpot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bank.jackpot.dao.interfaces.ILoginFromDao;
import com.bank.jackpot.dblib.MyDB;
import com.bank.jackpot.dto.ExMemberDto;
import com.bank.jackpot.dto.LoginFormDto;;

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
*/


public class LoginFromDao implements ILoginFromDao {
	
	@Override
	public int loginCheck(LoginFormDto user) 
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="";
		String id = user.getId();
		String pw = user.getPwd();
		String dbPW = ""; // db에서 꺼낸 비밀번호를 담을 변수


		try {
			// 쿼리 - 먼저 입력된 아이디로 DB에서 비밀번호를 조회한다.

			sql = "SELECT pwd FROM User WHERE id=?";

			conn = MyDB.getCon();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) // 입려된 아이디에 해당하는 비번 있을경우
			{
				dbPW = rs.getString("pwd"); // 비번을 변수에 넣는다.

				if (dbPW.equals(pw)) 
					return 1; // 넘겨받은 비번과 꺼내온 비번 비교. 같으면 인증성공
				else                  
					return 0; // DB의 비밀번호와 입력받은 비밀번호 다름, 인증실패

			} else {
				return 0; // 해당 아이디가 없을 경우
			}

		}catch(Exception ex) {
			ex.printStackTrace();
			return 0;
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return 0;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return 0;}
		}
	}
	
	public static void main(String[] args) {
		LoginFromDao login1 = new LoginFromDao();
		LoginFormDto login2= new LoginFormDto();
		login2.setId("1232");
		login2.setPwd("123");
		
		System.out.println(login1.loginCheck(login2));
		
		System.out.println(login2.getId());
		System.out.println(login2.getPwd());
	}
}
