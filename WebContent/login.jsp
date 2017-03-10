<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录页</title>
<style type="text/css">
</style>
</head>
<body>
<form action="./LoginServlet" style="margin-top: 10%;">
	<table border="1" align="center">
		<tr>
			<td colspan="2" align="center">登陆</td>
		</tr>
		<tr>
			<td>姓名：</td><td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>密码：</td><td><input type="password" name="password"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="reset" value="清空"/>
				<input type="submit" value="提交"/>
			</td>
		</tr>
		<tr></tr>
	</table>
</form>
</body>
</html>