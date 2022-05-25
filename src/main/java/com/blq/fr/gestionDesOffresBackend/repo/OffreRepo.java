package com.blq.fr.gestionDesOffresBackend.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blq.fr.gestionDesOffresBackend.model.Offre;

public interface OffreRepo extends JpaRepository<Offre, Long> {
	
//public interface OffreRepo {
	
//	Offre getByName(String name);
	
//	void refreshAllProducts();
	
	void deleteOffreById(Long id);
	
	Optional<Offre> findOffreById(Long id);
}
