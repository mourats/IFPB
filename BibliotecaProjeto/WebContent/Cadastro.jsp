<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cadastrando novo volume</title>
	</head>
	<body>
		<form action="CadastroServlet" method="post">
			T�tulo:<input type="text" name="titulo">
			<br>
			Autor:<input type="text" name="autor">
			<br>
			Descri��o:
			<br>
			<textarea rows="3" cols="50" name="descricao">�rea para texto</textarea>
			<br>
			Tipo do V�lume:<select name="tipo">
				<option value="livro">Livro</option>
				<option value="periodico">Peri�dico</option>
				<option value="foto">Foto</option>
				<option value="audio">�udio</option>
			</select>
			<br>
			N�mero de P�ginas:<input type="text" name="numpag">
			<br>
			Ano de Publica��o:<input type="text" name="anopub">
			<br>
			Editora:<select name="editora">
				<option value="fundamento">Fundamento</option>
				<option value="moderna">Moderna</option>
				<option value="atica">�tica</option>
				<option value="schoba">Schoba</option>
			</select>
			<br>
			<input type="submit">
		</form>
	</body>
</html>