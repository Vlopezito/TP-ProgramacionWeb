package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDuenopetshopDao;
import pe.edu.upc.entity.Duenopetshop;

public class DuenopetshopDaoImpl implements IDuenopetshopDao, Serializable {
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Duenopetshop duenopetshop) {
		try {
			em.persist(duenopetshop);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Duenopetshop> listar() {
		List<Duenopetshop> lista = new ArrayList<Duenopetshop>();
		try {
			Query q = em.createQuery("select c from Duenopetshop c"); 
			lista = (List<Duenopetshop>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idDuenopetshop) {
		Duenopetshop p = new Duenopetshop();
		try {
			p = em.getReference(Duenopetshop.class,idDuenopetshop); 
			em.remove(p);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
}
