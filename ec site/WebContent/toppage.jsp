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

<title>豊田農園</title>
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
	<!-- トップ画像 -->
	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-12 cover-img"
				style="background-image: url('./img/top.jpg');">
				<div class="cover-text text-center">
					<div class="top-title">
						<p style="color: #fff;">豊田農場
						<p>
						<div class="top-discription">~美味しさと笑顔をあなたの食卓にお届けします~</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- コンテンツ -->


	<div class="container contentpadmar">
		<div class="row">
			<div class="col-md-12" style="padding: 0">
				<div class="card border-0">
					<div class="card-body text-center" style="margin-bottom: 50px;">
						<h4 class="card-title">豊田農園について</h4>
						<p class="card-text">
							長野県北安曇郡松川村で、1977年より地域に根差した農業を営んでいます。<br>
							目指しているのは、食べた人の体になり心になる、健康な野菜づくり。<br>
							たくさんの種類の野菜を露地で農薬を使わずに育て、直接お客さまにお届けします。
						</p>
					</div>
				</div>
			</div>
		</div>
		
		
				<% 
 if ("logined".equals(msg)){ %>	

					<div align = center class="card-body">
						<img  src="./other/004.jpg" width="300" alt="Card image cap">
						<h2 class="card-title">商品検索</h2>
						<p class="card-text"></p>
						<p class="card-text">
							<small class="text-muted">新鮮なお野菜、みずみずしい果物、栄養たっぷりのジュース！ <br>
							</small>
						</p>
						<a class="btn btn-primary" href ="./FoodResearchServlet" role="button">検索はこちら</a>
					</div>
 <% }%>		
 <%  if ("notlogin".equals(msg)){ %>
 <div class="row">
			<div class="card-deck" style="margin: 10px -15px;">
				<div class="card">
					<img class="card-img-top" src="./other/002.jpg"
						alt="Card image cap">	
					<div class="card-body">
						<h4 class="card-title">ログイン</h4>
						<p class="card-text">
							<small class="text-muted">商品購入また商品検索には会員ログインが必要です。まずはログインをお願いします。</small>
						</p>
					<a class="btn btn-primary"  href ="./LoginServlet" role="button">ログインはこちら</a>
					</div>
				</div>
				<div class="card">
					<img class="card-img-top" src="./other/003.jpg"
						alt="Card image cap">
					<div class="card-body">
						<h4 class="card-title">会員登録</h4>
						<p class="card-text">
							<small class="text-muted">会員登録はまだの方、まずは会員登録をお願いします。
								<br>
							</small>
						</p>
						<a class="btn btn-primary" href="./RegisterServlet" role="button">登録はこちら</a>
					</div>
				</div>
				<div class="card">
					<img class="card-img-top" src="./other/004.jpg"
						alt="Card image cap">
					<div class="card-body">
						<h4 class="card-title">商品検索</h4>
						<p class="card-text"></p>
						<p class="card-text">
							<small class="text-muted">新鮮なお野菜、みずみずしい果物、栄養たっぷりのジュース！ <br>
							</small>
						</p>
						<a class="btn btn-primary" href ="./FoodResearchServlet" role="button">検索はこちら</a>
					</div>
				</div>
			</div>
		</div>
		 <% }%>
		<div class="row">
			<div class="col-md-12" style="padding: 0">
				<div class="card border-0">
					<div class="card-body text-center">
						<h7 class="card-title">アクセス情報</h7>
						<p class="card-text">
							住所： 長野県北安曇郡松川村西原<br> 電話番号： 0261-XX-XXXX<br>
							Eメールアドレス：toyodanouen@xxxxx.jp<br>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
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