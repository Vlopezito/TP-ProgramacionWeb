package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDuenomascotaDao;
import pe.edu.upc.entity.Duenomascota;

public class DuenomascotaDaoImpl implements Serializable, IDuenomascotaDao{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Duenomascota duenomascota) {
		try {
		em.persist(duenomascota);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Duenomascota> list() {
		List<Duenomascota> lista= new ArrayList<Duenomascota>();
		try {
		Query q=em.createQuery("from Duenomascota c");
		lista=(List<Duenomascota>)q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Duenomascota> findByNameDuenomascota(Duenomascota c) {
		List<Duenomascota> lista= new ArrayList<Duenomascota>();
		Query q=em.createQuery("from Duenomascota c where c.b_nombre like ?1");
		q.setParameter(1, "%" + c.getNombre() + "%");
		lista=(List<Duenomascota>)q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idDuenomascota) {
		Duenomascota p = new Duenomascota();
		try {
			p = em.getReference(Duenomascota.class,idDuenomascota); 
			em.remove(p);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
