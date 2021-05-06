package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Sucursal;

public interface ISucursalDao {
	public void insertar(Sucursal sucursal);
	public List<Sucursal> listar();
	public void eliminar(int idSucursal);
}