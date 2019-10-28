<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
 <head>
  <title>ȸ��������201407085�̳���</title>
 </head>
<style>
h, td, tr, input, textarea, select, FORM
 {
   font-family:���;
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
    <h1>���� ���̵� ã��</h1>
    <table border=""bgcolor = "#5D5D5D" cellspacing = "1" span style ="color:white">
     <form method=post action=ȸ��������>
     <tr>
      <td>�̸�</td>
      <td><input type=password size=30 name=LNJ_passwd>
      </td>
     </tr>
<td>����Ȯ�� ����</td>
      <td> <select name=LNJ_"number">
	  <option value="1">���� ��� �ʵ��б���?</option>
  	  <option value="2">���� �¾�� ������?</option>
 	  <option value="3">���� ������� ������?</option>
  	  <option value="4">�츮 �ƹ����� �̸���?</option> 
      </td>
     </tr>
        <tr>
 	<td>����Ȯ�� �����亯</td>
      <td><input type=text size=30 name=LNJ_id>
     </tr>
  </table>
      <input type=submit value="Ȯ��" style="background-color:#FFBB00">
      <input type=reset value="���" style="background-color:#FFBB00">

  </body>
   </form>
</html>