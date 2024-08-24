<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BOOK DETAILS</title>
</head>
<body>
<h2>Book Details</h2>
<form action="book">
Book Id :<input type ="text" name ="id"/>
         <input type ="submit" value ="Search"/>
<hr/>
Book Id:     ${book.bookId}  <br/>
Book Name:   ${book.bookName}  <br/>
Book Price:  ${book.bookPrice}  <br/>
</form>
</body>
</html>