<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>���� ������ �α���</title>
		<style>
			.imgSty
			{
				border: none;
				padding: 20px;
				width: 370px;
				height: 250px;
			}
			.search
			{
				height: 40px;
				border: none;
				border-radius: 5px;
				background-color: #F1F3F4;
				outline-style: none;
				font-size: 17px;
				font-weight: bold;			
			}
			.button
			{
				height: 40px;
				border: none;
				border-radius: 5px;
				background-color: #F1F3F4;
				outline-style: none;
				font-size: 17px;
				font-weight: bold;
				color: white;
				background-color: orange;

			}
		</style>
	</head>

	<body>
	<center>
		<table border = "0" cellpadding = "2" bgcolor = "#434343">
			<tr>
				
				<td colspan = "5" align = "center" background = "car.jpg" class = "imgSty">					
				</td>
			</tr>

			<tr><td colspan = "5"><br></td></tr><!-- ���� ����� -->

			<tr>
				<td>&nbsp&nbsp&nbsp&nbsp&nbsp</td>
				<td colspan = "3" align = "center" class = "search">	
					공인 인증서의 비밀번호를 입력해주세요
				</td>
				<td>&nbsp&nbsp&nbsp&nbsp&nbsp</td>
			</tr>

			<tr><td colspan = "5"><br></td></tr><!-- ���� ����� -->


			<tr>
				<td></td>
				<td align = "center" class = "search" >인증서 암호</td>
				<td colspan = "2" align = "center"  class = "search">
					<input type = "text" placeholder = "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp��ȣ �Է¶�"  class = "search">
				</td>
				<td></td>
			</tr>

			<tr><td colspan = "5"><br></td></tr><!-- ���� ����� -->

			<tr>
				<td></td>
				<td align = "center" colspan = "3">
					<input type = "button" value = "�α���" class = "button">
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<input type = "button" value = "���" class = "button">
				</td>
				<td></td>
			</tr>
		</table>
	</center>
	</body>
</html>

						