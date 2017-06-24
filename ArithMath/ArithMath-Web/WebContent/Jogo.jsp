<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel='shortcut icon' href="imagens/icone.png" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Protótipo - ArithMath</title>
<style type="text/css">
#recorde {
	top: 10%;
	left: 75%;
	position: absolute;
}

#geral {
	position: absolute;
	top: 50%;
	left: 50%;
	width: 500px;
	height: 300px;
	margin-left: -250px;
	margin-top: -200px;
	text-align: center;
}

h2, h1, h4, h3 {
	font-family: arial;
}

body {
	background-image: url("imagens/back.jpg");
}

table, td, th {
	background-image: url("imagens/back.jpg");
	border: 3px solid black;
}

table {
	border-collapse: collapse;
	width: 100%;
}

td {
	height: 50px;
	vertical-align: bottom;
}
</style>
</head>
<body>
	<div id="recorde">
	<h3>SCORE: ${recorde}</h3>
	</div>
	<div id="geral">
		<img src="imagens/Logo.fw.png" width="350" height="170">
		<p>
		<h2>SOMA: ${soma}</h2>
		<form method="post" action="AvaliacaoServlet.do">
			<table border="3" cellspacing="8">
				<tr>
					<c:forEach varStatus="contador" var="valor" items="${numeros}">
						<td background="imagens/back.png"><input type="checkbox"
							name="num${valor}">
							<h2>${valor}</h2></td>
					</c:forEach>
			</table>
			<p>
				<input type="submit" name="enviar" value="ENVIAR">
		</form>
	</div>
</body>
</html>
