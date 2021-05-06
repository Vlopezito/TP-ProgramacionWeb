package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="consultorio")
public class Consultorio implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConsultorio;

	@Column(name="nombre",nullable=false, length=50 )
	private String b_nombre;
	
	@Column(name="ruc",nullable=false, length=11 )
	private String c_ruc;
	
	@Column(name="direccion", nullable=false, length = 50)
	private String d_direccion;
	
	@Column(name="distrito", nullable=false, length = 25)
	private String e_distrito;
	
	@Column(name="cuidad", nullable=false, length = 25)
	private String f_cuidad;
	
	@Column(name="pais", nullable=false, length = 25)
	private String g_pais;
	
	@Column(name="descripcion", nullable=false, length = 80)
	private String h_descripcion;

	public Consultorio() {
		super();
	}

	public Consultorio(int idConsultorio, String nombre, String ruc, String direccion, String distrito, String cuidad, String pais, String descripcion) {
		super();
		this.idConsultorio = idConsultorio;
		this.b_nombre = nombre;
		this.c_ruc = ruc;
		this.d_direccion = direccion;
		this.e_distrito = distrito;
		this.f_cuidad = cuidad;
		this.g_pais = pais;
		this.h_descripcion = descripcion;
	}

	public int getIdConsultorio() {
		return idConsultorio;
	}

	public void setIdConsultorio(int idConsultorio) {
		this.idConsultorio = idConsultorio;
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

	public String getDireccion() {
		return d_direccion;
	}

	public void setDireccion(String direccion) {
		this.d_direccion = direccion;
	}

	public String getDistrito() {
		return e_distrito;
	}

	public void setDistrito(String distrito) {
		this.e_distrito = distrito;
	}

	public String getCuidad() {
		return f_cuidad;
	}

	public void setCuidad(String cuidad) {
		this.f_cuidad = cuidad;
	}
	
	public String getPais() {
		return g_pais;
	}

	public void setPais(String pais) {
		this.g_pais = pais;
	}

	public String getDescripcion() {
		return h_descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.h_descripcion = descripcion;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((b_nombre == null) ? 0 : b_nombre.hashCode());
		result = prime * result + ((c_ruc == null) ? 0 : c_ruc.hashCode());
		result = prime * result + ((d_direccion == null) ? 0 : d_direccion.hashCode());
		result = prime * result + ((e_distrito == null) ? 0 : e_distrito.hashCode());
		result = prime * result + ((f_cuidad == null) ? 0 : f_cuidad.hashCode());
		result = prime * result + ((g_pais == null) ? 0 : g_pais.hashCode());
		result = prime * result + ((h_descripcion == null) ? 0 : h_descripcion.hashCode());
		result = prime * result + idConsultorio;
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
		Consultorio other = (Consultorio) obj;
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
		if (d_direccion == null) {
			if (other.d_direccion != null)
				return false;
		} else if (!d_direccion.equals(other.d_direccion))
			return false;
		if (e_distrito == null) {
			if (other.e_distrito != null)
				return false;
		} else if (!e_distrito.equals(other.e_distrito))
			return false;
		if (f_cuidad == null) {
			if (other.f_cuidad != null)
				return false;
		} else if (!f_cuidad.equals(other.f_cuidad))
			return false;
		if (g_pais == null) {
			if (other.g_pais != null)
				return false;
		} else if (!g_pais.equals(other.g_pais))
			return false;
		if (h_descripcion == null) {
			if (other.h_descripcion != null)
				return false;
		} else if (!h_descripcion.equals(other.h_descripcion))
			return false;
		if (idConsultorio != other.idConsultorio)
			return false;
		return true;
	}

}
