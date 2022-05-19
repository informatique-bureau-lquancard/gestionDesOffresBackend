package com.blq.fr.gestionDesOffresBackend.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.blq.fr.gestionDesOffresBackend.exception.UserNotFoundException;
import com.blq.fr.gestionDesOffresBackend.model.Offre;
import com.blq.fr.gestionDesOffresBackend.repo.OffreRepo;

@Service
@CacheConfig(cacheNames = {"offre"})
@Transactional
public class OffreService {
	
	private final OffreRepo offreRepo;

	@Autowired
	public OffreService(OffreRepo offreRepo) {
		this.offreRepo = offreRepo;
	}
	
//	public Partenaire addPartenaire(Partenaire partenaire) { 
//		
//		partenaire.setPartenaireCode(UUID.randomUUID().toString());
//		
//		return partenaireRepo.save(partenaire);
//	}
	
	@Cacheable
	public List<Offre> findAllOffres() {
		
		System.out.println(offreRepo.findAll());
		
		return offreRepo.findAll();
	}
	
	public Offre updateOffre(Offre offre) {
		
		return offreRepo.save(offre);
	}
	
	public Offre findOffreById(Long id) {
		
		return offreRepo.findOffreById(id)
				.orElseThrow( () -> new UserNotFoundException( "User by id " + id + " was not found" ) );
	}
	
	public void deleteOffre(Long id) {
		
		offreRepo.deleteOffreById(id);
	}
	
	

}
