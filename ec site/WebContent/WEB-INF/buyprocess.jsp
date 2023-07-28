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
<title>購入情報入力画面</title>
</head>
<meta charset="UTF-8">
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
 if ("login".equals(msg)){ %>					
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
<body >
	<br>
	<br>
	<br>
	 <%
	 if ("notlogin".equals(msg)){ %>
	 <h2 style = "text-align: center">情報を入力するためログインしてください。<br>
	 会員を持っている方、<a  href ="./LoginServlet" >ログインはこちら</a><br>
	 会員登録を行いたい場合は、<a href ="./RegisterServlet">会員登録はこちら</a></h2>
 <% }%>
 <% if ("login".equals(msg)){  %>

    <div align="center">
    <div class=sample>
	<h3>購入情報入力画面</h3><br>
	<h4>受け取り人情報</h4>(お届け先を変更したいの場合、修正してお願いします)
	
	
	<form action="BuyingServlet" method="post">
    <br>
	姓名:<input  class="form-control col-md-7" type="text" name="name" value="${account.accountname}" style="text-align: center"required>
	EMAIL:<input class="form-control col-md-7" type="email" name="email" value="${account.accountmail}"style="text-align: center" required>
	<br>

	<h4>届け先住所</h4>
	郵便番号:
	<input class="form-control col-md-7 " type="text" name="postno" value="${account.accountpostno}" style="text-align: center"required>
	 住所:
	<input class="form-control col-md-7" type="text" name="address" value="${account.accountaddress}" style="text-align: center"required>
	 電話番号:
	<input class="form-control col-md-7" type="text" name="phoneno" value="${account.phoneno}" style="text-align: center"required>
    
	
<br>
	<h4>選択した商品</h4>
	商品: ${foodsname}<br>
	価格: ${foodsprice}円<br>
	数量: ${buyquantity}<br>
	消費税：${taxprice1}<br>
	商品金額(税込):<b>${totalprice1}円 </b><br>
	※別途送料がかかります(地域によって送料は異なります)<br>
	※2,000円以上のお買い上げで送料無料<br>
	

	
	
	
	届く地域を選ぶ：   
   <select name="location" required>
 <option value="" selected hidden>選択してください</option>
   <option value="1">長野 +300円</option>
   <option value="2">北海道 +640円</option>
   <option value="3">東北：青森 岩手 宮城 秋田 山形 福島 +430円</option>
   <option value="3">関東：茨城 栃木 群馬 埼玉 千葉 東京 神奈川 山梨 +430円</option>
   <option value="3">信越：新潟 +430円</option>
   <option value="3">北陸：富山 石川 福井 +430円</option>
   <option value="3">東海：静岡 愛知 岐阜 三重 +430円</option>
   <option value="4">奈良 滋賀 京都 大阪 兵庫 和歌山 +480円 </option>
   <option value="5">中国：岡山 広島 鳥取 島根 山口 +560円 </option>
   <option value="5">四国：徳島 香川 愛媛 高知 +560円  </option>
   <option value="6">福岡 佐賀 長崎 熊本 大分 宮崎 鹿児島 +640円  </option>
   <option value="7">沖縄 +720円</option>
   </select>
<br>
	

<input type="hidden" name="foodssprice" value= " ${foodsprice}"> 
<input type="hidden" name="foodssname" value="${foodsname}"> 
<input type="hidden" name="buyquantity" value="${buyquantity}"> 
<input type="hidden" name="totalprice" value="${totalprice1}"> 
<input type="hidden" name="taxprice" value="${taxprice1}"> 
<br>
<div align="center">
	<input  class="btn btn-primary"type="submit" value="購入確認"></div>
		</form> <br>
		 <% }%>
 <% String modori = (String)request.getAttribute("modori");%>
<%  if ("modori".equals(modori)){ %>
 
<div align="center">
<input class="btn btn-primary" type="button" name="Submit" onclick="javascript:history.go(-4);" value="キャンセル"></div>
<% }else{ %>    
<div align="center">
<input class="btn btn-primary" type="button" name="Submit" onclick="javascript:history.back(-1);" value="キャンセル"></div>
<% } %>
</div>
</div>
	<style>
.footer {
  grid-row-start: 2;
  grid-row-end: 3;
}
.sample {
	text-align: center;
	text-align: left;
	display: inline-block;
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