<%@page import="DTO.Usuario"%>
<%@page import="DAO.UsuarioDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
	Usuario u = (Usuario)session.getAttribute("usuario");
	if(u == null){
		response.sendRedirect("index.jsp? debe iniciar session");
	}else{

	%>
		<h1>Esto es el menú</h1>
		<h3>Bienvenido <%= u.getFamilia() %></h3>
		<a href="CerrarServlet">Cerrar</a>
	<%
			

	}
	%>
	
</body>
</html>