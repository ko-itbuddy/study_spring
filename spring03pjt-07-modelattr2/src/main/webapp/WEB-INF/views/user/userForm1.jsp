<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
 <h2>user폼페이지</h2>
 <hr/>
 <% String context=request.getContextPath();
  
  %>
 
 <form action="<%=context%>userInfo" method="post">
 <table boder="1" cellpadding="2" cellpadding="0">
 
 <tr>
 <td>이름:</td>
 <td><input type="text" name="name" /></td>
 <tr>

 <tr>
 <td>나이:</td>
 <td><input type="text" name="age" /></td>
 <tr> 
 
 <tr>
 <td>성별:</td>
 <td><input type="text" name="gender" /></td>
 <tr>
 
 <tr>
 <td>키:</td>
 <td><input type="text" name="height" /></td>
 <tr>
 
 <tr>
 <td>몸부게:</td>
 <td><input type="text" name="weight" /></td>
 <tr>
 
 <tr>
 <td colspan="2"><input type="submit" value="전송"/></td>
 <tr>
  
 </table>
 
 </form>

</div>
</body>
</html>