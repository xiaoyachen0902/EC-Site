<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@page import="dto.Order"%>
<%@page import="dao.orderDAO"%>
<%@ page import="java.util.List" %>
 <link rel="stylesheet" type="text/css" href="tablehistory.css">

<jsp:useBean id="date" class="java.util.Date"/>    
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
<meta charset="UTF-8">
<br><br><br><br><br><br><br>

<title>注文履歴照会</title>
</head>
<meta charset="UTF-8">
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
<body>
<div align="center"> 

  <h3>注文履歴照会</h3>
		<table class="style-table" style = "text-align: center" border = "1" colour: #dddddd;>	
	<c:forEach var="item" items="${orderlists}">
	<tr>
	<th>注文番号</th><th>注文日</th><th>注文商品</th><th>単価</th><th>数量</th><th>総計金額</th><th>届け先</th>
	<tr>
	<td> ${item.ordersid}</td> 
     <td><fmt:formatDate value="${item.orderdate}" pattern="yyyy/MM/dd HH:mm:ss" /></td> 
     <td>${item.orderfoodname}</td> 
     <td> ${item.ordersingleprice} 円</td> 
     <td> ${item.orderquantity}個</td> 
     <td> ${item.totalprice}円</td> 
     <td>  ${item.orderaddress}</td> 
	</c:forEach>
		
</table>       
      
      <br><button class="btn btn-primary" type=“button” onclick="location.href='ToppageServlet'">トップに戻る</button>
    </div>  
	<style>
			.sample {
	text-align: center;
	text-align: left;
	display: inline-block;
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