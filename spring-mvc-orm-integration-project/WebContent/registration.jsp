<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body bgcolor="grey">
	<pre>
		<form action="reg.do" method="post">
			Username : <input type="text" name="username"><br></br>
			Password : <input type="password" name="password"><br></br>
			Mobile No. : <input type="text" name="mobileNumber"><br></br>
			Email-Id. : <input type="text" name="emailID"><br></br>
			Current Address : <input type="textarea" name="caddress"><br></br>
			Permanent Address : <input type="text" name="paddress"><br></br>
			<input type="submit" value="Register" />
		</form>
	</pre>

</body>
</html>