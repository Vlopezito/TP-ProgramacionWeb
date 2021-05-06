package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="duenomascota")
public class Duenomascota implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDuenomascota;

	@Column(name="nombre",nullable=false, length=50 )
	private String b_nombre;
	
	@Column(name="apellido",nullable=false, length=50 )
	private String c_apellido;
	
	@Column(name="username", nullable=false, length = 30)
	private String d_username;
	
	@Column(name="dni", nullable=false, length = 8)
	private String e_dni;
	
	@Column(name="email", nullable=false, length = 60)
	private String f_email;
	
	

	public Duenomascota() {
		super();
	}

	public Duenomascota(int idDuenomascota, String nombre, String apellido, String username, String dni, String email) {
		super();
		this.idDuenomascota = idDuenomascota;
		this.b_nombre = nombre;
		this.c_apellido = apellido;
		this.d_username = username;
		this.e_dni = dni;
		this.f_email = email;
	}

	public int getIdDuenomascota() {
		return idDuenomascota;
	}

	public void setIdDuenomascota(int idDuenomascota) {
		this.idDuenomascota = idDuenomascota;
	}

	public String getNombre() {
		return b_nombre;
	}

	public void setNombre(String nombre) {
		this.b_nombre = nombre;
	}

	public String getApellido() {
		return c_apellido;
	}

	public void setApellido(String apellido) {
		this.c_apellido = apellido;
	}

	public String getUsername() {
		return d_username;
	}

	public void setUsername(String username) {
		this.d_username = username;
	}

	public String getDni() {
		return e_dni;
	}

	public void setDni(String dni) {
		this.e_dni = dni;
	}

	public String getEmail() {
		return f_email;
	}

	public void setEmail(String email) {
		this.f_email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((b_nombre == null) ? 0 : b_nombre.hashCode());
		result = prime * result + ((c_apellido == null) ? 0 : c_apellido.hashCode());
		result = prime * result + ((d_username == null) ? 0 : d_username.hashCode());
		result = prime * result + ((e_dni == null) ? 0 : e_dni.hashCode());
		result = prime * result + ((f_email == null) ? 0 : f_email.hashCode());
		result = prime * result + idDuenomascota;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Duenomascota other = (Duenomascota) obj;
		if (b_nombre == null) {
			if (other.b_nombre != null)
				return false;
		} else if (!b_nombre.equals(other.b_nombre))
			return false;
		if (c_apellido == null) {
			if (other.c_apellido != null)
				return false;
		} else if (!c_apellido.equals(other.c_apellido))
			return false;
		if (d_username == null) {
			if (other.d_username != null)
				return false;
		} else if (!d_username.equals(other.d_username))
			return false;
		if (e_dni == null) {
			if (other.e_dni != null)
				return false;
		} else if (!e_dni.equals(other.e_dni))
			return false;
		if (f_email == null) {
			if (other.f_email != null)
				return false;
		} else if (!f_email.equals(other.f_email))
			return false;
		if (idDuenomascota != other.idDuenomascota)
			return false;
		return true;
	}

}
