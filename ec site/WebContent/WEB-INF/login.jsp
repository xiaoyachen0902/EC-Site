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
<title>ログイン</title>
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark"
			style="width: 100%; position: fixed; top: 0; z-index: 99;">
			<div class="container" style="font-size: 18px">
				<a class="navbar-brand" style="font-size: 32px"
					href="./ToppageServlet">豊田農園</a>
				<div class="collapse navbar-collapse" id="navbar">
					<ul class="navbar-nav mr-auto">
					</ul>
					<ul class="navbar-nav">

					</ul>
				</div>
			</div>
		</nav>
	</header>
	<br>
	<br>
	<br>
	<%String hikaku = request.getParameter("hikaku");%>
	<%String msg = request.getParameter("msg");%>
	
	<div align="center">
		<div class="row">
			<div class="offset-md-2 col-md-8">
				<div class="card">
					<div class="card-header">会員番号とパスワードを入力してください。</div>

		<form action="WelcomeServlet" method="post">
			<div class="card-body">
				<div class="form-group row">
					<label class="control-label col-md-4">ユーザID</label> <input
						class="form-control col-md-4 " type="text" name="userid" />
				</div>
				<div class="form-group row">
					<label class="control-label col-md-4">パスワード</label> <input
						class="form-control col-md-4" type="password" name="password">
				</div>
				<input class="btn btn-primary" type="submit" value="ログイン">
	
		

	
	</div>
	</form>
	<%
	if ("notexist".equals(msg)) {
	%>
	<h2 style="font-size: 12pt; text-align: center; color: red">
		会員番号は存在しません</h2>
	<%
	}
	%>
	<%
	if ("invalid".equals(msg)) {
	%>
	<h2 style="font-size: 12pt; text-align: center; color: red">パスワードは間違っています。もう一度入力してお願いいたします。</h2>
	<%
	}
	%>
	<form action="ToppageServlet" method="post">

		<input class="btn btn-primary" type="submit" value="トップへ戻る"><br>
		</form>
	</div>
	</div>
	</div>
	
		<style>
	footer{
    position: absolute;/*←絶対位置*/
    bottom: 0; /*下に固定*/
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