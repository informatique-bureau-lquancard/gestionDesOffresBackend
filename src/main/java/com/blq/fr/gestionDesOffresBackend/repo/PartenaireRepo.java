package com.blq.fr.gestionDesOffresBackend.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blq.fr.gestionDesOffresBackend.model.Partenaire;

public interface PartenaireRepo extends JpaRepository<Partenaire, Long> {

		void deletePartenaireById(Long id);
		
		Optional<Partenaire> findPartenaireById(Long id);
}
