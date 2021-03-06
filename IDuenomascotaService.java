package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Duenomascota;

public interface IDuenomascotaService {
	public void insert(Duenomascota duenomascota);
	public List<Duenomascota> list();
	public List<Duenomascota> findByNameDuenomascota(Duenomascota c);
	public void eliminar(int idDuenomascota);
}

