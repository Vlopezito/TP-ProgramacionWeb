package pe.edu.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDuenomascotaDao;
import pe.edu.upc.entity.Duenomascota;
import pe.edu.upc.service.IDuenomascotaService;

@Named 
@RequestScoped
public class DuenomascotaServiceImpl implements IDuenomascotaService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDuenomascotaDao cD;
	
	@Override
	public void insert(Duenomascota duenomascota) {
		cD.insert(duenomascota);
	}
	
	@Override
	public List<Duenomascota> list() {
		return cD.list();
	}
	
	@Override
	public List<Duenomascota> findByNameDuenomascota(Duenomascota c) {
		return cD.findByNameDuenomascota(c);
	}
	
	@Override
	public void eliminar(int idDuenomascota) {
		cD.eliminar(idDuenomascota);
	}
}
