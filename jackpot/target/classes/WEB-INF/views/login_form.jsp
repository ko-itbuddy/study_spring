<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

<head>
    <meta charset="utf-8">
    <title>잭팟 뱅크</title>

    <style type="text/css">
        .myButton {
            background-color: #f59b13;
            display: inline-block;
            cursor: pointer;
            color: #ffffff;
            font-family: Arial;
            font-size: 26px;
            font-weight: bold;
            padding: 23px 18px;
            text-decoration: none;
        }

        .myButton:hover {
            background-color: #ffc533;
        }

        .myButton:active {
            position: relative;
            top: 1px;
        }

        .passwd_box {
            height: 35px;
        }

        .id_box {
            height: 35px;
        }

        .cert_link {}
    </style>
</head>

<body style="text-align: center; align-content: center">

    <div style="overflow:hidden; height:auto; width: auto; text-align: center">
        <form id="form1" runat="server">

            <table>
                <tr>
                    <td>
                        <div style="overflow:hidden; height:auto; padding: 12px; background-color: #666666; float: left; ">
                            <table>

                                <tr>
                                    <td><a href="cert.html"><img src="/resources/imgs" width="100" height="100"></a></td>
                                    <td><a class="cert_link" href="cert.html">공인인증서 로그인</a></td>
                                </tr>

                            </table>
                        </div>
                    </td>
                    <td>
                        <div style="overflow:hidden; padding-top: 20px;padding-bottom: 20px; padding-left: 10px; padding-right: 10px ;background-color: #666666; ">
                            <table style="vertical-align:middle">

                                <tr>
                                    <td rowspan="2"> <input class="myButton" type="submit" value="로그인"></td>
                                    <td> <input class="id_box" type="text"></td>
                                </tr>
                                <tr>
                                    <td><input class="passwd_box" type="password"></td>
                                </tr>


                            </table>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"> <a href="findpasswd">비밀번호 찾기</a> | <a href="join">회원가입</a>

                    </td>
                </tr>
            </table>





        </form>


    </div>


</body></html>
