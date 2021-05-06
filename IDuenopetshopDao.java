package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Duenopetshop;

public interface IDuenopetshopDao {
	public void insertar(Duenopetshop duenopetshop);
	public List<Duenopetshop> listar();
	public void eliminar(int idDuenopetshop);
}
