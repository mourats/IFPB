<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel='shortcut icon' href="imagens/icone.jpg" /> 
<title>Protótipo - Login</title>

<style type="text/css">
#geral {
	position: absolute;
	top: 50%;
	left: 50%;
	width: 500px;
	height: 300px;
	margin-left: -250px;
	margin-top: -150px;
	text-align: center;
	font-family: arial;
}

body {
	background-image: url("imagens/back.jpg");
}

table, td, th {
	border: 1px solid;
	background-image: url("imagens/back.jpg");
	padding: 8px;
}
</style>

</head>
<body>
	<div id="geral">
		<table cellspacing="5">
			<tr>
				<td>
					<img src="imagens/Logo.fw.png" width="310" height="200">
				</td>
				<td>
				<form action="LoginServlet.do" method="post">
						<h5>
							<img src="imagens/login.png" width="25" height="25">
							Usuario: <input type="text" name="name" size="10">
						</h5>
						<p>
						<h5>
							<img src="imagens/key.png" width="25" height="25"> 
							Senha: <input type="password" name="senha" size="10">
						</h5>
						<p>
							<input type="submit" value="LOGIN" name="logar">
						<p>
						</form>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>