<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Banana Bacana</title>
</head>
<body>
	<nav class="bananaNav">
		<ul>
			<li><span style="color: yellow;">BananaBacana</span></li>
			<li><img src="img/banana2.jpg" alt="" height="40px"></li>
			<li><a href="cadastrarProduto.jsp">Cadastrar Produto</a></li>
			<li><a href="consultarProduto.jsp">Consultar Produto</a></li>
		</ul>		
	</nav>
	<main>
		<form action="cadastrarProduto" method="post" class=bananaForm>
			<div>
				<label for=""><strong>Descrição:</strong></label>
				<input type="text" name="descricao">
			</div>
			<div>
				<label for=""><strong>Quantidade:</strong></label>
				<input type="text" name="quantidade">
			</div>
			<div>
				<label for=""><strong>Preço:</strong></label>
				<input type="text" name="preco">
			</div>
			<div>
				<label for=""><strong>Disponível On-line:</strong></label>
				<input type="checkbox" name="online">
			</div>
			<div>
				<input id="bananaButton" type="submit" name="salvar" value="Cadastrar Produto">
			</div>
		</form>
	</main>
</body>
</html>