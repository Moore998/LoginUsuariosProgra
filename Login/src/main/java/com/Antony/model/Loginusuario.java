package com.Antony.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the loginusuarios database table.
 * 
 */
@Entity
@Table(name="loginusuarios")
@NamedQuery(name="Loginusuario.findAll", query="SELECT l FROM Loginusuario l")
public class Loginusuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuarios;

	private String apellidoUsuario;

	private String contrasena;

	private String correo;

	private String nombreUsuario;

	private String usuario;

	//bi-directional many-to-one association to Historial
	@OneToMany(mappedBy="loginusuario")
	private List<Historial> historials;

	public Loginusuario() {
	}

	public int getIdUsuarios() {
		return this.idUsuarios;
	}

	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getApellidoUsuario() {
		return this.apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<Historial> getHistorials() {
		return this.historials;
	}

	public void setHistorials(List<Historial> historials) {
		this.historials = historials;
	}

	public Historial addHistorial(Historial historial) {
		getHistorials().add(historial);
		historial.setLoginusuario(this);

		return historial;
	}

	public Historial removeHistorial(Historial historial) {
		getHistorials().remove(historial);
		historial.setLoginusuario(null);

		return historial;
	}

}