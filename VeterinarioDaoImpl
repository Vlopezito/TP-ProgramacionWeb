package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IVeterinarioDao;
import pe.edu.upc.entity.Veterinario;

public class VeterinarioDaoImpl implements IVeterinarioDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="b")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Veterinario veterinario) {
		em.persist(veterinario);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Veterinario> listar() {
		List<Veterinario> lista = new ArrayList<Veterinario>();
		Query q =em.createQuery("select v from Veterinario v");
		lista = (List<Veterinario>) q.getResultList();
		return lista;
	}

}
