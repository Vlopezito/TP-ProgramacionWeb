package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Mascota;

public interface IMascotaService {
	public void insertar(Mascota mascota);
	public List<Mascota> listar();
	public void eliminar(int idMascota);
}
