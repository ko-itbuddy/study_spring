<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>사용자 로그인</h1>

<c:if test="${empty member}">
<a href="${cp}/member/joinForm">사용자 등록</a> &nbsp;&nbsp; 
<a href="${cp}/member/loginForm">로그인</a> &nbsp;&nbsp; 
</c:if>

<%-- <c:if test="${!empty member}">
<a href="${cp}/member/modifyForm">MODIFY</a> &nbsp;&nbsp; 
<a href="${cp}/member/logout">LOGOUT</a> &nbsp;&nbsp;
<a href="${cp}/member/removeForm">REMOVE</a> &nbsp;&nbsp; 
</c:if> --%>

</body>
</html>