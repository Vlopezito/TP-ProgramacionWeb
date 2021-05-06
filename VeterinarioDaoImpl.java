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
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Veterinario veterinario) {
		try {
			em.persist(veterinario);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Veterinario> listar() {
		List<Veterinario> lista = new ArrayList<Veterinario>();
		try {
			Query q = em.createQuery("select c from Veterinario c"); 
			lista = (List<Veterinario>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idVeterinario) {
		Veterinario p = new Veterinario();
		try {
			p = em.getReference(Veterinario.class,idVeterinario); 
			em.remove(p);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
}
