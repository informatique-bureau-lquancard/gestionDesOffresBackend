package com.blq.fr.gestionDesOffresBackend.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blq.fr.gestionDesOffresBackend.model.Negociant;

public interface NegociantRepo extends JpaRepository<Negociant, Long> {

		void deleteNegociantById(Long id);
		
		Optional<Negociant> findNegociantById(Long id);
}
