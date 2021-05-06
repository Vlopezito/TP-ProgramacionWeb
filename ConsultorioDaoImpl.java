package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IConsultorioDao;
import pe.edu.upc.entity.Consultorio;

public class ConsultorioDaoImpl implements Serializable, IConsultorioDao{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Consultorio consultorio) {
		try {
		em.persist(consultorio);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Consultorio> list() {
		List<Consultorio> lista= new ArrayList<Consultorio>();
		try {
		Query q=em.createQuery("from Consultorio c");
		lista=(List<Consultorio>)q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Consultorio> findByNameConsultorio(Consultorio c) {
		List<Consultorio> lista= new ArrayList<Consultorio>();
		Query q=em.createQuery("from Consultorio c where c.b_nombre like ?1");
		q.setParameter(1, "%" + c.getNombre() + "%");
		lista=(List<Consultorio>)q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idConsultorio) {
		Consultorio p = new Consultorio();
		try {
			p = em.getReference(Consultorio.class,idConsultorio); 
			em.remove(p);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
