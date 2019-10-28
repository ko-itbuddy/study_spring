package com.bank.jackpot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.bank.jackpot.dao.interfaces.IExMemberDao;
import com.bank.jackpot.dblib.MyDB;
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
public class ExMemberDao implements IExMemberDao{
	@Override
	public boolean isExist(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="";
		int cnt = 0;


		try {
			conn = MyDB.getCon();
			// 쿼리 - 먼저 해당 CLASS WORK에 파일이 얼마나 있는지 확인한다.

			sql = "SELECT count(MEMID) FROM MEMBER WHERE MEMID=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			rs.next();


			cnt = rs.getInt(1);

			if(cnt > 0) return true ;
			else return false;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return false;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return false;}

		}		
	}

	@Override
	public ExMemberDto getBean(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="";
		ExMemberDto bean = new ExMemberDto();

		try {
			conn = MyDB.getCon();
			// 쿼리 - 먼저 해당 CLASS WORK에 파일이 얼마나 있는지 확인한다.

			sql = "SELECT MEMNAME, MEMINTRO, MEMPHONE, JOBCODE, MEMEMAIL, MEMBLOG, MEMREGDATE, MEMID FROM MEMBER WHERE MEMID=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			rs.next();

			bean.setName(rs.getString(1));
			bean.setIntro(rs.getString(2));
			bean.setPhone(rs.getString(3));
			bean.setJobcode(rs.getInt(4));
			bean.setEmail(rs.getString(5));
			bean.setBlogaddress(rs.getString(6));
			bean.setReg_date(rs.getTimestamp(7));
			bean.setId(rs.getString(8));


			return bean;

		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return null;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return null;}

		}		
	}




	//로그인
	@Override
	public boolean loginCheck(ExMemberDto member) 
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="";
		String id = member.getId();
		String pw = member.getPasswd();
		String dbPW = ""; // db에서 꺼낸 비밀번호를 담을 변수


		try {
			// 쿼리 - 먼저 입력된 아이디로 DB에서 비밀번호를 조회한다.

			sql = "SELECT MEMPASSWD FROM MEMBER WHERE MEMID=?";

			conn = MyDB.getCon();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) // 입려된 아이디에 해당하는 비번 있을경우
			{
				dbPW = rs.getString("MEMPASSWD"); // 비번을 변수에 넣는다.

				if (dbPW.equals(pw)) 
					return true; // 넘겨받은 비번과 꺼내온 비번 비교. 같으면 인증성공
				else                  
					return false; // DB의 비밀번호와 입력받은 비밀번호 다름, 인증실패

			} else {
				return false; // 해당 아이디가 없을 경우
			}



		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return false;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return false;}

		}

	} // end loginCheck()




	//회원가입
	@Override
	public boolean insertMember(ExMemberDto member) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn = MyDB.getCon();
			String sql="insert into MEMBER(MEMID, MEMPASSWD, MEMNAME, JOBCODE, MEMINTRO, MEMPHONE,	MEMEMAIL, MEMBLOG, MEMREGDATE) "
					+ "values(?,?,?,?,?,?,?,?,?)";

			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setInt(4, member.getJobcode());
			pstmt.setString(5, member.getIntro());
			pstmt.setString(6, member.getPhone());
			pstmt.setString(7, member.getEmail());
			pstmt.setString(8, member.getBlogaddress());
			pstmt.setTimestamp(9, member.getReg_date());
			pstmt.executeUpdate();
			System.out.println("삽입성공");
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return false;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return false;}

		}

	}
	//회원정보수정
	@Override
	public boolean updateMember(ExMemberDto member) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn = MyDB.getCon();
			String sql="update MEMBER set   MEMNAME=?, JOBCODE=?, MEMINTRO=?, MEMPHONE=?,	MEMEMAIL=?, MEMBLOG=? WHERE MEMID=?";

			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setInt(2, member.getJobcode());
			pstmt.setString(3, member.getIntro());
			pstmt.setString(4, member.getPhone());
			pstmt.setString(5, member.getEmail());
			pstmt.setString(6, member.getBlogaddress());
			pstmt.setString(7, member.getId());

			pstmt.executeUpdate();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return false;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return false;}
		}

	}
	//회원 탈퇴
	@Override
	public boolean deleteMember(ExMemberDto member) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn = MyDB.getCon();
			String sql="DELETE from MEMBER WHERE MEMID =?";

			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());

			pstmt.executeUpdate();
			System.out.println("삭제성공");

			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return false;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return false;}

		}

	}
	//모든 회원 가져오기
	@Override
	public ExMemberDto[] getAllTable() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="";
		int size;
		ExMemberDto[] table;

		try {
			// 쿼리 - Class Work의 행들을 start번호부터 size만큼 가져옴
			conn = MyDB.getCon();
			sql = "SELECT count(MEMID) FROM MEMBER";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			size = rs.getInt(1);
			table = new ExMemberDto[size];


			sql = "SELECT MEMID, MEMPASSWD, MEMNAME, MEMINTRO, MEMPHONE, JOBCODE, MEMEMAIL, MEMBLOG, MEMREGDATE FROM MEMBER";
			pstmt = conn.prepareStatement(sql);


			rs = pstmt.executeQuery();
			int i =0;
			while(rs.next()) {
				table[i] = new ExMemberDto();
				table[i].setId(rs.getString(1));
				table[i].setPasswd(rs.getString(2));
				table[i].setName(rs.getString(3));
				table[i].setIntro(rs.getString(4));
				table[i].setPhone(rs.getString(5));
				table[i].setJobcode(rs.getInt(6));
				table[i].setEmail(rs.getString(7));
				table[i].setBlogaddress(rs.getString(8));
				table[i].setReg_date(rs.getTimestamp(9));
				i++;
			}
			if(i==0) return null;
			return table;

		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}finally {
			if(pstmt != null) try {pstmt.close();} catch(SQLException ex){return null;}
			if(conn != null) try {conn.close();} catch(SQLException ex){return null;}

		}		
	}


	
	public static void main(String[] args) {
		ExMemberDao mem = new ExMemberDao();
		ExMemberDto member = new ExMemberDto();
		member.setId("12332");
		member.setPasswd("123");
		member.setName("123");
		member.setJobcode(0);
		member.setIntro("123123");
		member.setPhone("123123123");
		member.setEmail("123123");

		System.out.print(mem.insertMember(member));
		System.out.println(mem.getBean("123"));

		System.out.println(member.getId());
		System.out.println(member.getName());
		System.out.println(member.getJobcode());
		System.out.println(member.getIntro());
		System.out.println(member.getPhone());
		System.out.println(member.getEmail());

		//System.out.print(mem.deleteMember(member));


	}




}
