<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>

<head>
<style>
.myButton {
	-moz-box-shadow: inset 0px 1px 0px 0px #fce2c1;
	-webkit-box-shadow: inset 0px 1px 0px 0px #fce2c1;
	box-shadow: inset 0px 1px 0px 0px #fce2c1;
	background-color: #f7a94a;
	-moz-border-radius: 6px;
	-webkit-border-radius: 6px;
	border-radius: 6px;
	border: 1px solid #eeb44f;
	display: inline-block;
	cursor: pointer;
	color: #ffffff;
	font-family: Arial;
	font-size: 12px;
	font-weight: bold;
	padding: 6px 12px;
	text-decoration: none;
	text-shadow: 0px 1px 0px #cc9f52;
}

.myButton:hover {
	background-color: #f5bd78;
}

.myButton:active {
	position: relative;
	top: 1px;
}

.tg {
	border-collapse: collapse;
	border-spacing: 0;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: black;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: black;
}

.tg .tg-jr7e {
	background-color: #343434;
	color: #ffffff;
	text-align: left
}

.tg .tg-m71n {
	background-color: #9b9b9b;
	color: #333333;
	text-align: left;
	vertical-align: top
}

.tg .tg-w9in {
	background-color: #343434;
	text-align: left;
	vertical-align: top
}
</style>

</head>

<body>
	<form>
		<center>
			<table class="tg">
				<tr>
					<td class="tg-jr7e" rowspan="5">출금<br>
					<br>정보
					</td>
					<td class="tg-m71n">출금계좌번호</td>
					<td class="tg-m71n"><select name="acc">
							<option>1111</option>
							<option>2222</option>
							<option>3333</option>
							<option>4444</option>
							<option>5555</option>
					</select></td>
				</tr>
				<tr>
					<td class="tg-m71n">출급계좌비밀번호</td>
					<td class="tg-m71n"><input type="password"></td>
				</tr>
				<tr>
					<td class="tg-m71n">내통장에 표시할 내용</td>
					<td class="tg-m71n"><input type="text"></td>
				</tr>
				<tr>
					<td class="tg-m71n">상대 통장에 표시할 내용</td>
					<td class="tg-m71n"><input type="text"></td>
				</tr>
				<tr>
					<td class="tg-m71n">이체금액</td>
					<td class="tg-m71n"><input type="text">1,000,000<br />
						<button class="myButton">+1천만</button>
						<button class="myButton">+500만</button>
						<button class="myButton">+100만</button>
						<button class="myButton">+50만</button>
						<button class="myButton">+5만</button></td>
				</tr>
				<tr>
					<td class="tg-w9in"></td>
					<td class="tg-m71n">입금계좌번호</td>
					<td class="tg-m71n"><input type="text"></td>
				</tr>
			</table>
	</form>
	</center>
</body>
</html>
