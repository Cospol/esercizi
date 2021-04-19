<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ExecuteRicercaLibroServlet" method="post">

	Titolo: <input type ="text" name="titolo">  
	Genere: <input type ="text" name="genere">  
	Pagine: <input type ="text" name="pagine">  
	<input type ="submit"name="cerca"> 
</form>
</body>
</html>