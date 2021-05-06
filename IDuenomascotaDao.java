package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Duenomascota;

public interface IDuenomascotaDao {
	public void insert(Duenomascota duenomascota);
	public List<Duenomascota> list();
	public List<Duenomascota> findByNameDuenomascota(Duenomascota c);
	public void eliminar(int idDuenomascota );
}
