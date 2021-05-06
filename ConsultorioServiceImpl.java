package pe.edu.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IConsultorioDao;
import pe.edu.upc.entity.Consultorio;
import pe.edu.upc.service.IConsultorioService;

@Named 
@RequestScoped
public class ConsultorioServiceImpl implements IConsultorioService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IConsultorioDao cD;
	
	@Override
	public void insert(Consultorio consultorio) {
		cD.insert(consultorio);
	}
	
	@Override
	public List<Consultorio> list() {
		return cD.list();
	}
	
	@Override
	public List<Consultorio> findByNameConsultorio(Consultorio c) {
		return cD.findByNameConsultorio(c);
	}
	
	@Override
	public void eliminar(int idConsultorio) {
		cD.eliminar(idConsultorio);
	}
}
