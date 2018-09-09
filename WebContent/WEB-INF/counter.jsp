<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<style >
	.container{
	display:block;
	margin-left: 30%;
	margin-top:100px;
	}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="" method ="post">
			<button type ="submit"> Click Me!</button>
		</form><br>
		<h2>
			<c:out value="${str}"/>
		</h2>
	</div>
</body>
</html>