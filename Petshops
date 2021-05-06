package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="petshops")
public class Petshops {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPetshop;

	@Column(name="nombre",nullable=false, length=50 )
	private String b_nombre;
	
	@Column(name="ruc", nullable=false, length = 8)
	private String e_ruc;
	
	@Column(name="descripcion", nullable=false, length = 60)
	private String f_descripcion;
	
	

	public Petshops() {
		super();
	}

	public Petshops (int idPetshop, String nombre, String ruc, String descripcion) {
		super();
		this.idPetshop = idPetshop;
		this.b_nombre = nombre;
		this.e_ruc = ruc;
		this.f_descripcion = descripcion;
	}

	public int getIdPetshop() {
		return idPetshop;
	}

	public void setIdPetshop(int idPetshop) {
		this.idPetshop = idPetshop;
	}

	public String getNombre() {
		return b_nombre;
	}

	public void setNombre(String nombre) {
		this.b_nombre = nombre;
	}


	public String getRuc() {
		return e_ruc;
	}

	public void setRuc(String ruc) {
		this.e_ruc = ruc;
	}

	public String getDescripcion() {
		return f_descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.f_descripcion = descripcion;
	}

}
