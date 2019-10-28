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
                margin-top: 550px;
                transform: translateX(-50%);
            }
            
            .logo_div
            {
                position: absolute;
                left: 50%;
                margin-top: 350px;
                transform: translateX(-50%);
            }
            
            .team_div
            {
                position: absolute;
                left: 50%;
                margin-top: 440px;
                transform: translateX(-50%);
                
                color: white;
                font-size: 23px;
                font-family: sans-serif;
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
            }
            
            .btn:hover
            {
                color:black;
                border-color: black;
                text-decoration: underline;
                cursor:pointer;
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
                font-family: sans-serif;
                font-weight: bold;
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
                <div class = "team_div">
                    <span class = "team_span">나평근 김윤성 이빌립 이나진 이민혁</span>
                </div>
                <div class = "btn_div">
                    <input type = button value = "Login" class = "btn">
                </div>
            </div>
        </form>
    </body>
</html>