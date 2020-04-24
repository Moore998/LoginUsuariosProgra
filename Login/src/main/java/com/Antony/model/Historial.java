package com.Antony.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the historial database table.
 * 
 */
@Entity
@NamedQuery(name="Historial.findAll", query="SELECT h FROM Historial h")
public class Historial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idHistorial;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to Loginusuario
	@ManyToOne
	@JoinColumn(name="idUsuarios")
	private Loginusuario loginusuario;

	public Historial() {
	}

	public int getIdHistorial() {
		return this.idHistorial;
	}

	public void setIdHistorial(int idHistorial) {
		this.idHistorial = idHistorial;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Loginusuario getLoginusuario() {
		return this.loginusuario;
	}

	public void setLoginusuario(Loginusuario loginusuario) {
		this.loginusuario = loginusuario;
	}

}