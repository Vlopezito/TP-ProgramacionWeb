package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDuenopetshopDao;
import pe.edu.upc.entity.Duenopetshop;
import pe.edu.upc.service.IDuenopetshopService;

@Named
@RequestScoped
public class DuenopetshopServiceImpl implements IDuenopetshopService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDuenopetshopDao mD;
	
	@Override
	public void insertar(Duenopetshop duenopetshop) {
		mD.insertar(duenopetshop);
	}
	
	@Override
	public List<Duenopetshop> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idDuenopetshop) {
		mD.eliminar(idDuenopetshop);
	}
}
