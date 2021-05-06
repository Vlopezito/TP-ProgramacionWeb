package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Tiendapetshop;
import pe.edu.upc.service.ITiendapetshopService;

@Named
@RequestScoped
public class TiendapetshopController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private ITiendapetshopService tS;

	private Tiendapetshop tiendapetshop;
	List<Tiendapetshop> listaTiendapetshops;

	@PostConstruct
	public void init() {
		this.listaTiendapetshops = new ArrayList<Tiendapetshop>();
		this.tiendapetshop = new Tiendapetshop();
		this.list();
	}
	public String newTiendapetshop() {
		this.setTiendapetshop(new Tiendapetshop());
		return "tiendapetshop.xhtml";
	}

	public void insert() {
		try {
			tS.insert(tiendapetshop);
			this.clean();
			this.list();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void list() {
		try {
			listaTiendapetshops = tS.list();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void clean() {
			this.init();

	}

	public void findByName() {
		if (tiendapetshop.getNombre().isEmpty()) {
			this.list();
		}
		else {
			listaTiendapetshops = this.tS.findByNameTiendapetshop(this.getTiendapetshop());
		}
	}

	public void eliminar(Tiendapetshop p) {
		try {
			tS.eliminar(p.getIdTiendapetshop());
			this.list();
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

	public List<Tiendapetshop> getListaTiendapetshops() {
		return listaTiendapetshops;
	}

	public void setListaTiendapetshops(List<Tiendapetshop> listaTiendapetshops) {
		this.listaTiendapetshops = listaTiendapetshops;
	}

}