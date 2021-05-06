package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Petshops;
import pe.edu.upc.service.IPetshopService;

@Named
@RequestScoped
public class PetshopController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private IPetshopService pS;

	private Petshops petshops;
	List<Petshops> listaPetshops;

	@PostConstruct
	public void init() {
		this.listaPetshops = new ArrayList<Petshops>();
		this.petshops = new Petshops();
		this.list();
	}
	public String newPetshops() {
		this.setPetshops(new Petshops());
		return "petshop.xhtml";
	}

	public void insert() {
		pS.insert(petshops);
		this.clean();
		this.list();
	}

	public void list() {
		listaPetshops= pS.list();
	}

	public void clean() {
		this.init();
	}

	public void findByName() {
		if (petshops.getNombre().isEmpty()) {
			this.list();
		}
		else {
			listaPetshops = this.pS.findByNamePetshops(this.getPetshops());
		}
	}


	public Petshops getPetshops() {
		return petshops;
	}

	public void setPetshops(Petshops petshops) {
		this.petshops = petshops;
	}

	public List<Petshops> getListaPetshops() {
		return listaPetshops;
	}

	public void setListaPetshops(List<Petshops> listaPetshops) {
		this.listaPetshops = listaPetshops;
	}

}
