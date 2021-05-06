package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Consultorio;

public interface IConsultorioService {
	public void insert(Consultorio consultorio);
	public List<Consultorio> list();
	public List<Consultorio> findByNameConsultorio(Consultorio c);
	public void eliminar(int idConsultorio);
}

