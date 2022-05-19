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
import com.blq.fr.gestionDesOffresBackend.model.Partenaire;
import com.blq.fr.gestionDesOffresBackend.repo.PartenaireRepo;

@Service
@CacheConfig(cacheNames = {"partenaires_view"})
@Transactional
public class PartenaireService {
	
//	private static final Logger LOG = LoggerFactory.getLogger(PartenaireService.class);
	
	private final PartenaireRepo partenaireRepo;

	@Autowired
	public PartenaireService(PartenaireRepo partenaireRepo) {
		this.partenaireRepo = partenaireRepo;
	}
	
//	public Partenaire addPartenaire(Partenaire partenaire) { 
//		
//		partenaire.setPartenaireCode(UUID.randomUUID().toString());
//		
//		return partenaireRepo.save(partenaire);
//	}
	
	@Cacheable
	public List<Partenaire> findAllPartenaires() {
		
		System.out.println(partenaireRepo.findAll());
		
		return partenaireRepo.findAll();
	}
	
	public Partenaire updatePartenaire(Partenaire partenaire) {
		
		return partenaireRepo.save(partenaire);
	}
	
	public Partenaire findPartenaireById(Long id) {
		
		return partenaireRepo.findPartenaireById(id)
				.orElseThrow( () -> new UserNotFoundException( "User by id " + id + " was not found" ) );
	}
	
	public void deletePartenaire(Long id) {
		
		partenaireRepo.deletePartenaireById(id);
	}
	
	

}
