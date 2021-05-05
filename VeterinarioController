package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Veterinario;
import pe.edu.upc.service.IVeterinarioService;

@Named
@RequestScoped

public class VeterinarioController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IVeterinarioService cService;
	private Veterinario veterinario;
	List<Veterinario> listaVeterinarios;
	
	@PostConstruct
	public void init() {
		this.listaVeterinarios = new ArrayList<Veterinario>();
		this.veterinario = new Veterinario();
		this.listar();
	}
	
	public String nuevoVeterinario() {
		this.setVeterinario(new Veterinario());
		return "veterinario.xhtml";
	}
	
	public void insertar() {
		cService.insertar(veterinario);
		limpiarVeterinario();
	}
	
	public void listar() {
		listaVeterinarios = cService.listar();
	}
	
	public void limpiarVeterinario() {
		this.init();
	}
	
	public void eliminar(Veterinario veterinario) {
		cService.eliminar(veterinario.getIdVeterinario());
		this.listar();
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public List<Veterinario> getListaVeterinarios() {
		return listaVeterinarios;
	}

	public void setListaVeterinarios(List<Veterinario> listaVeterinarios) {
		this.listaVeterinarios = listaVeterinarios;
	}	
	
}
package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Veterinario;
import pe.edu.upc.service.IVeterinarioService;

@Named
@RequestScoped

public class VeterinarioController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IVeterinarioService cService;
	private Veterinario veterinario;
	List<Veterinario> listaVeterinarios;
	
	@PostConstruct
	public void init() {
		this.listaVeterinarios = new ArrayList<Veterinario>();
		this.veterinario = new Veterinario();
		this.listar();
	}
	
	public String nuevoVeterinario() {
		this.setVeterinario(new Veterinario());
		return "veterinario.xhtml";
	}
	
	public void insertar() {
		cService.insertar(veterinario);
		limpiarVeterinario();
	}
	
	public void listar() {
		listaVeterinarios = cService.listar();
	}
	
	public void limpiarVeterinario() {
		this.init();
	}
	
	public void eliminar(Veterinario veterinario) {
		cService.eliminar(veterinario.getIdVeterinario());
		this.listar();
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public List<Veterinario> getListaVeterinarios() {
		return listaVeterinarios;
	}

	public void setListaVeterinarios(List<Veterinario> listaVeterinarios) {
		this.listaVeterinarios = listaVeterinarios;
	}	
	
}
