<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  c:if. c:forEach, fmt:formatDate を利用可能とするためのもの --> 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 <link rel="stylesheet" type="text/css" href="resulttable.css">

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/common.css">
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<html>
<head>
<meta charset="UTF-8">
<title >商品検索結果</title>
</head>
<body>
<header>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark"
			style="width: 100%; position: fixed; top: 0; z-index: 99;">
			<div class="container" style="font-size: 18px">
				<a class="navbar-brand" style="font-size: 32px" href="./ToppageServlet">豊田農園</a>
				<div class="collapse navbar-collapse" id="navbar">
					<ul class="navbar-nav mr-auto">
					</ul>
					<ul class="navbar-nav">
 <% String msg = request.getParameter("msg");
 if ("logined".equals(msg)){ %>					
					<li class="nav-item active"><a class="nav-link" href="./LogoutServlet">ログアウト</a></li>
					<li class="nav-item active"><a class="nav-link" href="./UserinfoServlet">会員情報照会</a></li>
				    <li class="nav-item active"><a class="nav-link" href="./FoodResearchServlet">検索</a></li>
					
					<% }%>
<%  if ("notlogin".equals(msg)){ %>						
					<li class="nav-item active"><a class="nav-link" href="./LoginServlet">ログイン</a></li>
					<li class="nav-item active"><a class="nav-link" href="./FoodResearchServlet">検索</a></li>
		<% }%>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<br><br><br><br>
	<h1 style = "text-align: center">商品検索結果一覧</h1>

 <div align="center"> 
		<table class="style-table" style = "text-align: center" border = "1" colour: #dddddd;>
		<tr>
				<th>商品名</th><th>商品画像</th><th>価格</th>
			<tr>
		<c:forEach var="item" items="${foodlist}">
			
				<td><a href="FoodDetailServlet?foodid=${item.foodid}">${item.foodname}</a></td>
				<td><img src ="${item.foodpath}" width="80" alt= "${item.foodname}"/></td>
				<td>${item.foodprice}円</td>
		
			</tr>
		</c:forEach>
		</table></div>

	<form action="FoodResearchServlet?back=back" method="post">
	<br><div align="center"> 	<input class="btn btn-primary" type="submit" value="検索画面へ戻る"></div><br>
	</form>
	<form action="ToppageServlet" method="post">
	<div align="center"> 	<input class="btn btn-primary" type="submit" value="TOPへ戻る"></div>
	</form>
		<style>
	html {
  height: 100%;
}
.footer {
  grid-row-start: 2;
  grid-row-end: 3;
}
    </style>
<footer>

		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
			integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
			crossorigin="anonymous"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
			integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
			crossorigin="anonymous"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
			integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
			crossorigin="anonymous"></script>
	</footer>
	
</body>
</html>