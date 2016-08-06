<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ログイン画面</title>
</head>
<body>
IDとパスワードを入力してください
<form action="/Tabilog/control" method="post">
	<table>
		<tr>
			<td>ID:</td>
			<td><input type="text" name="EMPID"></td>
		</tr>
		<tr>
			<td>パスワード:</td>
			<td><input type="password" name="PASSWORD"></td>
		</tr>
	</table>
	<input type="hidden" name="action" value="login">
	<input type="submit" value="送信">
</form>
</body>
</html>