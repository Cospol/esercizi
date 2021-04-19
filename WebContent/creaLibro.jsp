<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ExecuteAddLibroServlet" method="post">
Libro non trovato. Vuoi inserirlo?
	Titolo: <input type ="text" name="titoloInput">  
	Genere: <input type ="text" name="genereInput">  
	Pagine: <input type ="text" name="pagineInput">  
	<input type ="submit" name="crea"> 
</form>
</body>
</html>