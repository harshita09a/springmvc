<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Home Page!</h1>
${msg}
<form action="search" method="get">
Search product:<input name="q" type="text"/>
<input type="submit" value="search"/>
</form>
<form action="calculate" method="get">
Enter Principle:<input name="p" type="text"/>
Enter Time:<input name="t" type="text"/>
Enter Rate:<input name="r" type="text"/>
<input type="submit" value="calculate"/>


<a href = "add-product">ADD PRODUCT</a>

</form>
</body>
</html>