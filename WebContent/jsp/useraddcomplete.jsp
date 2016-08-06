<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>ユーザ追加完了画面</title>
</head>
<body>
<table border=1>
<tr>
	<th>ID</th>
	<th>${emp_dto.id}</th>
</tr>
<tr>
	<th>氏名</th>
	<th>${emp_dto.name}</th>
</tr>
</table>
<% session.removeAttribute("emp_dto") ;%>
<br>
<form action ="/Tabilog/control" method ="POST">
	<input type = "hidden" name="action" value="menu">
	<input type = "submit" value="メニューに戻る">
</form>
</body>
</html>