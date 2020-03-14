<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Location</title>
</head>
<body>
<h2>View All Location</h2>
<table>
<tr>
<th>ID</th>
<th>CODE</th>
<th>NAME</th>
<th>TYPE</th>
</tr>
<c:forEach items="${location}" var="location"> 
<tr>
<td>${location.id}</td>
<td>${location.code}</td>
<td>${location.name}</td>
<td>${location.type}</td>
<td>
<a href="deletelocation?id=${location.id}">DELETE</a></td> 
<td>
<a href="editlocation?id=${location.id}">UPDATE</a></td> 
</tr>
</c:forEach>
</table>
<a href="createpage">Add Location</a>
</body>
</html>