package com.blq.fr.gestionDesOffresBackend.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blq.fr.gestionDesOffresBackend.exception.UserNotFoundException;
import com.blq.fr.gestionDesOffresBackend.model.Negociant;
import com.blq.fr.gestionDesOffresBackend.repo.NegociantRepo;

@Service
@Transactional
public class NegociantService {
	
	private final NegociantRepo negociantRepo;

	@Autowired
	public NegociantService(NegociantRepo negociantRepo) {
		this.negociantRepo = negociantRepo;
	}
	
	public Negociant addNegociant(Negociant negociant) { 
		
		negociant.setNegociantCode(UUID.randomUUID().toString());
		
		return negociantRepo.save(negociant);
	}
	
	public List<Negociant> findAllNegociants() {
		
		return negociantRepo.findAll();
	}
	
	public Negociant updateNegociant(Negociant negociant) {
		
		return negociantRepo.save(negociant);
	}
	
	public Negociant findNegociantById(Long id) {
		
		return negociantRepo.findNegociantById(id)
				.orElseThrow( () -> new UserNotFoundException( "User by id " + id + " was not found" ) );
	}
	
	public void deleteNegociant(Long id) {
		
		negociantRepo.deleteNegociantById(id);
	}
	
	

}
