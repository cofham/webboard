<html>

<head>
	<script type="text/javascript">
		function checkValue(){
			console.log("checkValue");
			if(!document.joinInfo.join_id.value){
				alert("아이디를 입력해주세요.");
				return false;
			}
			
			if(!document.joinInfo.join_pwd.value){
				alert("비밀번호를 입력해주세요.");
				return false;
			}
			
			if(document.joinInfo.join_pwd.value != document.joinInfo.join_pwd_confirm.value){
				alert("비밀번호를 동일하게 입력해주세요.");
				return false;
			}
		}
	</script>
	
</head>
<body>
<h2>회원 가입</h2>
<form action="<c:url value='/login/join.do' />" method="post" name="joinInfo" onsubmit="return checkValue()">
	<label>아이디: </label>
	<input type="text" name="join_id"/><br>
	
	<label>비밀번호: </label>
	<input type="password" name="join_pwd"/><br>
	
	<label>비밀번호 확인: </label>
	<input type="password" name="join_pwd_confirm" placeholder="비밀번호를 입력하세요."/><br>
	
	<label>성별: </label>
	<input type="radio" name="join_sex" value="man" checked/><label>man</label>
	<input type="radio" name="join_sex" value="woman"/><label>woman</label><br>
	
	<label>이름: </label>
	<input type="text" name="join_name" placeholder=""/><br>
	
	<label>전화번호: </label>
	<select name="join_hp_1">
		<option value="010">010</option>
		<option value="011">011</option>
		<option value="016">016</option>
		<option value="017">017</option>
		<option value="018">018</option>
		<option value="019">019</option>	
	</select>
	<input type="text" name="join_hp_2" size=4 maxlength=4 />
	<input type="text" name="join_hp_2" size=4 maxlength=4 /><br>
	
	<label>이메일: </label>
	<input type="text" name="join_mail_1">@
	<select name="join_mail_2">
		<option>naver.com</option>
	</select> 
	<br>
	<input type="submit" value="가입">
</form>
</body>
</html>