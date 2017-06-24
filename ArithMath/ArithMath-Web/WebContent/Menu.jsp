<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel='shortcut icon' href="imagens/icone.jpg" />
<title>Protótipo - Menu</title>

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
}

h2 {
	font-family: arial;
}

body {
	background-image: url("imagens/back.jpg");
}
</style>

</head>
<body>
	<div id="geral">
		<h2>MENU DO JOGO</h2>
		<p>
		<p>
			<a href="MenuServlet.do"><img src="imagens/Iniciar.fw.png"
				width="100" height="50"></a>
		<p>
			<a href=""><img src="imagens/Detalhes.fw.png" width="160" height="50"></a>
		<p>
	</div>
</body>
</html>