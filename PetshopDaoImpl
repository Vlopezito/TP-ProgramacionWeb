package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPetShopDao;
import pe.edu.upc.entity.Petshops;

public class PetshopDaoImpl implements Serializable, IPetShopDao{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Petshops petshops) {
		em.persist(petshops);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Petshops> list() {
		List<Petshops> lista= new ArrayList<Petshops>();
		Query q=em.createQuery("from Petshops p");
		lista=(List<Petshops>)q.getResultList();
		return lista;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Petshops> findByNamePetshops(Petshops p) {
		List<Petshops> lista= new ArrayList<Petshops>();
		Query q=em.createQuery("from Petshops p where p.b_nombre like ?1");
		q.setParameter(1, "%" + p.getNombre() + "%");
		lista=(List<Petshops>)q.getResultList();
		return lista;
	}

}
