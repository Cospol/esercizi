<%@page import="it.prova.libreria.model.Libro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	Il libro � stato trovato<%  Libro libroInPagina = (Libro)request.getAttribute("libro_attribute");  %>
	<br>Il tuo titolo � <%= libroInPagina.getTitolo()%>
	<br>Il tuo genere � <%= libroInPagina.getGenere() %>
	<br>Il tuo pagine � <%= libroInPagina.getPagine() %>
 	<a href="cercaLibro.jsp" >home</a>
	
</body>
</body>
</html>