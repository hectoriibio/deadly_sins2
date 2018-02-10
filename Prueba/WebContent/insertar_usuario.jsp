<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ingreso de Usuario</title>
</head>
<body>
	<form action="UsuarioServlet" method="post">
		<table>
			<tr>
				<td>Familia</td>
				<td><input type="text" name="familia"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td>Correo</td>
				<td><input type="text" name="correo"></td>
			</tr>
			<tr>
				<td>Telefono</td>
				<td><input type="text" name="telefono"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Insertar"></td>
			</tr>
		</table>
	</form>
</body>
</html>