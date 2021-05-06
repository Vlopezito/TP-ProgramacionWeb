package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tiendapetshop")
public class Tiendapetshop implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTiendapetshop;

	@Column(name="nombre",nullable=false, length=50 )
	private String b_nombre;
	
	@Column(name="ruc",nullable=false, length=11 )
	private String c_ruc;
	
	@Column(name="descripcion", nullable=false, length = 80)
	private String d_descripcion;

	public Tiendapetshop() {
		super();
	}

	public Tiendapetshop(int idTiendapetshop, String nombre, String ruc, String descripcion) {
		super();
		this.idTiendapetshop = idTiendapetshop;
		this.b_nombre = nombre;
		this.c_ruc = ruc;
		this.d_descripcion = descripcion;
	}

	public int getIdTiendapetshop() {
		return idTiendapetshop;
	}

	public void setIdTiendapetshop(int idTiendapetshop) {
		this.idTiendapetshop = idTiendapetshop;
	}

	public String getNombre() {
		return b_nombre;
	}

	public void setNombre(String nombre) {
		this.b_nombre = nombre;
	}

	public String getRUC() {
		return c_ruc;
	}

	public void setRUC(String ruc) {
		this.c_ruc = ruc;
	}

	public String getDescripcion() {
		return d_descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.d_descripcion = descripcion;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((b_nombre == null) ? 0 : b_nombre.hashCode());
		result = prime * result + ((c_ruc == null) ? 0 : c_ruc.hashCode());
		result = prime * result + ((d_descripcion == null) ? 0 : d_descripcion.hashCode());
		result = prime * result + idTiendapetshop;
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
		Tiendapetshop other = (Tiendapetshop) obj;
		if (b_nombre == null) {
			if (other.b_nombre != null)
				return false;
		} else if (!b_nombre.equals(other.b_nombre))
			return false;
		if (c_ruc == null) {
			if (other.c_ruc != null)
				return false;
		} else if (!c_ruc.equals(other.c_ruc))
			return false;
		if (d_descripcion == null) {
			if (other.d_descripcion != null)
				return false;
		} else if (!d_descripcion.equals(other.d_descripcion))
			return false;
		if (idTiendapetshop != other.idTiendapetshop)
			return false;
		return true;
	}

}
