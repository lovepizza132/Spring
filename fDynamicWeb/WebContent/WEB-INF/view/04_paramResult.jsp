<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${empty sessionScope.login }">
	로그인 실패
</c:if>

${sessionScope.login }님 로그인 성공

<hr/>

<%-- ${member.id }로그인 성공<br/> --%>
<%-- ${vo.id }로그인 성공<br/> --%>


</body>
</html>