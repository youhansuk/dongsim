<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>북 퀴즈</title>
</head>
<body>

<c:forEach var="dto" items="${List3}">
			<table border="0" width="800">
				<tr>
					<td>${dto.question}</td>
				    <td>${dto.answer}</td>
				</tr>
			</table>
		</c:forEach>
</body>
</html>