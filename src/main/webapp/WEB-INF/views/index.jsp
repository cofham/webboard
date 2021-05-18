<html>
<body>
	
	<div class="container">
		<form method="post" action="login/login.do" class="loginForm">
			<table>
				<tr>
					<td><label>아이디</label></td>
					<td><input type="text" id="login_id"/></td>
				</tr>
				<tr>
					<td><label>비밀번호</label></td>
					<td><input type="password" id="login_pwd"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="로그인"></td>
				</tr>
				<tr>
					<td><a href="<c:url value='/login/joinPage' />">회원가입</a></td>
				</tr>
			</table>
		</form>
		
		<a href="<c:url value='/selectDB.do' />">조회</a>
		
	</div>
</body>
</html>
