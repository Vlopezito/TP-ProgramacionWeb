package pe.edu.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITiendapetshopDao;
import pe.edu.upc.entity.Tiendapetshop;
import pe.edu.upc.service.ITiendapetshopService;

@Named 
@RequestScoped
public class TiendapetshopServiceImpl implements ITiendapetshopService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITiendapetshopDao tD;
	
	@Override
	public void insert(Tiendapetshop tiendapetshop) {
		tD.insert(tiendapetshop);
	}
	
	@Override
	public List<Tiendapetshop> list() {
		return tD.list();
	}
	
	@Override
	public List<Tiendapetshop> findByNameTiendapetshop(Tiendapetshop c) {
		return tD.findByNameTiendapetshop(c);
	}
	
	@Override
	public void eliminar(int idTiendapetshop) {
		tD.eliminar(idTiendapetshop);
	}
}
