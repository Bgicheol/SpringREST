<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Add Page</title>
	<!--  JQuery CDN -->
	<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
</head>
<body>
	<h3># 새 사원 추가해보기</h3>
	
	<button id="add">추가!(POST)</button>
	<button id="modi">수정!(PUT)</button>
	
	<button id='get2'>서버로 GET 요청보내기(JQuery, Ajax)</button>
	<button id='add2'>서버로 POST 요청보내기(JQuery, Ajax)</button>
	<button id='modi2'>서버로 PUT 요청보내기(JQuery, Ajax)</button>
	
	<script src="/springrest/assets/employee/js/addEmp.js"></script>
	<script src="/springrest/assets/employee/js/addEmpJquery.js"></script>
</body>
</html>