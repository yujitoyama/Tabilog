<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ユーザ追加画面</title>
</head>
<body>
<form action="/Tabilog/control" method="post">
<table border=1>
<tr>
	<th>ユーザ名</th>
	<th><input type="text" name="name"></th>
</tr>
<tr>
	<th>パスワード</th>
	<th><input type="password" name="password"></th>
</tr>
</table>
<input type="hidden" name ="action" value="regist">
<input type="submit" value="追加">
</form>
</body>
</html>