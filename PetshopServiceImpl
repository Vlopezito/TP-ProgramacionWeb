package pe.edu.upc.serviceimpl;


import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPetShopDao;
import pe.edu.upc.entity.Petshops;
import pe.edu.upc.service.IPetshopService;

@Named 
@RequestScoped
public class PetshopServiceImpl implements IPetshopService{

	@Inject
	private IPetShopDao pD;
	
	@Override
	public void insert(Petshops petshops) {
		pD.insert(petshops);
	}
	
	@Override
	public List<Petshops> list() {
		return pD.list();
	}
	
	@Override
	public List<Petshops> findByNamePetshops(Petshops p) {
		return pD.findByNamePetshops(p);
	}
}
