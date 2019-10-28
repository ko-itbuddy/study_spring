<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
 <head>
  <title>회원가입폼201407085이나진</title>
 </head>
<style>
h, td, tr, input, textarea, select, FORM
 {
   font-family:고딕;
  font-size:1em;
  border-radius:5px;
  
 }
 
 table, FORM
 {
  border:1px solid rgba(36, 228, 172, 0.29);
  border-spacing:15px;
 }

  
   
  </style>
  <body style="background-color:#FFE08C">
   <center>
    <h1>잭팟은행 회원가입</h1>
    <table border=""bgcolor = "#5D5D5D" cellspacing = "1" span style ="color:white">
     <form method=post action="join_form_sql">
     <tr>
      <td>아이디</td>
      <td><input type=text size=30 name=id></td>
     </tr>
     <tr>
      <td>비밀번호</td>
      <td><input type=password size=30 name=pwd>
      </td>
     </tr>
		<tr>
			<td>비밀번호 확인</td>
			<td><input type=password size=30 name=pwd2 check></td>
		</tr>
		
         <tr>
      <td>이름</td>
      <td><input type=text size=15 name=name>
      </td>
     </tr>
     
     <tr>
      <td>휴대폰</td>
      <td><input type=tel size=13 name=tel maxlength=13></td>
     </tr>
     
	<tr>
		<td>생년월일</td>
		<td><input type=tel size=6 name=birth maxlength=6></td>
	</tr>
     
         <tr>
      <td>본인확인 질문</td>
      <td>
      	<select name="qa_code">
	  		<option value="1">본인 출신 초등학교는?</option>
	  	  	<option value="2">내가 태어났던 고향은?</option>
 	  		<option value="3">나의 어렸을적 별명은?</option>
	  	  	<option value="4">우리 아버지의 이름은?</option>
  	  	</select> 
      </td>
     </tr>
        <tr>
 	<td>본인확인 질문답변</td>
      <td><input type=text size=30 name=qa_ans></td>
     </tr>
  </table>
      <input type=submit value="회원가입" style="background-color:#FFBB00">
      <input type=reset value="취소" style="background-color:#FFBB00">

  </body>
   </form>
</html>