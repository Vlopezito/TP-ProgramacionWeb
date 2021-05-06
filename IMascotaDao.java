package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Mascota;

public interface IMascotaDao {
	public void insertar(Mascota mascota);
	public List<Mascota> listar();
	public void eliminar(int idMascota);
}
