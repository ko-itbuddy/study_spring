<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta charset="UTF-8" />
        <link rel="stylesheet" href="resources\Css\menu.css">
        
        <style>
            body{
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;
                
                position: fixed;
                background-color: #333333;
            }
            
            span
            {
                display: inline-block;
                padding: 9px 60px;
            }
            
            span a{
                color: white;
                text-decoration: none;
            }
            
            span a:hover{
                color: orange;
            }
            
        </style>
    </head>
    
    <body>
        <center>
            <span><a href="ct_login_form.html" target="article">공인인증센터</a></span>
            <span><a href="transfer_form.html" target="article">계좌이체</a></span>
            <span><a href="acc_detail.html" target="article">계좌조회</a></span>
            <span><a href="#" target="article">계좌개설</a></span>
            <span><a href="login_form.html" target="article">로그인</a></span>
            <span><a href="join_form.html" target="article">회원가입</a></span>
        </center>
    </body>
    
</html>