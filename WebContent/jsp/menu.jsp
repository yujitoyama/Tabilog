<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>トップメニュー画面</title>
</head>
<body>
	<li>ユーザ登録</li>
		<form action="/Tabilog/control" method="post">
		<input type="hidden" name="action" value="add">
		<input type="submit" value="登録">
		</form>

	<li>ユーザ検索</li>
		<form action="/Tabilog/control" method="post">
		<input type="hidden" name="action" value="selectUser">
		<input type="submit" value="検索">
		</form>

	<li>ログアウト</li>
		<form action="/Tabilog/control" method="post">
		<input type="hidden" name="action" value="logout">
		<input type="submit" value="ログアウト">
		</form>

</body>
</html>