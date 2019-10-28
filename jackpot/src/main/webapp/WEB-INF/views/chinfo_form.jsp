<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<style>
		table
		{
			border-collapse : collapse;
		}
		.userupdate
		{
			background-color : #434343;
			color : #ffffff;
		}
		.usrupmain
		{
			font-size : 30px;
			text-align : center;
		}
		tr
		{
			border-bottom : 1px solid lightgray;
		}
		tr:nth-child(1)
		{

		}
		td
		{
			padding : 10px 1px 10px 1px;

		}
		td:nth-child(1)
		{
			width : 130px;
			text-align : center;
		}
		td:nth-child(2)
		{
			width : 150px;
		}
		.upbtn
		{
			background-color : #E69138;
			width : 150px;
			height : 30px;
			border-color : #E69138;
		}
	</style>
	<boby>
		<table class = "userupdate">
			<tr>
				<td colspan = "2" class = "usrupmain"> ȸ �� �� �� �� �� </td>
			</tr>
			<tr>
				<td>�� ��</td>
				<td>
				<input type = text name = "name" size = "15">
				</td>
			</tr>
			<tr>
				<td>���̵�</td>
				<td>
				<input type = text name = "id" size = "15">
				</td>
			</tr>
			<tr>
				<td>��й�ȣ</td>
				<td>
				<input type = password name = "pwd" size = "15">
				</td>
			</tr>
			<tr>
				<td>��й�ȣ Ȯ��</td>
				<td>
				<input type = password name = "pwdchk" size = "15">
				</td>
			</tr>
			<tr>
				<td>����Ȯ�� ����</td>
				<td>
				<select name = "question">
					<option>���� ��� �ʵ��б���?</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>����Ȯ�� �亯</td>
				<td>
				<input type = text name = "answer" size = "15">
				</td>
			</tr>
			<tr>
				<td>�޴���ȭ</td>
				<td>
				<input type = text name = "tel1" size ="4"> <input type = text name = "tel2" size = "5"> <input type = text name = "tel3" size = "5">
				</td>
			</tr>
			<tr>
				<td colspan = "2">
					<input class = "upbtn" type = "submit" value ="���� ����">
			</tr>
		</table>
			
	</body>
</html>