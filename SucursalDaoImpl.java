package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISucursalDao;
import pe.edu.upc.entity.Sucursal;

public class SucursalDaoImpl implements ISucursalDao, Serializable {
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Sucursal sucursal) {
		try {
			em.persist(sucursal);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Sucursal> listar() {
		List<Sucursal> lista = new ArrayList<Sucursal>();
		try {
			Query q = em.createQuery("select c from Sucursal c"); 
			lista = (List<Sucursal>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idSucursal) {
		Sucursal p = new Sucursal();
		try {
			p = em.getReference(Sucursal.class,idSucursal); 
			em.remove(p);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
}
