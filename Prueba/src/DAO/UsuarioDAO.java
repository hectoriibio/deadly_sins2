package DAO;

import DTO.Usuario;
import SQL.Conexion;
import java.sql.*;

public class UsuarioDAO {
	
	public void insert(Usuario u) {
		
		try {
			String query = "insert into usuario values(?,?,?,?,0,sysdate())";
			Connection conexion = Conexion.getConexion();
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, u.getFamilia());
			ps.setString(2, u.getPass());
			ps.setString(3, u.getCorreo());
			ps.setString(4, u.getTelefono());
			ps.executeUpdate();
			
		} catch (Exception e) {
			System.err.println("Error al insertar usuario " + e.getMessage());
		}
	}

}