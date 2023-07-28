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

<title>登録が完了しました</title>
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
						<li class="nav-item active"><a class="nav-link" href="./LoginServlet">ログイン</a></li>
						<li class="nav-item active"><a class="nav-link" href="./FoodResearchServlet">検索</a></li>
					</ul>
				</div>
			</div>
		</nav></header>
<br>
<br>
<br>
<br>
<br>
<h1>登録完了</h1><br>
会員登録されました！<br>
会員ID：${newid}<br>
姓名：${fullname }<br>
EMAIL：${eMail}<br>
郵便番号：${postalcode}<br>
住所：${address}<br>
電話番号：${phoneNumber}<br>

<form action="ToppageServlet" method="post">
  <div align="center">      <input class="btn btn-primary" type="submit"value="トップへ戻る"></div></form>

<br>
  <form action="LoginServlet" method="post">
  <div align="center">      <input class="btn btn-primary" type="submit"value="ログインへ"></div></form>
<body>

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