package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Sucursal;

public interface ISucursalService {
	public void insertar(Sucursal sucursal);
	public List<Sucursal> listar();
	public void eliminar(int idSucursal);
}
