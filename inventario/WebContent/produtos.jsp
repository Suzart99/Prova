<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html >
<html>
<head>
    <meta charset="utf-8">
	<title>Controle de Estoque</title>
   
</head>

<body>
<h1>Lista Produtos</h1>
<a href="./" >Inicio </a><br>


<table class="table" >
<tr>
<th> Codigo </th>
<th> Nome </th>
<th> Quantidade </th>
<th> Categoria</th> 
</tr>

<c:forEach var="produto" items="${lista}">
<tr>
 <td> ${produto.codigo} </td>
 <td> ${produto.nome} </td>
 <td> ${produto.quantidade} </td>
 <td> ${produto.categoria} </td>
<tr>

</c:forEach>
</table>

<br>
Quantidade Total = 
<c:forEach var="produto" items="${lista}">
    <c:set var="total" value="${total + produto.quantidade}" />
</c:forEach>
<c:out value="${total + produto.quantidade}" />





</body>
</html>