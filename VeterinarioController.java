package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Consultorio;
import pe.edu.upc.entity.Veterinario;

import pe.edu.upc.service.IConsultorioService;
import pe.edu.upc.service.IVeterinarioService;

@Named
@RequestScoped
public class VeterinarioController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IConsultorioService tS;
	
	@Inject
	private IVeterinarioService mS;
			
	private Consultorio consultorio;
	private Veterinario veterinario;
	
	List<Consultorio> listaConsultorios;
	List<Veterinario> listaVeterinarios;
	
	@PostConstruct
	public void init() {
		consultorio = new Consultorio();
		veterinario = new Veterinario();
		listaConsultorios = new ArrayList<Consultorio>();
		listaVeterinarios = new ArrayList<Veterinario>();
		
		this.listar();
		this.listVeterinario();
	}
	
	public String nuevoVeterinario() {
		this.setVeterinario(new Veterinario());
		return "veterinario.xhtml";
	}
	
	public void insertar() {
		try {
			mS.insertar(veterinario);
			limpiarVeterinario();
			this.listVeterinario();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listar() {
		try {
			listaConsultorios = tS.list();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void listVeterinario() {
		try {
			listaVeterinarios = mS.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarVeterinario() {
		this.init();
	}
	
	public void eliminar(Veterinario veterinario) {
		try {
			mS.eliminar(veterinario.getIdVeterinario());
			this.listVeterinario();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public Consultorio getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public List<Consultorio> getListaConsultorios() {
		return listaConsultorios;
	}

	public void setListaConsultorios(List<Consultorio> listaConsultorios) {
		this.listaConsultorios = listaConsultorios;
	}

	public List<Veterinario> getListaVeterinarios() {
		return listaVeterinarios;
	}

	public void setListaVeterinarios(List<Veterinario> listaVeterinarios) {
		this.listaVeterinarios = listaVeterinarios;
	}	
	
}
