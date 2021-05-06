package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Consultorio;
import pe.edu.upc.service.IConsultorioService;

@Named
@RequestScoped
public class ConsultorioController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private IConsultorioService dS;

	private Consultorio consultorio;
	List<Consultorio> listaConsultorios;

	@PostConstruct
	public void init() {
		this.listaConsultorios = new ArrayList<Consultorio>();
		this.consultorio = new Consultorio();
		this.list();
	}
	public String newConsultorio() {
		this.setConsultorio(new Consultorio());
		return "consultorio.xhtml";
	}

	public void insert() {
		try {
			dS.insert(consultorio);
			this.clean();
			this.list();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void list() {
		try {
			listaConsultorios = dS.list();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void clean() {
			this.init();

	}

	public void findByName() {
		if (consultorio.getNombre().isEmpty()) {
			this.list();
		}
		else {
			listaConsultorios = this.dS.findByNameConsultorio(this.getConsultorio());
		}
	}

	public void eliminar(Consultorio p) {
		try {
			dS.eliminar(p.getIdConsultorio());
			this.list();
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

	public List<Consultorio> getListaConsultorios() {
		return listaConsultorios;
	}

	public void setListaConsultorios(List<Consultorio> listaConsultorios) {
		this.listaConsultorios = listaConsultorios;
	}

}