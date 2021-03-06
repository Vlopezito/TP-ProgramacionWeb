package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Duenomascota;
import pe.edu.upc.service.IDuenomascotaService;

@Named
@RequestScoped
public class DuenomascotaController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private IDuenomascotaService dS;

	private Duenomascota duenomascota;
	List<Duenomascota> listaDuenomascotas;

	@PostConstruct
	public void init() {
		this.listaDuenomascotas = new ArrayList<Duenomascota>();
		this.duenomascota = new Duenomascota();
		this.list();
	}
	public String newDuenomascota() {
		this.setDuenomascota(new Duenomascota());
		return "duenomascota.xhtml";
	}

	public void insert() {
		try {
			dS.insert(duenomascota);
			this.clean();
			this.list();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void list() {
		try {
			listaDuenomascotas = dS.list();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void clean() {
			this.init();

	}

	public void findByName() {
		if (duenomascota.getNombre().isEmpty()) {
			this.list();
		}
		else {
			listaDuenomascotas = this.dS.findByNameDuenomascota(this.getDuenomascota());
		}
	}

	public void eliminar(Duenomascota p) {
		try {
			dS.eliminar(p.getIdDuenomascota());
			this.list();
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

	public List<Duenomascota> getListaDuenomascotas() {
		return listaDuenomascotas;
	}

	public void setListaDuenomascotas(List<Duenomascota> listaDuenomascotas) {
		this.listaDuenomascotas = listaDuenomascotas;
	}

}