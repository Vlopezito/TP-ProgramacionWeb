package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Tiendapetshop;
import pe.edu.upc.entity.Sucursal;

import pe.edu.upc.service.ITiendapetshopService;
import pe.edu.upc.service.ISucursalService;

@Named
@RequestScoped
public class SucursalController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITiendapetshopService tS;
	
	@Inject
	private ISucursalService mS;
			
	private Tiendapetshop tiendapetshop;
	private Sucursal sucursal;
	
	List<Tiendapetshop> listaTiendapetshops;
	List<Sucursal> listaSucursales;
	
	@PostConstruct
	public void init() {
		tiendapetshop = new Tiendapetshop();
		sucursal = new Sucursal();
		listaTiendapetshops = new ArrayList<Tiendapetshop>();
		listaSucursales = new ArrayList<Sucursal>();
		
		this.listar();
		this.listSucursal();
	}
	
	public String nuevoSucursal() {
		this.setSucursal(new Sucursal());
		return "sucursal.xhtml";
	}
	
	public void insertar() {
		try {
			mS.insertar(sucursal);
			limpiarSucursal();
			this.listSucursal();
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
	
	public void listSucursal() {
		try {
			listaSucursales = mS.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarSucursal() {
		this.init();
	}
	
	public void eliminar(Sucursal sucursal) {
		try {
			mS.eliminar(sucursal.getIdSucursal());
			this.listSucursal();
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

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public List<Tiendapetshop> getListaTiendapetshops() {
		return listaTiendapetshops;
	}

	public void setListaTiendapetshops(List<Tiendapetshop> listaTiendapetshops) {
		this.listaTiendapetshops = listaTiendapetshops;
	}

	public List<Sucursal> getListaSucursales() {
		return listaSucursales;
	}

	public void setListaSucursales(List<Sucursal> listaSucursales) {
		this.listaSucursales = listaSucursales;
	}	
	
}
