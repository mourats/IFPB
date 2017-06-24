<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Consultando Vólume</title>
	</head>
	<body>
		<form action="ConsultaServlet" method="post">
			Título:<input type="text" name="titulo">
			<br>
			Autor:<input type="text" name="autor">
			<br>
			<input type="submit">
		</form>
	</body>
</html>