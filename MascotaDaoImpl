package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMascotaDao;
import pe.edu.upc.entity.Mascota;

public class MascotaDaoImpl implements IMascotaDao, Serializable {
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Mascota mascota) {
		try {
			em.persist(mascota);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Mascota> listar() {
		List<Mascota> lista = new ArrayList<Mascota>();
		try {
			Query q = em.createQuery("select c from Mascota c"); 
			lista = (List<Mascota>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idMascota) {
		Mascota p = new Mascota();
		try {
			p = em.getReference(Mascota.class,idMascota); 
			em.remove(p);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
}
