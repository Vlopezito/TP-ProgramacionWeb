package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Veterinario;

public interface IVeterinarioService {
	public void insertar(Veterinario veterinario);
	public List<Veterinario> listar();
	public void eliminar(int idVeterinario);
}
