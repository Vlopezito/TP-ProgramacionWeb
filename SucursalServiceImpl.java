package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISucursalDao;
import pe.edu.upc.entity.Sucursal;
import pe.edu.upc.service.ISucursalService;

@Named
@RequestScoped
public class SucursalServiceImpl implements ISucursalService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ISucursalDao mD;
	
	@Override
	public void insertar(Sucursal sucursal) {
		mD.insertar(sucursal);
	}
	
	@Override
	public List<Sucursal> listar() {
		return mD.listar();
	}
	
	@Override
	public void eliminar(int idSucursal) {
		mD.eliminar(idSucursal);
	}
}
