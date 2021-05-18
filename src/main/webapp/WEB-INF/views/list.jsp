<html>

<body>
<h2>회원 리스트</h2>
	<table border="1" align="center">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>성별</th>
			<th>이름</th>
			<th>휴대전화</th>
			<th>메일</th>
		</tr>
		<c:forEach items="${memberlist }" var="memberlist">
			<tr>
				<td>${memberlist.id }</td>
				<td>${memberlist.pwd }</td>
				<td>${memberlist.sex }</td>
				<td>${memberlist.name }</td>
				<td>${memberlist.hp }</td>
				<td>${memberlist.mail }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>