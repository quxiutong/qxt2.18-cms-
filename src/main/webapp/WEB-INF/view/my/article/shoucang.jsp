<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>收藏列表</title>
<link href="/resource/css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<div class="container-fluid">

		<div>
				<table class="table border">
				<c:forEach items="${info.list}" var="s">
					<tr>
						<th>
						<a href="/my/article/article?id=${s.id }" target="_blank" >${s.text}</a>
						<br>
						${s.created}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/my/article/delshou?id=${s.id}">删除</a>
						</th>
					</tr>
				</c:forEach>
				</table>
		</div>
		<jsp:include page="/WEB-INF/view/common/pages.jsp" />


	</div>
</body>
</html>