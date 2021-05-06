package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Duenopetshop")
public class Duenopetshop implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDuenopetshop;
	
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
	
	@ManyToOne
	@JoinColumn(name="idTiendapetshop")
	private Tiendapetshop tiendapetshop;

	public Duenopetshop() {
		super();
	}

	public Duenopetshop(int idDuenopetshop, String nombre, String apellido, String username, String dni, String email, Tiendapetshop tiendapetshop) {
		super();
		this.idDuenopetshop = idDuenopetshop;
		this.b_nombre = nombre;
		this.c_apellido = apellido;
		this.d_username = username;
		this.e_dni = dni;
		this.f_email = email;
		this.tiendapetshop = tiendapetshop;
	}

	public int getIdDuenopetshop() {
		return idDuenopetshop;
	}

	public void setIdDuenopetshop(int idDuenopetshop) {
		this.idDuenopetshop = idDuenopetshop;
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

	public Tiendapetshop getTiendapetshop() {
		return tiendapetshop;
	}

	public void setTiendapetshop(Tiendapetshop tiendapetshop) {
		this.tiendapetshop = tiendapetshop;
	}

}
