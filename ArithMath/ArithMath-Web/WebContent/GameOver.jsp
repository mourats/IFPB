<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel='shortcut icon' href="imagens/icone.png" />
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
	border: 1px solid #707070;
	background-image: url("imagens/back.png");
	padding: 8px;
}
</style>
<title>Protótipo - Game Over</title>
</head>
<body>
	<div id="geral">
			<img src="imagens/GameOver.fw.png" width="350" height="120">
			<p>
			<h4>VOCÊ ERROUUUUU!</h4>
			<audio controls autoplay> <source src="imagens/errou.mp3"
				type="audio/mpeg"> Your browser does not support the audio
			element. </audio>
			<p>
			<a href="Menu.jsp"><img src="imagens/Restart.fw.png" width="160" height="50"></a>
	</div>
</body>
</html>