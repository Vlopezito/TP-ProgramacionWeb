package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Duenomascota;
import pe.edu.upc.entity.Mascota;

import pe.edu.upc.service.IDuenomascotaService;
import pe.edu.upc.service.IMascotaService;

@Named
@RequestScoped
public class MascotaController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDuenomascotaService dS;
	
	@Inject
	private IMascotaService mS;
			
	private Duenomascota duenomascota;
	private Mascota mascota;
	
	List<Duenomascota> listaDuenomascotas;
	List<Mascota> listaMascotas;
	
	@PostConstruct
	public void init() {
		duenomascota = new Duenomascota();
		mascota = new Mascota();
		listaDuenomascotas = new ArrayList<Duenomascota>();
		listaMascotas = new ArrayList<Mascota>();
		
		this.listar();
		this.listMascota();
	}
	
	public String nuevoMascota() {
		this.setMascota(new Mascota());
		return "mascota.xhtml";
	}
	
	public void insertar() {
		try {
			mS.insertar(mascota);
			limpiarMascota();
			this.listMascota();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listar() {
		try {
			listaDuenomascotas = dS.list();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listMascota() {
		try {
			listaMascotas = mS.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarMascota() {
		this.init();
	}
	
	public void eliminar(Mascota mascota) {
		try {
			mS.eliminar(mascota.getIdMascota());
			this.listMascota();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public Duenomascota getDuenomascota() {
		return duenomascota;
	}

	public void setDuenomascota(Duenomascota duenomascota) {
		this.duenomascota = duenomascota;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public List<Duenomascota> getListaDuenomascotas() {
		return listaDuenomascotas;
	}

	public void setListaDuenomascotas(List<Duenomascota> listaDuenomascotas) {
		this.listaDuenomascotas = listaDuenomascotas;
	}

	public List<Mascota> getListaMascotas() {
		return listaMascotas;
	}

	public void setListaMascotas(List<Mascota> listaMascotas) {
		this.listaMascotas = listaMascotas;
	}	
	
}
