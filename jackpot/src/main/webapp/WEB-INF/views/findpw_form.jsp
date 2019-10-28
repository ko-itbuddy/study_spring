<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
 <head>
  <title>È¸¿ø°¡ÀÔÆû201407085ÀÌ³ªÁø</title>
 </head>
<style>
h, td, tr, input, textarea, select, FORM
 {
   font-family:°íµñ;
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
    <h1>°èÁ¤ ºñ¹Ð¹øÈ£ Ã£±â</h1>
    <table border=""bgcolor = "#5D5D5D" cellspacing = "1" span style ="color:white">
     <form method=post action=È¸¿ø°¡ÀÔÆû>
     <tr>
      <td>¾ÆÀÌµð</td>
      <td><input type=text size=30 name=LNJ_id>
     </tr>
     <tr>
      <td>ÀÌ¸§</td>
      <td><input type=password size=30 name=LNJ_passwd>
      </td>
     </tr>
<td>º»ÀÎÈ®ÀÎ Áú¹®</td>
      <td> <select name=LNJ_"number">
	  <option value="1">º»ÀÎ Ãâ½Å ÃÊµîÇÐ±³´Â?</option>
  	  <option value="2">³»°¡ ÅÂ¾î³µ´ø °íÇâÀº?</option>
 	  <option value="3">³ªÀÇ ¾î·ÈÀ»Àû º°¸íÀº?</option>
  	  <option value="4">¿ì¸® ¾Æ¹öÁöÀÇ ÀÌ¸§Àº?</option> 
      </td>
     </tr>
        <tr>
 	<td>º»ÀÎÈ®ÀÎ Áú¹®´äº¯</td>
      <td><input type=text size=30 name=LNJ_id>
     </tr>
  </table>
      <input type=submit value="È®ÀÎ"style="background-color:#FFBB00">
      <input type=reset value="Ãë¼Ò" style="background-color:#FFBB00">

  </body>
   </form>
</html>