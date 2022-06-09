<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>프로필 편집</title>
<style type="text/css">

</style>

</head>
<body>
	
	<form id="profileUpdate" action="/user/update" method="post" enctype="multipart/form-data">
                <input type="hidden" name="id" id="id" >

                <div class="content-1">
                    <div class="item__title">프로필 사진 변경</div>
                    <div class="item__input">
                        <input class="input_update" type="file" name="profileImgUrl" id="profileImgUrl">
                    </div>
                </div>
                <div class="content-01">
                    <div class="item__title">이메일</div>
                    <div class="item__input">
                        <input class="input_update" type="text" name="email" id="email" readonly="readonly"/>
                    </div>
                </div>
                <div class="content-2">
                    <div class="item__title">이름</div>
                    <div class="item__input">
                        <input class="input_update" type="text" name="name" id="name" placeholder="이름" required="required" />
                    </div>
                </div>
                <div class="content-3">
                    <div class="item__title">비밀번호</div>
                    <div class="item__input">
                        <input class="input_update" type="password" name="password" id="password" placeholder="비밀번호" required="required"/>
                    </div>
                </div>
                <div class="content-4">
                    <div class="item__title">주소</div>
                    <div class="item__input">
                        <input class="input_update" type="text" name="address" id="address" placeholder="주소" required="required"/>
                    </div>
                </div>


                <div class="content-5">
                    <div class="item__input">
                        <button id="btn_update">제출</button>
                    </div>
                </div>
				<div class="content-6">
                    <div class="item__input">
                        <button id="btn_secession">계정 탈퇴</button>
                    </div>
                </div>
            </form>
	
</body>
</html>