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

<title>豊田農園会員登録</title>
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
		</nav>
	</header>

	<div class="container contentpadmar"></div>
		<div class="row">
			<div class="col-md-12" style="padding: 0">
				<div class="card border-0">
					<div class="card-body text-center">
						<p class="card-text">以下のフォームに必要事項をご入力し、確認ボタンを押してください。</p>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="offset-md-2 col-md-8">
				<div class="card">
					<div class="card-header">会員登録</div>
					 
	<form action ="accountregisinfo" method="post">
			
					<div class="card-body">
						<div class="form-group row">
							<label class="control-label col-md-4">ユーザID</label> <input
								class="form-control col-md-8 " type="text" id="newid" name="newid" pattern="^[0-9A-Za-z]+$" placeholder="IDは半角英数字で入力してください"required/>
						</div>
						<div class="form-group row">
							<label class="control-label col-md-4">パスワード</label> <input
								class="form-control col-md-8" type="password" id="password"
								name="password" pattern="[a-zA-Z0-9!-/:-@\[-`{-~]*"placeholder="パスワードは半角英数字記号で入力してください"required/>
						</div>


						<div class="form-group row">
							<label class="control-label col-md-4">名前（スペースなし）</label> <input
								class="form-control col-md-8" type="text" id="fullname"
								name="fullname" placeholder="名前を入力してください"required/></div>
								
						<div class="form-group row">
							<label class="control-label col-md-4">E-MAIL</label> <input
								class="form-control col-md-8" type="email" id="eMail"
								name="eMail"  placeholder="メールアドレスを入力してください"required>
						</div>
						
						<div class="form-group row">
							<label class="control-label col-md-4">郵便番号</label> <input
								class="form-control col-md-8" type="text" id="postalcode"
								name="postalcode" pattern="\d{3}-?\d{4}" placeholder="郵便番号（ハイフンなし）を入力してください"required/>
						</div>
						
						<div class="form-group row">
							<label class="control-label col-md-4">住所</label>
							<textarea class="form-control col-md-8" id="address"
								name="address" placeholder="住所を入力してください"required></textarea>
						</div>
						
						
						
						<div class="form-group row">
							<label class="control-label col-md-4">電話番号</label> <input
								class="form-control col-md-8" type="tel" id="phoneNumber"
								name="phoneNumber" placeholder="電話番号を入力してください"required>
						</div>
						
						<div class="form-group">
							<input type="submit" value="確認" class="btn btn-primary">
						</div> </form>
						

					</div>
				</div>
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