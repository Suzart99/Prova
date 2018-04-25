<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html >
<html>
<head>
    <meta charset="utf-8">
	<title>Controle de Estoque</title>
   
</head>

<body>

<h1>Formulario Produto</h1>

<a href="./" >Inicio </a><br>

<form action="produtos" method="post" >
	Nome: <input name="nome" type="text"><br>
	Quantidade: <input name ="quantidade" type="number"><br>
	Categoria: <select name="categoria">
		<c:forEach var="categoria" items="${lista}">
			<option value="${categoria.codigo}">${categoria.descricao} </option>
		</c:forEach>
	</select><br>
	<button type="submit">Salvar</button>
</form>




</body>
</html>