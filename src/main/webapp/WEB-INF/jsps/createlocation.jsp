<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location Creation</title>
</head>
<body>

	<form action="savelocation" method="post">
		<pre>
Id:   <input type="text" name="id" />
Code: <input type="text" name="code" />
Name: <input type="text" name="name" />
Type: Urban <input type="radio" name="type" value="URBAN" />
      Rural <input type="radio" name="type" value="RURAL" />
      <input type="submit" value="Save" />
</pre>
	</form>
${msg}


<a href="viewlocation">View All</a>
</body>
</html>