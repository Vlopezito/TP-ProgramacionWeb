package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Veterinario")

public class Veterinario implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idVeterinario;

	@Column(name="nombreVeterinario", nullable=false, length=30)
	private String nombreVeterinario;
	
	@Column(name="apellidoVeterinario", nullable=false, length=30)
	private String apellidoVeterinario;
	
	@Column(name="dniVeterinario", nullable=false, length=30)
	private int dniVeterinario;
	
	@Column(name="emailVeterinario", nullable=false, length=30)
	private String emailVeterinario;
	
	public Veterinario() {
		super();
	}
	
	public Veterinario(int idVeterinario, String nombreVeterinario, String apellidoVeterinario,int dniVeterinario,String emailVeterinario ) {
		super();
		this.idVeterinario = idVeterinario;
		this.nombreVeterinario = nombreVeterinario;
		this.apellidoVeterinario = apellidoVeterinario;
		this.dniVeterinario = dniVeterinario
	    this.emailVeterinario = emailVeterinario
	}
	
	public int getIdVeterinario() {
		return idVeterinario;
	}

	public void setIdVeterinario(int idVeterinario) {
		this.idVeterinario = idVeterinario;
	}

	public String getNombreVeterinario() {
		return nombreVeterinario;
	}

	public void setNombreVeterinario(String nombreVeterinario) {
		this.nombreVeterinario = nombreVeterinario;
	}

	public String getApellidoVeterinario() {
		return apellidoVeterinario;
	}

	public void setApellidoVeterinario(String apellidoVeterinario) {
		this.apellidoVeterinario = apellidoVeterinario;
	}
	
	public String getEmailVeterinario() {
		return emailVeterinario;
	}

	public void setEmailVeterinario(String emailVeterinario) {
		this.emailVeterinario = emailVeterinario;
	}
	
}


