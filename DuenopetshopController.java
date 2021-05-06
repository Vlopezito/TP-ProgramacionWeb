package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Tiendapetshop;
import pe.edu.upc.entity.Duenopetshop;

import pe.edu.upc.service.ITiendapetshopService;
import pe.edu.upc.service.IDuenopetshopService;

@Named
@RequestScoped
public class DuenopetshopController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITiendapetshopService tS;
	
	@Inject
	private IDuenopetshopService mS;
			
	private Tiendapetshop tiendapetshop;
	private Duenopetshop duenopetshop;
	
	List<Tiendapetshop> listaTiendapetshops;
	List<Duenopetshop> listaDuenopetshops;
	
	@PostConstruct
	public void init() {
		tiendapetshop = new Tiendapetshop();
		duenopetshop = new Duenopetshop();
		listaTiendapetshops = new ArrayList<Tiendapetshop>();
		listaDuenopetshops = new ArrayList<Duenopetshop>();
		
		this.listar();
		this.listDuenopetshop();
	}
	
	public String nuevoDuenopetshop() {
		this.setDuenopetshop(new Duenopetshop());
		return "duenopetshop.xhtml";
	}
	
	public void insertar() {
		try {
			mS.insertar(duenopetshop);
			limpiarDuenopetshop();
			this.listDuenopetshop();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listar() {
		try {
			listaTiendapetshops = tS.list();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listDuenopetshop() {
		try {
			listaDuenopetshops = mS.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarDuenopetshop() {
		this.init();
	}
	
	public void eliminar(Duenopetshop duenopetshop) {
		try {
			mS.eliminar(duenopetshop.getIdDuenopetshop());
			this.listDuenopetshop();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public Tiendapetshop getTiendapetshop() {
		return tiendapetshop;
	}

	public void setTiendapetshop(Tiendapetshop tiendapetshop) {
		this.tiendapetshop = tiendapetshop;
	}

	public Duenopetshop getDuenopetshop() {
		return duenopetshop;
	}

	public void setDuenopetshop(Duenopetshop duenopetshop) {
		this.duenopetshop = duenopetshop;
	}

	public List<Tiendapetshop> getListaTiendapetshops() {
		return listaTiendapetshops;
	}

	public void setListaTiendapetshops(List<Tiendapetshop> listaTiendapetshops) {
		this.listaTiendapetshops = listaTiendapetshops;
	}

	public List<Duenopetshop> getListaDuenopetshops() {
		return listaDuenopetshops;
	}

	public void setListaDuenopetshops(List<Duenopetshop> listaDuenopetshops) {
		this.listaDuenopetshops = listaDuenopetshops;
	}	
	
}
