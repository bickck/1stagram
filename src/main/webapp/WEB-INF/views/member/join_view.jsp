<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style type="text/css">
body {
	margin: 0;
	height: 100%;
	background: #f9f9f9;
}

#Logo {
	width: 240px;
	height: 44px;
}

#header {
	padding-top: 62px;
	padding-bottom: 20px;
	text-align: center;
}

#wrapper {
	position: relative;
	height: 100%;
}

#content {
	position: absolute;
	left: 50%;
	transform: translate(-50%);
	width: 460px;
}

/* 입력폼 */
input:focus {
	outline: none;
}

h3 {
	margin: 19px 0 8px;
	font-size: 14px;
	font-weight: 700;
}

.box {
	display: block;
	width: 100%;
	height: 51px;
	border: solid 1px #dadada;
	padding: 10px 14px 10px 14px;
	box-sizing: border-box;
	background: #fff;
	position: relative;
}

.int {
	display: block;
	position: relative;
	width: 100%;
	height: 29px;
	border: none;
	background: #fff;
	font-size: 15px;
}

input {
	
}

.box.int_id {
	padding-right: 110px;
}

.box.int_pass {
	padding-right: 40px;
}

.box.int_pass_check {
	padding-right: 40px;
}

#bir_wrap {
	display: table;
	width: 100%;
}

#bir_yy {
	display: table-cell;
	width: 147px;
}

#bir_mm {
	display: table-cell;
	width: 147px;
	vertical-align: middle;
}

#bir_dd {
	display: table-cell;
	width: 147px;
}

#bir_mm, #bir_dd {
	padding-left: 10px;
}

select {
	width: 100%;
	height: 29px;
	font-size: 15px;
	background-size: 20px 8px;
	-webkit-appearance: none;
	display: inline-block;
	text-align: start;
	border: none;
}

/* 버튼 */
.btn_area {
	margin: 30px 0 91px;
}

#btnJoin {
	width: 100%;
	padding: 21px 0 17px;
	border: 0;
	cursor: pointer;
	color: #fff;
	background-color: #00aeff;
	font-size: 20px;
	font-weight: 400;
}
</style>

</head>
<body>
	
	<div id="header">
            <a href="mainpage" target="_blank"><img src="..//image/1stagram.jpg" id="Logo"></a>
    </div>
    
	<div id="wrapper">
		<div id="content">

			<div>
				<h3>
					<label for="id">아이디</label>
				</h3>
				<span class="box int_id"> <input type="text" id="id"
					class="int" placeholder="email 입력">
				</span>
			</div>

			<div>
				<h3>
					<label for="pswd1">비밀번호</label>
				</h3>
				<span class="box int_pass"> <input type="text" id="pswd"
					class="int" maxlength="20" placeholder="비밀번호 입력"></span>

			</div>

			<div>
				<h3>
					<label for="name">이름</label>
				</h3>
				<span class="box int_name"> <input type="text" id="name"
					class="int" maxlength="20" placeholder="이름 입력">
				</span>
			</div>

			<div>
				<h3>
					<label for="yy">생년월일</label>
				</h3>

				<div id="bir_wrap">
					
					<div id="bir_yy">
						<span class="box"> <input type="text" id="yy" class="int"
							maxlength="4" placeholder="년(4자)">
						</span>
					</div>

					<div id="bir_mm">
						<span class="box"> <select id="mm">
								<option>월</option>
								<option value="01">1</option>
								<option value="02">2</option>
								<option value="03">3</option>
								<option value="04">4</option>
								<option value="05">5</option>
								<option value="06">6</option>
								<option value="07">7</option>
								<option value="08">8</option>
								<option value="09">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
						</select>
						</span>
					</div>

					<div id="bir_dd">
						<span class="box"> <input type="text" id="dd" class="int"
							maxlength="2" placeholder="일">
						</span>
					</div>

				</div>
			</div>

			<div>
				<h3>
					<label for="gender">성별</label>
				</h3>
				<span class="box gender_code"> <select id="gender"
					class="sel">
						<option>성별</option>
						<option value="M">남자</option>
						<option value="F">여자</option>
				</select>
				</span>
			</div>

			<div>
				<h3>
					<label for="address">주소</label>
				</h3>
				<span class="box int_address"> <input type="text"
					id="address" class="int" placeholder="주소 입력">
				</span>
			</div>

			<div class="btn_area">
				<button type="button" id="btnJoin">
					<span>가입하기</span>
				</button>
			</div>
		</div>
	</div>

</body>
</html>
