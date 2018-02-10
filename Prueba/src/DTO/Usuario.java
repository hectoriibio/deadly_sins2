package DTO;

import java.util.Date;

public class Usuario {
	String familia, pass, correo, telefono;
	int estado;
	Date fecha;
	
	public Usuario(String familia, String pass, String correo, String telefono, int estado, Date fecha) {
		this.familia = familia;
		this.pass = pass;
		this.correo = correo;
		this.telefono = telefono;
		this.estado = estado;
		this.fecha = fecha;
	}

	public Usuario() {
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
