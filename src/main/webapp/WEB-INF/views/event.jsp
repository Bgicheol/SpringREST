<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/resources/employee/js/event.js" var="js1"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이벤트 페이지</title>
</head>
<body>
	<button id="ajax-btn1">AJax Test1</button>
	<button id="ajax-btn2">AJax Test2 (JSON Data)</button>
	
	<div id="user">
	<c:forEach items="${employees}" var="emp" >
		<div id="${emp.employee_id }">
			${emp.first_name} ${emp.last_name}
			(${emp.phone_number}/${emp.hire_date})
		</div>	
	</c:forEach>
	</div>
	
	<script src="${js1}"></script>
	
</body>
</html>