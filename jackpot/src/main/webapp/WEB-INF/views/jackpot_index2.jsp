<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta charset="utf-8" />
        <title>JackPotBank</title>
        <style>
            .bg
            {
                top: 0;
                left: 0;
                position: fixed;
                
                min-width: 100%;
                min-height: 100%;
                
                background-image: url(./background.jpg);
            }
            
            .btn_div
            {
                position: absolute;
                left: 50%;
                margin-top: 397px;
                transform: translateX(-50%);
            }
            
            .logo_div
            {
                position: absolute;
                left: 50%;
                margin-top: 350px;
                transform: translateX(-50%);
            }
            
            .user_div
            {
                position: absolute;
                left: 50%;
                transform: translateX(-50%);
                margin-top: 25px;
                
                color: white;
                font-size: 14px;
                font-family: sans-serif;
            }
            
            .team_div
            {
                position: absolute;
                left: 50%;
                margin-top: 287px;
                transform: translateX(-50%);
                
                color: white;
                font-size: 23px;
                font-family: sans-serif;
            }
            
            .nav_ul
            {
                display: flex;
                flex-direction: row;
                width:100%;
                margin-top: 50px;
                padding: 0px;
                background-color:;
                list-style-type: none;
            }
            
            .nav_li
            {
                padding: 30px;
                cursor: pointer;
            }
            
            .nav_li a
            {
                font-size: 20px;
                text-align: center;
                text-decoration: none;
                color: white;
            }
            
            .nav_li a:hover
            {
                color:orangered;
            }
            
            .btn
            {
                width: 250px;
                height: 60px;
                
                border-color: white;
                border-style: solid;
                border-width: thin;
                background-color: transparent;
                border-radius: 7px;
                outline: 0;
                
                color: white;
                font-size: 20px;
                font-family: sans-serif;
                cursor: pointer;
            }
            
            .btn:hover
            {
                color:black;
                border-color: black;
                text-decoration: underline;
            }
            
            .logo_span1
            {
                color: white;
                font-size: 80px;
                font-family: sans-serif;
                margin-left: 10px;
            }
            
            .logo_span2
            {
                color:white;
                font-size: 80px;
                font-weight: bold;
                font-family: sans-serif;
            }
            
            .user_span
            {
                color: white;
                font-weight: bold;
            }
            
            tab
            {
                padding-left: 250px;
            }
            
        </style>
    </head>
    
    <body>
        <form>
            <div class = "bg">
                <div class = "logo_div">
                    <span class = "logo_span1">JackPot</span>
                    <span class = "logo_span2">Bank</span>
                </div>
                <div class = "user_div">
                    <span class = "user_span">milk9503</span>
                    <span>님, 안녕하세요?</span>
                </div>
                <div class = "nav_div">
                    <ul class = "nav_ul">
                        <tab></tab>
                        <li class = "nav_li"><a href="#">공인인증센터</a></li>
                        <tab></tab>
                        <li class = "nav_li"><a href="#">계좌이체</a></li>
                        <tab></tab>
                        <li class = "nav_li"><a href="#">계좌조회</a></li>
                        <tab></tab>
                        <li class = "nav_li"><a href="#">계좌개설</a></li>
                        <tab></tab>
                    </ul>
                </div>
                <div class = "team_div">
                    <span class = "team_span">나평근 김윤성 이빌립 이나진 이민혁</span>
                </div>
                <div class = "btn_div">
                    <input type = button value = "Logout" class = "btn">
                </div>
            </div>
        </form>
    </body>
</html>