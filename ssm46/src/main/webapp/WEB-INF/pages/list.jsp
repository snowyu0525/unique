<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/account/toSave">添加账户</a>
	<hr>
	<table>
		<thead>
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>金额</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="account">
				<tr>
					<td>${account.id }</td>
					<td>${account.name }</td>
					<td>${account.money }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>