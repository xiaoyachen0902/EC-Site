<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>商品詳細:${foodsdetail.foodname}</title>
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
	
	<div align="center">
	<br><br><br><br>
	<h1>商品詳細:${foodsdetail.foodname}</h1>
	
	 
	商品名: ${foodsdetail.foodname}<br>
	価格: ${foodsdetail.foodprice}円<br>
	商品説明: ${foodsdetail.comment}<br>
	<img src ="${foodsdetail.foodpath}" width="300" alt= "${foodsdetail.foodname}"/>
	
	
	<form action="BuyprocessServlet" method="post">
	<br>
   購入数量 : <input type="number" name="buyquantity" min="1" max="50" required>
   

	<input type="hidden" name="foodsprice" value="${foodsdetail.foodprice}"> <br>
	<input type="hidden" name="foodsname" value="${foodsdetail.foodname}"> <br>
		<input class="btn btn-primary" type="submit" value="購入手続きへ">
	</form>
	<br>
	<form action="ToppageServlet# method="post">
		<input class="btn btn-primary" type="submit" value="TOPへ戻る">
		
	</form>
	<br>
	<input class="btn btn-primary" type="button" name="Submit" onclick="javascript:history.back(-1);" value="検索結果に戻る"></div>
    	<style>
	html {
  height: 100%;
}
body {
  min-height: 100%;
  display: flex;
  flex-direction: column;
}
.content {
  flex: 1;
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