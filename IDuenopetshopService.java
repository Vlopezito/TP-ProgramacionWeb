package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Duenopetshop;

public interface IDuenopetshopService {
	public void insertar(Duenopetshop duenopetshop);
	public List<Duenopetshop> listar();
	public void eliminar(int idDuenopetshop);
}
