package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Tiendapetshop;

public interface ITiendapetshopService {
	public void insert(Tiendapetshop tiendapetshop);
	public List<Tiendapetshop> list();
	public List<Tiendapetshop> findByNameTiendapetshop(Tiendapetshop c);
	public void eliminar(int idTiendapetshop);
}