package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMascotaDao;
import pe.edu.upc.entity.Mascota;
import pe.edu.upc.service.IMascotaService;

@Named
@RequestScoped
public class MascotaServiceImpl implements IMascotaService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IMascotaDao mD;
	
	@Override
	public void insertar(Mascota mascota) {
		mD.insertar(mascota);
	}
	
	@Override
	public List<Mascota> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idMascota) {
		mD.eliminar(idMascota);
	}
}
