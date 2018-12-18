<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create An Account</title>
</head>
<body bgcolor=#DD28>
	<form action="create.do" method="post">
		<h4>
			Full Name : <input type="text" name="fullname" />
		</h4>
		<h4>
			Email-ID : <input type="text" name="emailID" />
		</h4>
		<h4>
			Password : <input type="password" name="password" />
		</h4>
		<input type="checkbox">Accept all terms & conditons.</br>
		</br> <input type="submit" value="Register">
	</form>
</body>
</html>