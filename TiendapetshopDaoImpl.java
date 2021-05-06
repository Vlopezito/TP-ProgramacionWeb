package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITiendapetshopDao;
import pe.edu.upc.entity.Tiendapetshop;

public class TiendapetshopDaoImpl implements Serializable, ITiendapetshopDao{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Tiendapetshop tiendapetshop) {
		try {
		em.persist(tiendapetshop);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tiendapetshop> list() {
		List<Tiendapetshop> lista= new ArrayList<Tiendapetshop>();
		try {
		Query q=em.createQuery("from Tiendapetshop c");
		lista=(List<Tiendapetshop>)q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Tiendapetshop> findByNameTiendapetshop(Tiendapetshop c) {
		List<Tiendapetshop> lista= new ArrayList<Tiendapetshop>();
		Query q=em.createQuery("from Tiendapetshop c where c.b_nombre like ?1");
		q.setParameter(1, "%" + c.getNombre() + "%");
		lista=(List<Tiendapetshop>)q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idTiendapetshop) {
		Tiendapetshop p = new Tiendapetshop();
		try {
			p = em.getReference(Tiendapetshop.class,idTiendapetshop); 
			em.remove(p);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
