<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellspacing="0" cellpadding="5">
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>密码</th>
			<th>性别</th>
			<th>业余爱好</th>
			<th>学历</th>
			<th>地址</th>
			<th>生日</th>
			<th>工资</th>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.password}</td>
				<td>${user.sex}</td>
				<td>${user.hobby}</td>
				<td>${user.education}</td>
				<td>${user.address}</td>
				<td>${user.birthday}</td>
				<td>${user.salary}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>