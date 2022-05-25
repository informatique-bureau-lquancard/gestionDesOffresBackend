package com.blq.fr.gestionDesOffresBackend.service;

import static com.blq.fr.gestionDesOffresBackend.GestionDesOffresBackendApplication.OFFRES_VIEW;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.blq.fr.gestionDesOffresBackend.exception.UserNotFoundException;
import com.blq.fr.gestionDesOffresBackend.model.Offre;
import com.blq.fr.gestionDesOffresBackend.repo.OffreRepo;

@Service(OFFRES_VIEW)
@CacheConfig(cacheNames = {OFFRES_VIEW})
@Transactional
public class OffreService {
	
	private final OffreRepo offreRepo;

	@Autowired
	public OffreService(OffreRepo offreRepo) {
		this.offreRepo = offreRepo;
	}
	
	@Cacheable
	public List<Offre> findAllOffres() {
		
		System.out.println(offreRepo.findAll());
		
		return offreRepo.findAll();
	}
	
//	@CacheEvict(value = "test", allEntries = true )
//	public void refreshAllProducts() {};
//	
//	public void slowDownLookupOperation() {
//		try {
//			
//			long time = 10000L;
//			Thread.sleep(time);
//			
//		} catch (Exception e) {
//			
//			findAll();
//			
//			throw new IllegalStateException(e);
//		}
//	}
	
//	public Offre updateOffre(Offre offre) {
//		
//		return offreRepo.save(offre);
//	}
	
	public Offre findOffreById(Long id) {
		
		return offreRepo.findOffreById(id)
				.orElseThrow( () -> new UserNotFoundException( "User by id " + id + " was not found" ) );
	}
	
	public void deleteOffre(Long id) {
		
		offreRepo.deleteOffreById(id);
	}
	
	

}
