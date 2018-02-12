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
	
	public Usuario buscarUsuario(String f) {
		Usuario u = new Usuario();
		try {
			String query = "select * from usuario where familia = ?";
			Connection conexion = Conexion.getConexion();
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, f);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				u.setFamilia(rs.getString(1));
				u.setPass(rs.getString(2));
				u.setCorreo(rs.getString(3));
				u.setTelefono(rs.getString(4));
				u.setEstado(rs.getInt(5));
				u.setFecha(rs.getDate(6));
			}
		} catch (Exception e) {
			System.err.println("Error al buscar usuario " + e.getMessage());
		}
		return u;
	}
	
	public boolean login(String f, String p) {
		boolean valida = false;
		try {
			String query = "Select * from usuario where familia = ? and pass = ? and estado = 1";
			Connection conexion = Conexion.getConexion();
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, f);
			ps.setString(2, p);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				valida = true;
			}
		} catch (Exception e) {
			System.err.println("Error al validar login " + e.getMessage());
		}
		return valida;
	}

}