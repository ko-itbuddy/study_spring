<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>���� ������ ����</title>
		<style>
			.title
			{
				height: 50px;
				border: none;
				border-radius: 5px;
				background-color: #F1F3F4;
				outline-style: none;
				font-size: 12px;
				font-weight: bold;		
			}

			.search
			{
				height: 45px;
				border: none;
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

			<tr><td colspan = "5"><br></td></tr><!-- ���� ����� -->

			<tr>
				<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
				<td colspan = "3" align = "center" class = "title">	
				���������� ������������ �����մϴ�.
				</td>
				<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
			</tr>

			<tr><td colspan = "5"><br></td></tr><!-- ���� ����� -->

			<tr>
				<td>&nbsp&nbsp&nbsp&nbsp&nbsp</td>
				<td colspan = "3" align = "center" class = "title">	
					������������ ��ȣ�� ������ �ּ���.
				</td>
				<td>&nbsp&nbsp&nbsp&nbsp&nbsp</td>
			</tr>

			<tr><td colspan = "5"><br></td></tr><!-- ���� ����� -->

			<tr>
				<td></td>
				<td align = "center" class = "search" >����������<br>��ȣ</td>
				<td colspan = "2" align = "center"  class = "search">
					<input type = "text" placeholder = "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp��ȣ �Է¶�"  class = "search">
				</td>
				<td></td>
			</tr>

			<tr><td colspan = "5"><br></td></tr><!-- ���� ����� -->

			<tr>
				<td></td>
				<td align = "center" class = "search" >����������<br>��ȣ Ȯ��</td>
				<td colspan = "2" align = "center"  class = "search">
					<input type = "text" placeholder = "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp��ȣ �Է¶�"  class = "search">
				</td>
				<td></td>
			</tr>

			<tr><td colspan = "5"><br></td></tr><!-- ���� ����� -->

			<tr>
				<td></td>
				<td align = "center" colspan = "3">
					<input type = submit value = "Ȯ��" class = "button">
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<input type = reset value = "���" class = "button">
				</td>
				<td></td>
			</tr>
		</table>
	</center>
	</body>
</html>

						