<html>

<body>
<h2>회원 리스트</h2>
	<table>
		<c:forEach items="${memberlist }" var="memberlist">
			<tr>
				<td>아이디</td>
				<td>${memberlist.id }</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>${memberlist.pwd }</td>
			</tr>
			<tr>
				<td>성별</td>
				<td>${memberlist.sex }</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>${memberlist.name }</td>
			</tr>
			<tr>
				<td>휴대전화</td>
				<td>${memberlist.hp }</td>
			</tr>
			<tr>
				<td>메일</td>
				<td>${memberlist.mail }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>