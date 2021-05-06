package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IVeterinarioDao;
import pe.edu.upc.entity.Veterinario;
import pe.edu.upc.service.IVeterinarioService;

@Named
@RequestScoped
public class VeterinarioServiceImpl implements IVeterinarioService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IVeterinarioDao mD;
	
	@Override
	public void insertar(Veterinario veterinario) {
		mD.insertar(veterinario);
	}
	
	@Override
	public List<Veterinario> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idVeterinario) {
		mD.eliminar(idVeterinario);
	}
}
