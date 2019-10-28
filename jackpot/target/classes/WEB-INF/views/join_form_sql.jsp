<%@page import="com.bank.jackpot.dao.MemberDao"%>
<%@page import="com.bank.jackpot.dto.templates.Acc"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.bank.jackpot.dto.templates.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	MemberDao mem = new MemberDao();
	String id = "", pwd = "", pwd2 = "", name = "", birth = "", tel = "", qa_code = "", qa_ans = "";

	if(request.getParameter("id") != null)
		id = request.getParameter("id");
	if(request.getParameter("pwd") != null)
		pwd = request.getParameter("pwd");
	if(request.getParameter("pwd2") != null)
		pwd2 = request.getParameter("pwd2");
	if(request.getParameter("name") != null)
		name = request.getParameter("name");
	if(request.getParameter("birth") != null)
		birth = request.getParameter("birth");
	if(request.getParameter("tel") != null)
		tel = request.getParameter("tel");
	if(request.getParameter("qa_code") != null)
		qa_code = request.getParameter("qa_code");
	if(request.getParameter("qa_ans") != null)
		qa_ans = request.getParameter("qa_ans");
	
	if(id.equals("") || pwd.equals("") || pwd2.equals("") || name.equals("") || birth.equals("") || tel.equals("") || qa_code.equals("") || qa_ans.equals("")) {
		System.out.println("id: " + id);
		System.out.println("pwd: " + pwd);
		System.out.println("pwd2: " + pwd2);
		System.out.println("name: " + name);
		System.out.println("birth: " + birth);
		System.out.println("tel: " + tel);
		System.out.println("qa_code: " + qa_code);
		System.out.println("qa_ans: " + qa_ans);
		%>
		<script language='javascript'>
			alert('회원가입 양식을 모두 작성해주세요.');
			history.go(-1);
		</script>
		<%
	}
	else if(!pwd.equals(pwd2)) {
		%>
		<script language='javascript'>
			alert('입력 비밀번호가 동일하지 않습니다. 다시 한번 확인해주세요.');
			history.go(-1);
		</script>
		<%
	}
	else if(tel.length() < 10) {
		%>
		<script language='javascript'>
			alert('연락처를 올바르게 입력해주세요.');
			history.go(-1);
		</script>
		<%
	}
	else if(birth.length() < 6){
		%>
		<script language='javascript'>
			alert('생년월일을 올바르게 입력해주세요.');
			history.go(-1);
		</script>
		<%
	}
	else if(mem.SelectMember(id)){
		%>
		<script language='javascript'>
			alert('이미 존재하는 아이디 입니다.');
			history.go(-1);
		</script>
		<%
	}
	else
	{
		String insertQA = qa_code + "-" + qa_ans;
	
		User user = new User(); // DB에 삽입할 User(회원) 객체 생성
		user.setId(id);
		user.setPwd(pwd);
		user.setName(name);
		user.setBirth(Integer.parseInt(birth));
		user.setTel(tel);
		user.setQa(insertQA);
	
		MemberDao member = new MemberDao(); // 회원, 계좌 생성을 위한 객체 생성
		boolean b1 = member.InsertMember(user);
		boolean b2 = member.InsertAcc(user);
		if(b1 == false || b2 == false){
%>
			<script language='javascript'>
				alert('회원가입에 오류가 발생했습니다.');
				history.go(-1);
			</script>
<%
		}
		else{
%>
		<script language='javascript'>
			alert('잭팟뱅크 가입을 환영합니다!');
			location.replace('jackpot/');
		</script>
<%
		}
	}
%>
	
</body>
</html>