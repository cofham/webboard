<html>
<body>
	<div class="container">
		<form method="post" action="login/login.do" class="loginForm">
			<div>
				<label>아이디</label>
				<input type="text" id="login_id"/><br>
				<label>비밀번호</label>
				<input type="password" id="login_pwd"/><br>
			</div>
			<input type="submit" value="로그인">
		</form>
		<a href="<c:url value='/login/joinPage' />">회원가입</a>
	</div>
</body>
</html>
