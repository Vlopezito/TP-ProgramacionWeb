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
@Table(name="Mascota")
public class Mascota implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMascota;
	
	@Column(name="nombre",nullable=false, length=50 )
	private String b_nombre;
	
	@Column(name="animal",nullable=false, length=30 )
	private String c_animal;
	
	@Column(name="raza", nullable=false, length = 30)
	private String d_raza;
	
	@Column(name="color", nullable=false, length = 30)
	private String e_color;
	
	@Column(name="descripcion", nullable=false, length=80)
	private String f_descripcion;
	
	@Column(name="genero", nullable=false, length=30)
	private String g_genero;
	
	@ManyToOne
	@JoinColumn(name="idDuenomascota")
	private Duenomascota duenomascota;

	public Mascota() {
		super();
	}

	public Mascota(int idMascota, String nombre, String animal,String raza, String color, String descripcion, String genero, Duenomascota duenomascota) {
		super();
		this.idMascota = idMascota;
		this.b_nombre = nombre;
		this.c_animal = animal;
		this.d_raza = raza;
		this.e_color = color;
		this.f_descripcion = descripcion;
		this.g_genero = genero;
		this.duenomascota = duenomascota;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	
	public String getNombre() {
		return b_nombre;
	}

	public void setNombre(String nombre) {
		this.b_nombre = nombre;
	}

	public String getAnimal() {
		return c_animal;
	}

	public void setAnimal(String animal) {
		this.c_animal = animal;
	}

	public String getRaza() {
		return d_raza;
	}

	public void setRaza(String raza) {
		this.d_raza = raza;
	}

	public String getColor() {
		return e_color;
	}

	public void setColor(String color) {
		this.e_color = color;
	}

	public String getDescripcion() {
		return f_descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.f_descripcion = descripcion;
	}

	public String getGenero() {
		return g_genero;
	}

	public void setGenero(String genero) {
		this.g_genero = genero;
	}

	public Duenomascota getDuenomascota() {
		return duenomascota;
	}

	public void setDuenomascota(Duenomascota duenomascota) {
		this.duenomascota = duenomascota;
	}

}
