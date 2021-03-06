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
@Table(name="Veterinario")
public class Veterinario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVeterinario;
	
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
	
	@Column(name="nmedico", nullable=false, length = 9)
	private String g_nmedico;
	
	@ManyToOne
	@JoinColumn(name="idConsultorio")
	private Consultorio consultorio;

	public Veterinario() {
		super();
	}

	public Veterinario(int idVeterinario, String nombre, String apellido, String username, String dni, String email,String nmedico, Consultorio consultorio) {
		super();
		this.idVeterinario = idVeterinario;
		this.b_nombre = nombre;
		this.c_apellido = apellido;
		this.d_username = username;
		this.e_dni = dni;
		this.f_email = email;
		this.g_nmedico = nmedico;
		this.consultorio = consultorio;
	}

	public int getIdVeterinario() {
		return idVeterinario;
	}

	public void setIdVeterinario(int idVeterinario) {
		this.idVeterinario = idVeterinario;
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

	public void setEmail(String nmedico) {
		this.f_email = nmedico;
	}
	
	public String getNmedico() {
		return g_nmedico;
	}

	public void setNmedico(String nmedico) {
		this.g_nmedico = nmedico;
	}
	public Consultorio getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}

}
