<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
HttpSession seccion = (HttpSession) request.getSession();
String usuariovariabledeseccion = (String)seccion.getAttribute("usuario");
if(usuariovariabledeseccion==null){
	response.sendRedirect("index.jsp");
}

%>

<body>

<h1>Bienvenido Moore!</h1>
<form action="ServeletUser" method="post">
<input type="submit" value="Cerrar" name="btncerrar">
</form>
<a href="historialUsuarios.jsp">Ver historial de usuarios</a>
</body>
</html>