package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Veterinario;

public interface IVeterinarioDao {
	public void insertar(Veterinario veterinario);
	public List<Veterinario> listar();
	
}
