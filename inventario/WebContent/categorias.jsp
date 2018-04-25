<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html >
<html>
<head>
    <meta charset="utf-8">
	<title>Controle de Estoque</title>
   
</head>

<body>
<h1>Lista Categoria</h1>
<a href="./" >Inicio </a><br>

<table class="table" >
<tr>
<th> Codigo </th>
<th> Descricao </th> 
</tr>

<c:forEach var="categoria" items="${lista}">
<tr>
 <td> ${categoria.codigo} </td>
 <td> ${categoria.descricao} </td>
<tr>
</c:forEach>

</table>




</body>
</html>