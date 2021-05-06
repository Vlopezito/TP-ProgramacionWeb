package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Consultorio;

public interface IConsultorioDao {
	public void insert(Consultorio consultorio);
	public List<Consultorio> list();
	public List<Consultorio> findByNameConsultorio(Consultorio c);
	public void eliminar(int idConsultorio );
}
