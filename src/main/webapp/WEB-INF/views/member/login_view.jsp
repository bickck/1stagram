<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style type="text/css">
body {
	background-color: #f9f9f9;
}

.contentsWrap {
	margin: 90px auto;
	max-width: 340px;
	border: none;
	padding: 20px;
	text-align: center;
}

.loginWindow {
	background-color: #fcfcfc;
	padding: 10px auto;
	border: 1px solid #dfdfdf;
	border-radius: 3px;
}

.loginWindow input {
	margin-bottom: 10px;
	background-color: #f5f5f5;
	height: 37px;
	padding: 10px 10px;
	box-sizing: border-box;
	border: 1px solid #eaeaea;
	border-radius: 4px;
}

.Login {
	height: 37px;
	margin-bottom: 10px;
	box-sizing: border-box;
	border: 0px;
	border-radius: 5px;
	color: #ffffff;
	font-size: 15px;
	font-weight: 700;
}

.ordinaryLogin {
	height: 37px;
	margin-bottom: 10px;
	box-sizing: border-box;
	border: 0px;
	border-radius: 5px;
	color: #ffffff;
	font-size: 15px;
	font-weight: 700;
}

.LoginColor {
	background-color: #00aeff;
}

.loginWindow * {
	width: 70%;
	margin-left: auto;
	margin-right: auto;
}

#Logo {
	margin: 40px auto 30px;
	max-width: 175px;
}

.inlineToBlock {
	display: block;
}

.Account {
	background-color: #fcfcfc;
	margin-top: 10px;
	padding: 15px;
	border: 1px solid #dfdfdf;
	border-radius: 3px;
}

.Account p {
	font-size: 14px;
	font-weight: 300;
	color: #333333;
}

.Account p a {
	font-weight: 600;
	color: #248ae3;
	text-decoration: none;
}
</style>
</head>
<body>

	<div class="contentsWrap">
		<div class="loginWindow">
			<img src="..//image/1stagram.jpg" alt="" id="Logo"> <input
				type="text" placeholder="이메일" class="inlineToBlock"> <input
				type="password" placeholder="비밀번호" class="inlineToBlock">
			<button class="inlineToBlock Login LoginColor">로그인</button>
		</div>
		<div class="Account">
			<p>
				계정이 없으신가요? <a href="#">가입하기</a>
			</p>
		</div>
	</div>

</body>
</html>