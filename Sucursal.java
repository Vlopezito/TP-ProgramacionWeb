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
@Table(name="Sucursal")
public class Sucursal implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSucursal;
	
	@Column(name="direccion",nullable=false, length=50 )
	private String b_direccion;
	
	@Column(name="distrito",nullable=false, length=25 )
	private String c_distrito;
	
	@Column(name="cuidad", nullable=false, length = 25)
	private String d_cuidad;
	
	@Column(name="pais", nullable=false, length = 25)
	private String e_pais;
	
	@Column(name="descripcion", nullable=false, length=80)
	private String f_descripcion;
	
	
	@ManyToOne
	@JoinColumn(name="idTiendapetshop")
	private Tiendapetshop tiendapetshop;

	public Sucursal() {
		super();
	}

	public Sucursal(int idSucursal, String direccion, String distrito,String cuidad, String pais, String descripcion, Tiendapetshop tiendapetshop) {
		super();
		this.idSucursal = idSucursal;
		this.b_direccion = direccion;
		this.c_distrito = distrito;
		this.d_cuidad = cuidad;
		this.e_pais = pais;
		this.f_descripcion = descripcion;
		this.tiendapetshop = tiendapetshop;
	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	
	public String getDireccion() {
		return b_direccion;
	}

	public void setDireccion(String direccion) {
		this.b_direccion = direccion;
	}

	public String getDistrito() {
		return c_distrito;
	}

	public void setDistrito(String distrito) {
		this.c_distrito = distrito;
	}

	public String getCuidad() {
		return d_cuidad;
	}

	public void setCuidad(String cuidad) {
		this.d_cuidad = cuidad;
	}

	public String getPais() {
		return e_pais;
	}

	public void setPais(String pais) {
		this.e_pais = pais;
	}

	public String getDescripcion() {
		return f_descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.f_descripcion = descripcion;
	}


	public Tiendapetshop getTiendapetshop() {
		return tiendapetshop;
	}

	public void setTiendapetshop(Tiendapetshop tiendapetshop) {
		this.tiendapetshop = tiendapetshop;
	}

}
