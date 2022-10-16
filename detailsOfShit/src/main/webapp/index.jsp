<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>detailsOfShit</title>
</head>
<body>
	<form action="shirt" method="post">
		<pre>


Brand<input type="text" name="brand" />

Type<select name="type" id="cars">
  <option value="30">30</option>
  <option value="32">32</option>
  <option value="34">34</option>
  <option value="36">36</option>
</select>
Price<input type="text" name="price" />

Discount:<select name="discount">
  <option value="30%">30%</option>
  <option value="32%">32%</option>
  
</select>
Quantity:<select name="quantity">
  <option value="100kg%">100kg</option>
  <option value="200kg%">200kg</option>
   <option value="500kg%">500kg</option>
    <option value="1000kg%">1000kg</option>
  
</select>
Gender:<select name="gender">
  <option value="male">male</option>
  <option value="female">female</option>
   <option value="other">other</option>
   
  
</select>
Color:<select name="color">
  <option value="red">red</option>
  <option value="yellow">yellow</option>
   <option value="green">green</option>
   
  
</select>

<input type="submit" value="save">
</pre>



	</form>
</body>
</html>